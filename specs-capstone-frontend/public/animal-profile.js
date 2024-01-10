function getProfile(req) {
    const animalId = req;
    return axios.get(`${baseURL}/api/animals/profile/${animalId}`);
};

document.addEventListener('DOMContentLoaded', () => {
    const animalId = getQueryVariable('animalId');
    getProfile(animalId).then(result => {
        let profile = result.data
        displayProfile(profile);
    });
});

function displayProfile(animal) {
    let profileContainer = document.getElementById('profile-container');
    profileContainer.innerHTML = '';
    const profile = generateProfile(animal);
    profileContainer.appendChild(profile);
    console.log("animal", animal);
};

function generateProfile(animal) {
    const profile = document.createElement('article');

    profile.innerHTML = `

    <h1 class="profile-name">${animal.name}</h1>
    <img class="profile-thumbnail" src="${animal.thumbnail}">
    <section class="profile-bar"><h3 class="profile-breed">${animal.breed}</h3>
    <h3 class="profile-birthdate">${animal.birthdate}</h3>
    <h3 class="profile-color">${animal.color}</h3>
    <h3 class="profile-height">${animal.height}</h3>
    <h3 class="profile-weight">${animal.weight}</h3></section>
    
    <p class="profile-info">${animal.info}</p>
    
    `
    let pictures = getPictures(animal.animalId);
    console.log(pictures);

    let req = animal.animalId;
    console.log(req);

    getPictures(req).then(pictures => {
        pictures.forEach(pictureUrl => {
            const imageContainer = document.createElement('div');
            imageContainer.classList.add('profile-image');
            imageContainer.innerHTML = `
            <div class="profile-img-flex"><img class="profile-imgs" src="${pictureUrl}"/></div>        
            `;
            profile.appendChild(imageContainer);
        });
     });
    return profile;
};


function getQueryVariable(variable) {
    var query = window.location.search.substring(1);
    var vars = query.split("&");
    for (var i = 0; i < vars.length; i++) {
        var pair = vars[i].split("=");
        if (pair[0] == variable) { return pair[1]; }
    }
    return (false);
};

function getPictures(req) {
    const animalId = req;
    return axios.get(`${baseURL}/api/pictures/${animalId}`)
        .then(function (response) {
            let pictures = [];
            response.data.forEach(picture => {
                pictures.push(picture.url)
            });
            return pictures;
        });
 };

