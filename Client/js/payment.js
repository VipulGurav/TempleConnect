let razorpay_payment_id;


let user = localStorage.getItem("user");
const jsonObj = JSON.parse(user);
var options = {
    "key": "rzp_test_U7vEPmmFFeROsH", // Enter the Key ID generated from the Dashboard
    "amount": "10000", // Amount is in currency subunits. Default currency is INR. Hence, 50000 refers to 50000 paise
    "currency": "INR",
    "name": "Temple Connect", //your business name
    "description": "Temple Connect",
    "image": "https://example.com/your_logo",
    "order_id": "", //This is a sample Order ID. Pass the `id` obtained in the response of Step 1
    "handler": function (response) {
        razorpay_payment_id = response.razorpay_payment_id;
        console.log(response.razorpay_payment_id);
        console.log(response.razorpay_order_id);
        console.log(response.razorpay_signature);
        savePaymentDetails();
    },
    "prefill": {
        "name": jsonObj.name,
        "contact": jsonObj.phoneNo
    },
    "theme": {
        "color": "#3399cc"
    }
};
var rzp1 = new Razorpay(options);
rzp1.on('payment.failed', function (response) {
    console.log(response.error.code);
    console.log(response.error.description);
    console.log(response.error.source);
    console.log(response.error.step);
    console.log(response.error.reason);
    console.log(response.error.metadata.order_id);
    console.log(response.error.metadata.payment_id);
});
const buttons = document.querySelectorAll('[id^="rzp-button"]');
let clickedBtn;
buttons.forEach((button) => {
    button.onclick = function (e) {
        clickedBtn = button.getAttribute('id').substring(10)
        rzp1.open();
        e.preventDefault();
    };
});


let placeObj = ["Dagdushet Ganpati", "Sri Balaji Mandir", "Saibaba Prati Shirdi", " Krishna Iskon"]

function savePaymentDetails() {

    let data = {
        paymentId: null,
        rPayId: razorpay_payment_id,
        amount: 500,
        userId: jsonObj.userId,
        placeId: 1,
        dateTime: new Date(),
        adultCount: 1,
        childCount: 0,
        placeName: placeObj[clickedBtn]
    };

    $.ajax({
        url: url + '/bookings/addUpdateBooking',
        method: 'POST',
        contentType: 'application/json',
        data: JSON.stringify(data),
        success: function (resp) {
            console.log(resp);
        },
        error: function (error) {
            console.error('There was a problem with the login request:', error);
        }
    });
}