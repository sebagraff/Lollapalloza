const app = Vue.createApp({
    data() {
        return {
            products: {},
            AuxProducts: {},
            inputSearch: "",
            cart: [],
            totalCart: 0,
            currentClient: "",
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
                        this.cart = res.data.productsInCart
<<<<<<< HEAD
=======
                        console.log(this.cart)
>>>>>>> 3f5acad127c8f2b3dbd1bde5d08044ea6fd74ca2
                    })
            })


    },

    methods: {
        handlePushCarrito(product) {
<<<<<<< HEAD
            if (this.currentClient.user != null) {
                this.totalCart += product.price;
                console.log(this.totalCart)
                let atriculoIndexCarrito = this.cart.findIndex(e => e.id == product.id)

                if (atriculoIndexCarrito == -1) {
                    this.cart.push({
                        "id": product.id,
                        "productName": product.name,
                        "productQuantity": 1,
                        "productPrice": product.price
                    })
                } else {
                    this.cart[atriculoIndexCarrito].count += 1
                    this.cart[atriculoIndexCarrito].price += this.cart[atriculoIndexCarrito].price
                }
                product.stock--

=======
            this.totalCart += product.price;
            console.log(this.totalCart)
            let atriculoIndexCarrito = this.cart.findIndex(e => e.id == product.id)

            if (atriculoIndexCarrito == -1) {
                this.cart.push({
                    "id": product.id,
                    "productName": product.name,
                    "productQuantity": 1,
                    "productPrice": product.price
                })
            } else {
                this.cart[atriculoIndexCarrito].count += 1
                this.cart[atriculoIndexCarrito].price += this.cart[atriculoIndexCarrito].price
            }
            product.stock--
            axios.put("/api/products/" + product.id)
>>>>>>> 3f5acad127c8f2b3dbd1bde5d08044ea6fd74ca2


                localStorage.setItem("cart", JSON.stringify(this.cart))
                console.log(this.cart)

<<<<<<< HEAD
                // this.productsInCart = this.productsInCart.filter(e => e.productName != product.name)
                console.log(this.productsInCart)
=======
>>>>>>> 3f5acad127c8f2b3dbd1bde5d08044ea6fd74ca2



                axios.put("/api/cart/" + this.currentClient.id,
                    (this.cart)
                ).then(res => {
                    console.log("agregado")
                })

            }else{
                Swal.fire({
                    title: 'Por favor, inicie sesión',
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