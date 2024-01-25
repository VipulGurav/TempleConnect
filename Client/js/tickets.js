
let userObj;

window.addEventListener('load', function () {
    let user = localStorage.getItem("user");
    userObj = JSON.parse(user);
    getAllTicketsOfUser()

})



function getAllTicketsOfUser() {
    $.ajax({
        url: url + '/bookings/getBookingByUser/' + userObj.userId,
        method: 'GET',
        contentType: 'application/json',
        // data: JSON.stringify(data),
        success: function (response) {
            if (response.length > 0) {
                const data = response;
                const table = document.querySelector('.min-w-full tbody');
                data.map((item, index) => {
                    const row = table.insertRow();
                    const srNoCell = row.insertCell(0);
                    const nameCell = row.insertCell(1);
                    const placeNameCell = row.insertCell(2);
                    const dateCell = row.insertCell(3);
                    const viewTicketCell = row.insertCell(4);

                    srNoCell.innerText = index + 1;
                    nameCell.innerText = userObj.name;
                    dateCell.innerText = new Date(item.dateTime).toLocaleString();
                    placeNameCell.innerText = item.placeName;
                    viewTicketCell.innerHTML = `<a  id='barcode-btn${index}' class='text-white bg-green-500 border-0  px-6 focus:outline-none hover:bg-red-600 rounded text-lg'>View Ticket</a>`;
                });
            }
            let btn = document.querySelector('[id^="barcode-btn"]');
            btn.addEventListener('click', function () {
                getBarcode(btn.getAttribute('id').substring(11));
            });
        },
        error: function (error) {
            console.error('There was a problem with the login request:', error);
        }
    });
}

// Global object to store generated QR codes
var qrCodes = {};

function getBarcode(url) {
    console.log(url);
    url = "https://templeconnect/userticket/"+url

    // Check if a QR code has already been generated for the URL
    if (qrCodes[url]) {
        // Use the existing QR code
        var qrcode = qrCodes[url];
    } else {
        // Create a new QR code and store it in the global object
        var qrcode = new QRCode(document.getElementById("qrcode"), {
            text: url,
            width: 256,
            height: 256,
            colorDark: "#000000",
            colorLight: "#ffffff",
            correctLevel: QRCode.CorrectLevel.H
        });
        qrCodes[url] = qrcode;
    }
}
