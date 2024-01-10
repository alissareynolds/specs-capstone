const form = document.querySelector("registration-form");
const button = document.getElementById("register-button");

function buttonClicked() {
    const username = document.querySelector("#register-username");
    const password = document.querySelector("#register-password");
    const name = document.querySelector("#register-name");
    const email = document.querySelector("#register-email")
    let body = {
        "firstName": name.value,
        "email": email.value,
        "username": username.value,
        "password": password.value
    }
    registerRequest(body);
    location.replace("login.html");
}

function registerRequest(body) {
    axios.post(`${baseURL}/api/register`, body).then(({ data }) => { 
        userId = data.userId;
        localStorage.clear();
        localStorage.setItem("userId", JSON.stringify(userId));
    })
}

button.addEventListener("click", buttonClicked);


