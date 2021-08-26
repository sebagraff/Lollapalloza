const app = Vue.createApp({
    data() {
        return {
        }
    },

    created() {

    },

    methods: {

        createPdf(){
            let body = document.getElementById("pdf")
            let doc = new jsPDF();
            doc.addImage(image, 'JPEG', 40, 180, 160)
            doc.text(100, 10, "Factura")
            doc.fromHTML(body ,10, 10);
            doc.save("Test.pdf")
        }

    },

    computed: {
    }

})

app.mount("#app");