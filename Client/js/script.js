
let loginBtn;
let logoutBtn;
let ticketsBtn;
let url = "http://localhost:8080"
window.addEventListener('load', function () {
    const isLoggedIn = localStorage.getItem("isLoggedIn")
    loginBtn = document.getElementById('login-btn');
    logoutBtn = document.getElementById('logout-btn');
    ticketsBtn = document.getElementById("ticketsbtn")
    if (isLoggedIn) {
        // User is logged in, show logout button
        logoutBtn.style.display = 'block';
        ticketsBtn.style.display = 'block';
        loginBtn.style.display = 'none';
    } else {
        // User is not logged in, show login button
        ticketsBtn.style.display = 'none';
        loginBtn.style.display = 'block';
        logoutBtn.style.display = 'none';
    }
});

function logout() {
    localStorage.removeItem("isLoggedIn");
    loginBtn.style.display = 'block';
    ticketsBtn.style.display = 'none';
    logoutBtn.style.display = 'none';
}

function login() {
    let username = document.getElementById('username').value;
    let password = document.getElementById('password').value;

    const data = {
        username: username,
        password: password
    };

    $.ajax({
        url: url + '/user/login',
        method: 'POST',
        contentType: 'application/json',
        data: JSON.stringify(data),
        success: function (response) {
            if (response != "Login Unsuccesful") {
                localStorage.setItem("user", JSON.stringify(response[0]));
                localStorage.setItem("isLoggedIn", true);
                logoutBtn.style.display = 'block';
                loginBtn.style.display = 'none';
                window.location.href = "index.html"
            }
        },
        error: function (error) {
            console.error('There was a problem with the login request:', error);
        }
    });
}

function signup() {
    let username = document.getElementById('username1').value;
    let password = document.getElementById('password1').value;
    let name = document.getElementById('name').value;
    let number = document.getElementById('number').value;

    if (password.length < 8) {
        alert("password should be more than 8 charecters");
        return;
    }
    if (number.length != 10) {
        alert(" Phone Number is not valid");
        return;
    }

    const data = {
        username: username,
        password: password,
        name: name,
        phoneNo: number
    };

    $.ajax({
        url: url + '/user/adduser',
        method: 'POST',
        contentType: 'application/json',
        data: JSON.stringify(data),
        success: function () {
            alert("User signup successfully!")
        },
        error: function (error) {
            console.error('There was a problem with the login request:', error);
        }
    });
}