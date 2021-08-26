const app = Vue.createApp({
    data() {
        return {
            price: 0,
            date: "",
            numberCode: "",
            stock: 0,
            detail: "",
            tickets: "",

        }
    },
    created() {
        axios.get('/api/tickets')
            .then(res => {
                console.log(res)
                this.tickets = res.data
                console.log(this.tickets)
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


