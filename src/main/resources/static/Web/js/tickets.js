const app = Vue.createApp({
    data() {
        return {
            price: 0,
            date: "",
            numberCode: "",
            stock: 0,
            detail: "",
            info: "",


        }
    },

    created() {
        axios.get('/api/tickets')
            .then(res => {
                console.log(res)
                this.info = res.data
                console.log(this.info)
            })


    },

    methods: {
        ticketsLoginButton() {
            window.location.href = "login.html"
        },


    },

    computed: {


    }

})

app.mount("#app")

