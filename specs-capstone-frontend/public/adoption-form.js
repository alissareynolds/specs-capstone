const form = document.querySelector("adoption-form-flex");
const button = document.getElementById("adoption-submit");

function buttonClicked() {
    const animalName = document.querySelector("#adp-name");
    const animalSpecies = document.querySelector("#adp-species");
    const fullName = document.querySelector("#adp-full-name");
    const phoneNumber = document.querySelector("#adp-number");
    const email = document.querySelector("#adp-email");
    const birthdate = document.querySelector("#adp-date");
    const occupation = document.querySelector("#adp-job");
    const address = document.querySelector("#adp-address");
    const city = document.querySelector("#city");
    const state = document.querySelector("#state");
    const zipCode = document.querySelector("#zip-code")
    const country = document.querySelector("#country");
    const hasPet = document.querySelector("#pet-boolean");
    let body = {
        "animalName": animalName.value,
        "animalSpecies": animalSpecies.value,
        "fullName": fullName.value,
        "phoneNumber": phoneNumber.value,
        "email": email.value,
        "birthdate": birthdate,
        "occupation": occupation.value,
        "address": address.value,
        "city": city.value,
        "state": state.value,
        "zipCode": zipCode.value,
        "country": country.value,
        "hasPet": hasPet.value
    }
    adoptionRequest(body);
    location.replace("index.html");
}

function adoptionRequest(body) {
    axios.post(`${baseURL}/api/adoption-form/add/${userId}`, body).then(({ data }) => { 
        userId = data.userId;
        localStorage.clear();
        localStorage.setItem("userId", JSON.stringify(userId));
    })
}

button.addEventListener("click", buttonClicked);
