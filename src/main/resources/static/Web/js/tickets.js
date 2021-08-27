const app = Vue.createApp({
    data() {
        return {
            price: 0,
            date: "",
            numberCode: "",
            stock: 0,
            detail: "",
            tickets: "",
            currentClient: "",

        }
    },
    created() {
        axios.get('/api/tickets')
            .then(res => {
                console.log(res)
                this.tickets = res.data
                console.log(this.tickets)
                // this.date = res.data.date.split
            })

        axios.get("/api/clients/current")
        .then(res => {
            this.currentClient = res.data;
            console.log(this.currentClient)
        })

    },
    methods: {
        ticketsLoginButton() {
            window.location.href = "login.html"
        },

        handlePushCarrito(ticket) {
            this.totalCart += ticket.price;
            console.log(this.totalCart)
            let ticketIndexCarrito = this.cart.findIndex(e => e.id == ticket.id)

            if (ticketIndexCarrito == -1) {
                this.cart.push({
                    "id": ticket.id,
                    "ticketName": ticket.name,
                    "ticketQuantity": 1,
                    "ticketPrice": ticket.price
                })
            } else {
                this.cart[ticketIndexCarrito].count += 1
                this.cart[ticketIndexCarrito].price += this.cart[ticketIndexCarrito].price
            }
            ticket.stock--

            localStorage.setItem("cart", JSON.stringify(this.cart))
            console.log(this.cart)

            // this.ticketsInCart = this.ticketsInCart.filter(e => e.ticketName != ticket.name)
            console.log(this.ticketsInCart)

            axios.put("/api/cart/" + this.currentClient.id,
                (this.cart)
            ).then(() => {
                console.log("agregado")
            })
        },

        splitForSpace(ticket) {
            let newArray = ticket.date.split(" ");
            let array = [];
            for(i=0;i<newArray.length;i++){
                if(newArray[i] == 27 || newArray[i] == 28|| newArray[i] == 29 || newArray[i] == 30){
                    array.push(newArray[i]);
                }
            }
            // console.log(array)
            // if(newArray.length > 1){
            //     let arr = newArray.splice(1,newArray.length,"y")
            //     console.log(arr)

            // }
            return array.join(", ");
        }

    },
    computed: {
    }
})
app.mount("#app")


