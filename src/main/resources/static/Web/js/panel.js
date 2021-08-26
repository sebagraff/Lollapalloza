const app = Vue.createApp({
    data() {
        return {
            products: {},
            auxProducts: {},
            musicBands: {},
            nameProduct: "",
            price: "",
            stock: "",
            type: "",
            image: "",
            nameBand: "",
            genre: "",
            hour: "",
            description: "",
            imageBand: "",
            day: "",
            event: {},
            locations: {},
        }
    },

    created() {

        axios.get("/api/products")
            .then(res => {
                this.products = res.data
                this.auxProducts = this.products.sort((a, b) => b.price - a.price);
                console.log(this.auxProducts);
            })

        axios.get("/api/musicbands")
            .then(res => {
                this.musicBands = res.data
            })

        axios.get("/api/events")
        .then(res => {
            this.event = res.data;
            this.event.sort((a, b) => a.date - b.date)
        })
        axios.get("/api/location")
        .then(res => {
            this.locations = res.data;
        })

    },

    methods: {

        deleteProduct(product){
            axios.delete('/api/products/' + product.id).then(res => location.reload())
            
        },

        deleteArtist(band){
            axios.delete('/api/musicbands/' + band.id).then(res => location.reload())
        },

        addProduct(){
            axios.post("/api/products", {name: this.nameProduct, price: this.price, type: this.type, description: "", stock: this.stock, image: this.image})
            .then(res => location.reload());
        },

        addArtist(){
            axios.post("/api/musicbands", {bandName: this.nameBand, genre: this.genre, hour: this.hour, description: this.description, event: this.event[this.day], image: this.imageBand})
            .then(res => location.reload());
        },

        createPdf(){
            let doc = new jsPDF();

            doc.text(50, 50, "Hola");
            doc.save("Test.pdf")
        }

    },

    computed: {
        totalLocation(){
            return this.locations.reduce((acumulador, item) => acumulador + item.maximumCapacity, 0)
        }
    }

})

app.mount("#app");
