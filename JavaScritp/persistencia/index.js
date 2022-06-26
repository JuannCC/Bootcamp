var nombre="Juan"
var apellido="Crotta"

const miNombre= ({nombre:"Juan", edad:28})

//localStorage.setItem("nombre", "Juan")
//localStorage.setItem("nombre", "Ale")

//sessionStorage.setItem("nombre-sesion", "Gorka")

sessionStorage.setItem("persona", JSON.stringify(miNombre))

console.log(JSON.parse(sessionStorage.getItem("persona")))


console.log(localStorage.getItem("nombre"))

localStorage.setItem("persona2", JSON.stringify(miNombre))

console.log(JSON.parse(localStorage.getItem("persona2")))

//JSON.stringify -> Convierte un objeto/array en string
//JSON.parse -> Convierte un obj/arrar que fue convert en stringify en un objeto de Javascript

//localStorage.removeItem("nombre")

document.cookie= "nombreCookie=(Mi-nombre)"
//document.cookie= "nombreCaducidad=Nombre; expires=" + new Date(2023,10,1).toUTCString()
document.cookie= "nombreCaducidad=miNombre"; "expires=" + new Date(2023,10,1).toUTCString()


function createCookie(name,value,minutes) {
    if (minutes) {
        var date = new Date();
        date.setTime(date.getTime()+(minutes*60*1000));
        var expires = "; expires="+date.toGMTString();
    } else {
        var expires = "";
    }
    document.cookie = name+"="+value+expires+"; path=/";
}
createCookie("Name", "Juan Crotta", 2)
