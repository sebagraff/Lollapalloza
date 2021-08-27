const app = Vue.createApp({
    data() {
        return {
            musicbands: {},
            musicBandsAux: {},
            cart: [],
            inputSearch: "",
            currentClient: [],
            cart: [],

        }
    },

    created() {
        axios.get("http://localhost:8080/api/musicbands")
            .then(res => {
                this.musicbands = res.data
                this.musicBandsAux = this.musicbands.sort((a, b) => b.bandName - a.bandName)
                console.log(this.musicBandsAux);
            })

        axios.get("/api/clients/current")
            .then(res => {
                this.currentClient = res.data
                console.log(this.currentClient);

            })
            .catch(res => console.log(res.response))
        axios.get("/api/cart/")
            .then(res => {

                console.log(res.data)
                this.cart = res.data.productsInCart
                this.totalCart = res.data.totalPrice
            })
    },

    methods: {
    },

    computed: {

        logout() {
            axios.post('/api/logout')
                .then(response => window.location.href = "/index.html")
        },  
        
        filterArtist() {
            if (this.inputSearch != "") {
                this.musicBandsAux = this.musicbands.filter(artist => artist.bandName.toUpperCase().indexOf(this.inputSearch.toUpperCase()) !== -1)
            } else if (this.inputSearch == "") {
                this.musicBandsAux = this.musicbands
            }
        }

    }

})

app.mount("#app")

