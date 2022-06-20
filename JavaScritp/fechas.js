//Fechas
const fecha= new Date()
console.log(fecha)
const fechaNac= new Date(1994,1,1)
console.log(fechaNac)
if( fecha > fechaNac){
    console.log("Hoy es mas tarde que tu fecha de Nac")
}else{
    console.log("Imposible")
}
mes=fechaNac.getMonth()+1
ano=fechaNac.getFullYear()
console.log("El mes de nac es: ",mes)
console.log("El año de nac es",ano)
