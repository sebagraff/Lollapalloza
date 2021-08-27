
let myCarousel = document.querySelector('#musicBandCarousel')
let carousel = new bootstrap.Carousel(myCarousel, {
    interval: 5000,
    wrap: true
})

const app = Vue.createApp({
    data() {
        return {
            bandsDayOne: [],
            bandsDayTwo: [],
            bandsDayThree: [],
            bandsDayFour: [],
            currentClient: {},
            cart: [],
        }
    },

    created() {


        axios.get("/api/musicbands")
            .then(res => {
                this.bandsDayOne = res.data.filter(e => e.eventDate == "JUEVES 27 DE MARZO").sort((a, b) => a.id - b.id)
                this.bandsDayTwo = res.data.filter(e => e.eventDate == "VIERNES 28 DE MARZO").sort((a, b) => a.id - b.id)
                this.bandsDayThree = res.data.filter(e => e.eventDate == "SABADO 29 DE MARZO").sort((a, b) => a.id - b.id)
                this.bandsDayFour = res.data.filter(e => e.eventDate == "DOMINGO 30 DE MARZO").sort((a, b) => a.id - b.id)

                console.log(this.bandsDayOne)
                console.log(this.bandsDayTwo)
                console.log(this.bandsDayThree)
                console.log(this.bandsDayFour)

            })

            axios.get("/api/clients/current")
            .then(res => {
                this.currentClient = res.data
                console.log(this.currentClient);

            }).then(() => {
                axios.get("/api/cart/" + this.currentClient.id)
                    .then(res => {
                        this.cart = res.data.productsInCart;
                    })
            }).catch(res => console.log(res.response))
    },

    methods: {
        splitForSpace(index, date) {
            let newArray = date.split(" ")
            return newArray[index]
        },
        goToTicketsPage(){
            window.location.href="tickets.html"
        }

    },
    computed: {
    }
})

app.mount("#app")

