const app = Vue.createApp({
    data() {
        return {
            products: {},
            AuxProducts: {},
            inputSearch: "",
            cart: [],
            totalCart: 0,
            currentClient: "",
            productsInCart: []
        }
    },

    created() {
        axios.get("/api/products")
            .then(res => {
                this.products = res.data
                this.AuxProducts = this.products.sort((a, b) => b.price - a.price);

            })
        axios.get("/api/clients/current")
            .then(res => {
                this.currentClient = res.data
                console.log(this.currentClient.id)

            }).then(() => {
                axios.get("/api/cart/" + this.currentClient.id)
                    .then(res => {
                        console.log(res.data)
                    })
            })


    },

    methods: {
        handlePushCarrito(product) {
            this.totalCart += product.price;
            console.log(this.totalCart)
            let atriculoIndexCarrito = this.cart.findIndex(e => e.id == product.id)

            if (atriculoIndexCarrito == -1) {
                this.cart.push({
                    "id": product.id,
                    "name": product.name,
                    "count": 1,
                    "price": product.price
                })
            } else {
                this.cart[atriculoIndexCarrito].count += 1
                this.cart[atriculoIndexCarrito].price += this.cart[atriculoIndexCarrito].price
            }
            product.stock--



            localStorage.setItem("cart", JSON.stringify(this.cart))
            console.log(this.cart)

            // this.productsInCart = this.productsInCart.filter(e => e.productName != product.name)
            console.log(this.productsInCart)

            this.productsInCart.push({
                "productName": product.name,
                "productQuantity": 1,
                "productPrice": product.price
            })

            axios.put("/api/cart/" + this.currentClient.id,
                (this.productsInCart)
            ).then(res => {
                console.log("agregado")
            })


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