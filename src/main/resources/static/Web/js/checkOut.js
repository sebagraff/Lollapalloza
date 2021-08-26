const app = Vue.createApp({
    data() {
        return {
            currentClient:0,
            carrito=[],
        }
    },

    created() {
        axios.get("/api/clients/current")
            .then(res => {
                this.currentClient = res.data
                console.log(this.currentClient.id)

            }).then(() => {
                axios.get("/api/cart/" + this.currentClient.id)
                    .then(res => {
                        console.log(res.data.productsInCart)
                        this.carrito=res.data.productsInCart;
                    })
            })
    },

    methods: {/*
        subTotal(){
            this.
        }*/
    },

    computed: {
    },

})

app.mount("#app")