const baseURL = "http://localhost:8080"
let userId = 0;

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
    if (animal.isfavorite) {
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
    return card;
}