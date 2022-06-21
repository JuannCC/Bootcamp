function lista() {
    return true;
}
console.log(lista())

/*/const miPromesa = new Promise((resolve,reject) => {
    if(true) {
        setTimeout(5,5)
        resolve()
    }else{
        setTimeout(5,5)
        reject()
    }
})

miPromesa
    .then(() => console.log("Se ha ejectuado") )
    .catch(() => console.log("ERROR"))
/*/

console.log("Tiempo: ")

function asincrona() {
    console.log("Hola soy una promesa") ;
}

setTimeout(asincrona,5000)

function* generaId() {
    let id=0;
    while(true) {
        id++
        yield id*2
        if (id >= 10) {
            return id*2
        }
    }
}

const gen = generaId();

console.log(gen.next())
console.log(gen.next())
console.log(gen.next())
console.log(gen.next())
console.log(gen.next())
console.log(gen.next())
console.log(gen.next())
console.log(gen.next())
console.log(gen.next())
console.log(gen.next())
console.log(gen.next())
