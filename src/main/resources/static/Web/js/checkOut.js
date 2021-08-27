const app = Vue.createApp({
    data() {
        return {
            currentClient:0,
            carrito:[],
            subTotal:0,
            total:0,
            taxes:0,
        }
    },

    created() {
        axios.get("/api/clients/current")
            .then(res => {
                this.currentClient = res.data

            }).then(() => {
                axios.get("/api/cart/")
                    .then(qwer => {
                        qwer.data.productsInCart.forEach(item=>{
                            this.carrito.push(item)
                        })
                        this.ecuacionTotal;
                    })
            })
        
    },

    methods: {
        createPdf(){
            let table = document.getElementById("table")
            let doc = new jsPDF();

            doc.fromHTML(table, 15, 15)
            doc.text(10, 200, "Total:  $" + this.total)

            doc.save("factura.pdf")
        }
    },

    computed: {
        ecuacionTotal(){
            let suma=0;
            this.carrito.forEach(item=>{
                suma=suma+item.productPrice;
            })
            console.log(suma)
            this.subTotal=suma;
            this.taxes=(suma*0.1);
            this.total=suma+this.taxes;
        },
    },

})

app.mount("#app")