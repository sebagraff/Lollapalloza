const app = Vue.createApp({
    data() {
        return {

        }
    },

    created() {

    },

    methods: {

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
