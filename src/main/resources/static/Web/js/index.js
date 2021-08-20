const app = Vue.createApp({
    data() {
        return {

        }
    },

    created() {

    },

    methods: {
        ticketsLoginButton(){
            window.location.href="login.html"
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
