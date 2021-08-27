const app = Vue.createApp({
    data() {
        return {
            artist: {},
            cart: [],
            currentClient: [],
            cart: [],

        }
    },

    created() {
        const urlSearchParams = new URLSearchParams(window.location.search);
        const myParam = Object.fromEntries(urlSearchParams.entries());
        axios.get("/api/viewBands/" + myParam.id)
        .then(res => {
            this.artist = res.data;
            console.log(this.artist);
        })
        .catch(err => console.log(err))

        axios.get("/api/clients/current")
            .then(res => {
                this.currentClient = res.data
                console.log(this.currentClient);

            }).then(() => {
                axios.get("/api/cart/" + this.currentClient.id)
                    .then(res => {
                        this.cart = res.data.productsInCart;
                    })
            }).catch(res => console.log(res.response))

    },

    methods: {
        logout() {
            axios.post('/api/logout')
                .then(response => window.location.href = "index.html")
        },  
    },

    computed: {
        

    }

})

app.mount("#app")