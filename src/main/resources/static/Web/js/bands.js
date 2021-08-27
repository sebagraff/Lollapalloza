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

            }).then(() => {
                axios.get("/api/cart/" + this.currentClient.id)
                    .then(res => {
                        this.cart = res.data;
                        console.log(this.cart.productsInCart);
                    })
            }).catch(res => console.log(res.response))

    },

    methods: {
    },

    computed: {
        filterArtist() {
            if (this.inputSearch != "") {
                this.musicBandsAux = this.musicbands.filter(artist => artist.bandName.toUpperCase().indexOf(this.inputSearch.toUpperCase()) !== -1)
            }else if(this.inputSearch == ""){
                this.musicBandsAux = this.musicbands
            }
        }

    }

})

app.mount("#app")

