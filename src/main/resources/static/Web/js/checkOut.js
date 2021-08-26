const app = Vue.createApp({
    data() {
        return {

        }
    },

    created() {
        axios.get("api/cart")
        .then(res=>{
            console.log(res)
        })
    },

    methods: {
    },

    computed: {

    }

})

app.mount("#app")