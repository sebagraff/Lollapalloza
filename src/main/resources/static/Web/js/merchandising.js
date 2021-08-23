const app = Vue.createApp({
    data() {
        return {
            products: {},
            AuxProducts: {},
            inputSearch: "",
            cart: [],
            totalCart:0,

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
            this.totalCart += product.price;
            console.log(this.totalCart)
            let atriculoIndexCarrito = this.cart.findIndex(e=> e.id == product.id )

            if(atriculoIndexCarrito == -1){
                this.cart.push({
                    "id": product.id,
                    "name": product.name,
                    "count": 1,
                    "price": product.price
                })
            }else{
                this.cart[atriculoIndexCarrito].count += 1
                this.cart[atriculoIndexCarrito].price += this.cart[atriculoIndexCarrito].price
            }
            product.stock--

            localStorage.setItem("cart" , JSON.stringify(this.cart))
        }
    },
    computed: {

        filterProducts() {
            if (this.inputSearch != "") {
                this.AuxProducts = this.products.filter(product => product.name.toUpperCase().indexOf(this.inputSearch.toUpperCase()) !== -1)
            }
        }
    }

})
app.mount("#app")