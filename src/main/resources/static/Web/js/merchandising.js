const app = Vue.createApp({
    data() {
        return {
            products: {},
            AuxProducts: {},
            inputSearch: "",
            cart: []
        }
    },

    created() {
        axios.get("http://localhost:8080/api/products")
            .then(res => {
                this.products = res.data
                console.log(this.products)
                this.AuxProducts = this.products.sort((a, b) => b.price - a.price);

            })
    },

    methods: {
        handlePushCarrito(product) {
            this.cart.push(product)
            console.log(this.cart)
            product.stock--
        }
    },
    computed: {
        filterProducts() {
            this.AuxProducts = this.products.filter(product => product.name.toUpperCase().indexOf(this.inputSearch.toUpperCase()) !== -1)
        }
    }

})
app.mount("#app")