const array=["Marcos","Marcela","Mitia","Juan","Marcos","JavaScript"]
console.log(array)

const miSet= new Set(array)
console.log(miSet)

const datosPersonales = [
    {nombre:"Juan",apellido:"Crotta",edad:28,altura:1.80,eresDesarrollador:true}
]

let nuevaEdad = datosPersonales.map(function(element){
    return element.edad;
})
console.log("Mi edad es: ",nuevaEdad)

const datosAmigos = [
    {nombre:"Pedro", apellido:"Rancho",edad:32,altura:1.92, eresDesarrollador:false},
    {nombre:"Carlo", apellido:"Arurra",edad:24,altura:1.70, eresDesarrollador:true}
]

let datos = Object.values(datosPersonales);
let datos2 = Object.values(datosAmigos);
todosJuntos=[...datos,...datos2];
console.log(todosJuntos)

todosJuntos.sort((a, b) => a.edad-b.edad)
console.log(todosJuntos)
