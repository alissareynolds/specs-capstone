const baseURL = "http://localhost:8080"
let user = JSON.parse(localStorage.getItem("user"));

function displayCards(animals) {
    let container = document.getElementById('card-container');
    container.innerHTML = '';
    animals.forEach(animal => {
        const card = generateCard(animal);
        container.appendChild(card);
    });
};

function generateCard(animal) {

    let heartSrc;
    console.log(animal.favorite);
    if (animal.favorite) {
        heartSrc = "/images/heart-on.png";
    } else {
        heartSrc = "/images/heart-off.png"
    }

    const card = document.createElement('article');
    card.classList.add('animal-card');
    card.innerHTML = `
    
    <div class="animal-info">
    <img id="${animal.animalId}" src="${heartSrc}" class="heart">
    <h4 class="animal-name action">${animal.name}</h4>
        <p class="animal-breed">${animal.breed}</p>
    </div>
    <div class="animal-image container" >
        <img class="image" src="${animal.thumbnail}" alt="${animal.summary}">
        <div class="middle">
            <a href="animal-profile.html?animalId=${animal.animalId}">
            <button class="adopt-me")">
            Adopt Me!
            </button>
            </a>
            </div>
    </div>`

    let heartImage = card.querySelector('.heart');
    heartImage.addEventListener('click', () => {
        if (animal.favorite) {
            axios.delete(`http://localhost:8080/api/animals/favorite/${user.userId}/${animal.animalId}`).then(() => {
                heartImage.setAttribute("src", "/images/heart-off.png");
                animal.favorite = false;

            })
        } else {
            axios.post(`http://localhost:8080/api/animals/favorite/${user.userId}/${animal.animalId}`)
                .then(() => {
                    heartImage.setAttribute("src", "/images/heart-on.png");
                    animal.favorite = true;
                });
        }
    });
    return card;

}


function getFavorites() {
    return axios.get(`${baseURL}/api/animals/favorite/${user.userId}`);
};

document.addEventListener('DOMContentLoaded', () => {
    const userContainer = document.querySelector("#user-container");
    console.log(user);
    let favorite = document.querySelector("#favorites");
    if (user) {
        favorite.classList.remove("hidden");
        userContainer.innerText = user.first_name.toUpperCase();
        const button = document.createElement("button");
        button.id = "logout-button";
        button.innerText = "Logout"
        button.addEventListener("click", () => {
            localStorage.setItem("user", null);
            location.replace("login.html");
        })
        userContainer.appendChild(button);

    } else {
        favorite.classList.add("hidden");
    }
})

