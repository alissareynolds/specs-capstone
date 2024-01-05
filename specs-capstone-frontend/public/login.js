const form = document.querySelector("login-form");
const button = document.getElementById("form-button");

function buttonClicked() {
    const username = document.querySelector("#username");
    const password = document.querySelector("#password");
    let body = {
        "username": username.value,
        "password": password.value
    }
    loginRequest(body);
}

function loginRequest(body) {
    axios.post(`${baseURL}/api/login`, body).then(({ data }) => { console.log(data);})

}

button.addEventListener("click", buttonClicked);
