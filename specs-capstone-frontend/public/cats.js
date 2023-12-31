document.addEventListener('DOMContentLoaded', () => {
    axios.get(`${baseURL}/api/species/Cat`)
    .then(({ data }) => {
        let cats = data
        console.log(cats);
        displayCards(cats);
    })
});

