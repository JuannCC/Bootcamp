lista=["Leche", "Huevos", "Carne", "Pan", "Verduras"]
lista.push("Aceite de Girasol")
console.log(lista)
lista.splice(5)
console.log(lista)
var pelicula = [
    {titulo: "Top Gun", director:"Joseph Kosinski", fecha:2022},
    {titulo: "Jurasksic World", director:"Colin Trevorrow", fecha:1999},
    {titulo: "El Padrino", director:"Tarantino", fecha:1966}
]
const nuevasPel= pelicula.filter(obj => {
    if (obj.fecha > 2010){
        return true
    } else {
        return false
    }
})
console.log("Peliculas a partir del 2010: ",nuevasPel)

let directores = pelicula.map(function(element){
    return element.director;
});
console.log("Directores: ",directores)

let titulos = pelicula.map(function(element){
    return element.titulo;
});
console.log("Titulos: ",titulos)

vector1= directores.concat(titulos)
console.log("Concat: ",vector1)

vector2= [...directores,...titulos]
console.log("Factor de propag: ",vector2)
