const app = Vue.createApp({
    data() {
        return {
            products: {},
            AuxProducts: {},
            inputSearch:"",
            cart:[]
        }
    },

    created() {
        axios.get("http://localhost:8080/api/products")
        .then(res =>{
            this.products = res.data
            this.AuxProducts = this.products;
        })
    },
    
    methods: {
        handlePushCarrito(product){
            this.cart.push(product)
            product.stock--
        }
    },
    computed: {
        filterProducts(){
           this.AuxProducts = this.products.filter(product => product.name.toUpperCase().indexOf(this.inputSearch.toUpperCase()) !== -1)
        }
    }

})
app.mount("#app")