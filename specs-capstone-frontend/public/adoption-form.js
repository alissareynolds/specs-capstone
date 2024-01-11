const form = document.querySelector("adoption-form-flex");
const button = document.getElementById("adoption-submit");

function buttonClicked() {
    const animalName = document.querySelector("#adp-name");
    const animalBreed = document.querySelector("#adp-species");
    const fullName = document.querySelector("#adp-full-name");
    const phoneNumber = document.querySelector("#adp-number");
    const email = document.querySelector("#adp-email");
    const birthdate = document.querySelector("#adp-date");
    const occupation = document.querySelector("#adp-job");
    const streetAddress = document.querySelector("#adp-address");
    const city = document.querySelector("#city");
    const state = document.querySelector("#state");
    const zipCode = document.querySelector("#zip-code")
    const country = document.querySelector("#country");
    const hasPet = document.querySelector("#pet-boolean");
    let body = {
        "animalName": animalName.value,
        "animalBreed": animalBreed.value,
        "fullName": fullName.value,
        "phoneNumber": phoneNumber.value,
        "email": email.value,
        "birthdate": birthdate.value,
        "occupation": occupation.value,
        "streetAddress": streetAddress.value,
        "city": city.value,
        "state": state.value,
        "zipCode": zipCode.value,
        "country": country.value,
        "hasPet": hasPet.value === "yes"
    }
    adoptionRequest(body);
    location.replace("index.html");
    alert("You submitted an adoption form!");
}

function adoptionRequest(body) {
    axios.post(`${baseURL}/api/adoption-form/add/${user.userId}`, body).then(({ data }) => { 
    })
}

button.addEventListener("click", buttonClicked);
