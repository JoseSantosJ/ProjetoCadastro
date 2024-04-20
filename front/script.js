const formulario = document.querySelector("form");
const INome = document.querySelector(".nome");
const IEmail = document.querySelector(".email");
const ISenha = document.querySelector(".senha");
const ITel = document.querySelector(".tel");

function cadastrar(){
fetch("http://localhost:8080/cadastrar",
    {
        headers:{
            'accept': 'application/json',
            'Content-Type': 'application/json' 
        },
        method: "POST",
        body: JSON.stringify({
            nome: INome.value ,
            email: IEmail.value ,
            senha: ISenha.value ,
            telefone: ITel.value
    
        })
    })
    .then(function (res){ console.log(res) })
    .catch(function (res) { console.log(res) })

};

function limpar(){
    INome.value = "" ,
    IEmail.value= "" ,
    ISenha.value= "" ,
    ITel.value= ""
}

formulario.addEventListener('submit', function (event) {
    event.preventDefault();

    cadastrar();
    //limpar();
});