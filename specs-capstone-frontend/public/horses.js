document.addEventListener('DOMContentLoaded', () => {
    axios.get(`${baseURL}/api/species/Horse`)
    .then(({ data }) => {
        let horses = data
        console.log(horses);
        displayCards(horses);
    })
});