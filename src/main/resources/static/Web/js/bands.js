const app = Vue.createApp({
    data() {
        return {
            musicbands: {},
            musicBandsAux: {},
            cart: [],
            inputSearch: "",

        }
    },

    created() {
        axios.get("http://localhost:8080/api/musicbands")
            .then(res => {
                this.musicbands = res.data
                this.musicBandsAux = this.musicbands.sort((a, b) => b.bandName - a.bandName)
                console.log(this.musicBandsAux);
            })

    },

    methods: {
    },

    computed: {
        filterArtist() {
            if (this.inputSearch != "") {
                this.musicBandsAux = this.musicbands.filter(artist => artist.bandName.toUpperCase().indexOf(this.inputSearch.toUpperCase()) !== -1)
            }
        }

    }

})

app.mount("#app")


let myCarousel = document.querySelector('#musicBandCarousel')
let carousel = new bootstrap.Carousel(myCarousel, {
    interval: 5000,
    wrap: true
})