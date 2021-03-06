const app = Vue.createApp({
    data() {
        return {
            products: {},
            AuxProducts: {},
            inputSearch: "",
            cart: [],
            totalCart: 0,
            currentClient: [],
        }
    },

    created() {
        axios.get("/api/products")
            .then(res => {
                this.products = res.data
                this.AuxProducts = this.products.sort((a, b) => b.price - a.price);
                console.log(this.AuxProducts);

            })
        axios.get("/api/clients/current")
            .then(res => {
                this.currentClient = res.data
                console.log(this.currentClient);

            }).then(() => {
                axios.get("/api/cart/")
                    .then(res => {

                        console.log(res.data)
                        this.cart = res.data.productsInCart
                        this.totalCart = res.data.totalPrice
                    })
            })
            .catch(res => console.log(res.response))

    },

    methods: {
        logout() {
            axios.post('/api/logout')
                .then(response => window.location.href = "index.html")
        },  
        
        handlePushCarrito(product) {

            if (this.currentClient.user != null) {
                this.totalCart += product.price;
                let atriculoIndexCarrito = this.cart.findIndex(e => e.id == product.id)





                if (atriculoIndexCarrito == -1) {
                    this.cart.push({
                        "id": product.id,
                        "productName": product.name,
                        "productQuantity": 1,
                        "productPrice": product.price
                    })
                } else {
                    this.cart[atriculoIndexCarrito].productQuantity += 1
                }
                product.stock--

                axios.put("/api/products/", "id=" + product.id)

                axios.put("/api/cart/" + this.currentClient.id,
                    (this.cart)
                ).then(res => {
                    console.log("agregado")
                })

                axios.post("/api/cart/" + this.currentClient.id + "/totalPrice", "totalPrice=" + this.totalCart)

            } else {
                Swal.fire({
                    title: 'Por favor, inicie sesi??n',
                })

            }


            console.log(this.cart)

        }
    },

    computed: {

        filterProducts() {
            if (this.inputSearch != "") {
                this.AuxProducts = this.products.filter(product => product.name.toUpperCase().indexOf(this.inputSearch.toUpperCase()) !== -1)
            } else if (this.inputSearch == "") {
                this.AuxProducts = this.products
            }
        }
    }

})
app.mount("#app")