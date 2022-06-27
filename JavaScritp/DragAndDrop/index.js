const parrafos=document.querySelectorAll(".parrafo")
const secciones=document.querySelectorAll(".seccion")
const imagenes=document.querySelectorAll(".imagen")

parrafos.forEach(parrafo => {
    parrafo.addEventListener("dragstart", event => {
        console.log("Estoy arrastrando el parrafo: "+ parrafo.innerText)
        parrafo.classList.add("dragging")
        event.dataTransfer.setData("id", parrafo.id)

    })
        parrafo.addEventListener("dragend", () => {
            //console.log("Finalice el arrastre")
            parrafo.classList.remove("dragging")
            
    })
})

secciones.forEach(seccion => {
    seccion.addEventListener("dragover", event => {
        event.preventDefault()
        //console.log("Drag Over")
    })

    seccion.addEventListener("drop", ()=> {
        console.log("Drop")
        const id_parrafo = event.dataTransfer.getData("id")
        //console.log("Parrafo id: ", id_parrafo)
        const parrafo= document.getElementById(id_parrafo)
        seccion.append(parrafo)
    })
})

imagenes.forEach(imagen => {
    imagen.addEventListener("dragenter", e =>{
    e.preventDefault()
    console.log("ENTRO")
    
    })
})
