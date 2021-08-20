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
            product.stock--
        }
    },
    computed: {


        filterProducts() {
<<<<<<< HEAD
            this.AuxProducts = this.products.filter(product => product.name.toUpperCase().indexOf(this.inputSearch.toUpperCase()) !== -1).sort((a, b) => b.price - a.price)
=======
            if(this.inputSearch != ""){
                this.AuxProducts = this.products.filter(product => product.name.toUpperCase().indexOf(this.inputSearch.toUpperCase()) !== -1)
            }
>>>>>>> bb52d47ed3075261bab56b770c279619f405684b
        }
    }

})
app.mount("#app")