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
        axios.get("/api/viewBands/" + myParam.id)
        .then(res => {
            this.artist = res.data;
            console.log(this.artist);
        })
        .catch(err => console.log(err))

    },

    methods: {
    },

    computed: {
        

    }

})

app.mount("#app")