
const app = Vue.createApp({
    data() {
        return {
            user: "",
            password: "",
            userRegister: "",
            passwordRegister: "",
        }
    },

    created() {

    },

    methods: {
    
        login() {


            axios.post('/api/login', 'user=' + this.user + '&password=' + this.password)

                .then(console.log("entro")).then(res => window.location.href="/Web/index.html")

        },

        register(){
            axios.post("/api/clients", "user=" + this.userRegister + "&password=" + this.passwordRegister)
                .then(res => Swal.fire('Ahora por favor, inicie sesión'))
                .then(res => window.location.href="/Web/login.html")
                .catch(res =>  Swal.fire('Ya existe el usuario'))
        }
    },

    computed: {


    }

})

app.mount("#app")

let form_login = document.querySelector(".form__login")
let form_register = document.querySelector(".form__register")
let container_login_register = document.querySelector(".container__login-register")
let back_box_login = document.querySelector(".back__box-login")
let back_box_register = document.querySelector(".back__box-register")
let back__box = document.querySelector(".back__box")

window.addEventListener("resize", widthPage);

function widthPage() {
    if (window.innerWidth > 850) {
        back_box_login.style.display = "block";
        back_box_register.style.display = "block";
        back__box.style.background = "linear-gradient(0.25turn, #00af9a, #ff4034)"
    } else {
        back_box_register.style.display = "block";
        back_box_register.style.opacity = "1";
        back_box_login.style.display = "none";
        form_login.style.display = "block";
        form_register.style.display = "none";
        container_login_register.style.left = "0";
        back__box.style.background = "linear-gradient(1.5turn, #00af9a, #ff4034)";
    }
}

widthPage();

/* Cuando se clickea, cambia de lugar */
const singIn = () => {

    if (window.innerWidth > 850) {
        form_register.style.display = "none";
        container_login_register.style.left = "10px";
        form_login.style.display = "block";
        back_box_register.style.opacity = "1";
        back_box_login.style.opacity = "0";
    } else {
        form_register.style.display = "none";
        container_login_register.style.left = "0px";
        form_login.style.display = "block";
        back_box_register.style.display = "block";
        back_box_login.style.display = "none";
    }
}

/* Cuando se clickea cambia de lugar */
const register = () => {
    if (window.innerWidth > 850) {
        form_register.style.display = "block";
        container_login_register.style.left = "410px";
        form_login.style.display = "none";
        back_box_register.style.opacity = "0";
        back_box_login.style.opacity = "1";
    } else {
        form_register.style.display = "block";
        container_login_register.style.left = "0px";
        form_login.style.display = "none";
        back_box_register.style.display = "none";
        back_box_login.style.display = "block";
        back_box_login.style.opacity = "1";
    }
}
