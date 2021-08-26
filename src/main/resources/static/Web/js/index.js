const app = Vue.createApp({
    data() {
        return {
            price: 0,
            date: "",
            numberCode: "",
            stock: 0,
            detail: "",

            info: "",

            bandsDayOne: []
        }
    },

    created() {
        axios.get('/api/tickets')
            .then(res => {
                console.log(res)
                this.info = res.data
                console.log(this.info)
            })

        axios.get("/api/musicbands")
            .then(res => {
                this.bandsDayOne = res.data.filter(e => e.eventDate == "JUEVES 27 DE MARZO").sort((a, b) => a.id - b.id)
                this.bandsDayTwo = res.data.filter(e => e.eventDate == "VIERNES 28 DE MARZO")
                this.bandsDayThree = res.data.filter(e => e.eventDate == "SABADO 29 DE MARZO")
                this.bandsDayFour = res.data.filter(e => e.eventDate == "DOMINGO 30 DE MARZO")

                console.log(this.bandsDayOne)
                console.log(this.bandsDayTwo)
                console.log(this.bandsDayThree)
                console.log(this.bandsDayFour)

            })
    },

    methods: {
        ticketsLoginButton() {
            window.location.href = "login.html"
        }
    },

    computed: {


    }

})

app.mount("#app")


let myCarousel = document.querySelector('#musicBandCarousel')
let carousel = new bootstrap.Carousel(myCarousel, {
    interval: 5000,
    wrap: true
})
