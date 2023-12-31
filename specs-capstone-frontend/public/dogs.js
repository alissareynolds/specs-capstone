document.addEventListener('DOMContentLoaded', () => {
    axios.get(`${baseURL}/api/species/Dog`)
    .then(({ data }) => {
        let dogs = data
        console.log(dogs);
        displayCards(dogs);
    })
});