class Estudiante {
    nombre;
    lista;

    constructor(nombre,lista=["Javascript"," HTML"," CSS"]){
        this.nombre=nombre;
        this.lista=lista;
    }
    obtenDatos() {
        console.log(`Hola soy ${this.nombre} y se sobre ${this.lista}`)
    }
}
const nuevo_estudiante= new Estudiante("Juan")
console.log(nuevo_estudiante)
nuevo_estudiante.obtenDatos()
