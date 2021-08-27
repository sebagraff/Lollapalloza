const app = Vue.createApp({
    data() {
        return {
            price: 0,
            date: "",
            numberCode: "",
            stock: 0,
            detail: "",
            tickets: "",
            currentClient: [],
            cart: [],

        }
    },
    created() {
        axios.get('/api/tickets')
            .then(res => {
                console.log(res)
                this.tickets = res.data
                console.log(this.tickets)
            })

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
        logout() {
            axios.post('/api/logout')
                .then(response => window.location.href = "index.html")
        },

        ticketsLoginButton() {
            window.location.href = "login.html"
        },

        addToCart(product) {
            console.log(product)
            if (this.currentClient.user != null) {
                this.totalCart += product.price;
                let atriculoIndexCarrito = this.cart.findIndex(e => e.id == product.id)





                if (atriculoIndexCarrito == -1) {
                    this.cart.push({
                        "id": product.id,
                        "productName": "Ticket" + " " + product.date + " " + product.sede,
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
                    title: 'Por favor, inicie sesión',
                })
            }
        },

        splitForSpace(ticket) {
            let newArray = ticket.date.split(" ");
            let array = [];
            for (i = 0; i < newArray.length; i++) {
                if (newArray[i] == 27 || newArray[i] == 28 || newArray[i] == 29 || newArray[i] == 30) {
                    array.push(newArray[i]);
                }
            }
            return array.join(", ");
        }

    },
    computed: {
    }
})
app.mount("#app")


