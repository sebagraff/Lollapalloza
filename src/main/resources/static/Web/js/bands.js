const app = Vue.createApp({
    data() {
        return {
            musicbands: {},
            cart: [],

        }
    },

    created() {
        axios.get("http://localhost:8080/api/musicbands")
            .then(res => {
                this.musicbands = res.data
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