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
                this.AuxProducts = this.products.sort((a, b) => b.price - a.price);
            })
    },
    
    methods: {
        handlePushCarrito(product) {
            this.cart.push(product)
            product.stock--
        }
    },
    computed: {
<<<<<<< HEAD
=======

>>>>>>> 00666c1e28bc0fb2f0a3d2b47e0e1879fa926b75

        filterProducts() {
            if(this.inputSearch != ""){
                this.AuxProducts = this.products.filter(product => product.name.toUpperCase().indexOf(this.inputSearch.toUpperCase()) !== -1)
            }
        }
    }

})
app.mount("#app")