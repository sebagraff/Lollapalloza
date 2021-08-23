const app = Vue.createApp({
    data() {
        return {
            artist: {},
            cart: [],

        }
    },

    created() {
        const urlSearchParams = new URLSearchParams(window.location.search);
        const myParam = Object.fromEntries(urlSearchParams.entries());
        axios.get("/api/musicbands/" + myParam.id)
        .then(res => {
            this.artist = res.data;
        })
        .catch(err => console.log(err))

    },

    methods: {
    },

    computed: {
        

    }

})

app.mount("#app")