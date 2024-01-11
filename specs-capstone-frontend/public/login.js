let form;
let button;

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
    axios.post(`${baseURL}/api/login`, body).then(({ data }) => {
        if (data.status = 201) {
            user = data;
            localStorage.clear();
            localStorage.setItem("user", JSON.stringify(user));
            location.replace("index.html");
        }
    }).catch((error) => {
        const errorMessage = document.querySelector("#error-message");
        errorMessage.innerText = error.response.data.message;
        console.log(error);
    })

}

document.addEventListener('DOMContentLoaded', () => {
    form = document.querySelector("#login-form");
    button = document.getElementById("form-button");
    button.addEventListener("click", buttonClicked);
})
