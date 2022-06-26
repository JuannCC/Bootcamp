const f=document.getElementById("formulario")
console.log(f)
const boton = document.querySelector("#btn")

f.addEventListener("submit", event => {
    console.log(event)
    event.preventDefault()
})


boton.addEventListener("click", () =>{
    //alert("Click en el boton") && console.log("Hola estoy utilizando jQuery")
    const respuesta = confirm ("Seguro?")
    if (respuesta){
        console.log("Estas de acuerdo") 
    } else {
        console.log("NO estas de acuerdo")
    }
})

/*$(document).ready(()=>){
    
})

$(".hide-btn").click(() => {
    console.log("Hola estoy utilizando jQuery")
})

$(".hide-btn").click(() => {
    $("h1").hide()
})
*/
