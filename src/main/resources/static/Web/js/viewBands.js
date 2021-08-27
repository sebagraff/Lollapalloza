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

            }).catch(res => console.log(res.response))
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


    }

})

app.mount("#app")