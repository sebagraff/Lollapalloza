const app = Vue.createApp({
    data() {
        return {
            currentClient:0,
            carrito:{lista:[]},
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
                axios.get("/api/cart/" + this.currentClient.id)
                    .then(qwer => {
                        //res.data.productsInCart.forEach(item=>this.carrito.push(item));
                        /*this.carrito = Object.values(qwer.data.productsInCart);
                        console.log(this.carrito)*/
                        //console.log(qwer.data.productsInCart)
                        let caca=[]
                        qwer.data.productsInCart.forEach(item=>{
                            caca.push(item)
                        })
                        this.carrito.lista=(caca)
                        console.log(this.carrito.lista)
                    })
            })
        .then(this.ecuacionTotal)
    },

    methods: {
        
    },

    computed: {
        ecuacionTotal(){
            let suma=0;
            for(let i=0;i<this.carrito.length;i++){
                console.log(this.carrito);
            }
            console.log(suma)
            this.subTotal=suma;
            this.taxes=(suma*0.1);
            this.total=suma+this.taxes;
        }
    },

})

app.mount("#app")