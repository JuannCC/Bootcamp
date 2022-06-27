let marker, map;

function initMap() {
    const posicion= {
        lat: -25.363,
        lng: 131.044
    }

    const map = new google.maps.Map(document.getElementById("map"), {
        zoom:4,
        center:posicion
    })

    const marker = new google.maps.Marker({
        position: posicion,
        map,
        title:"Posicion inicial"
    })

    const marker1 = new google.maps.Marker({
        position: {lat: -33.1091705, lng: -64.34902},
        map,
        title:"ARG"
    })
    const marker2 = new google.maps.Marker({
        position: {lat: 43.891754, lng: 12.292370},
        map,
        title:"ITA"
    })
    const marker3 = new google.maps.Marker({
        position: {lat: -36.891981, lng: 174.761221},
        map,
        title:"NWZ"
    })
    //Geolocalizacion
    //marker.setPosition({lat,lng})
    geoPosiciona()
}

function geoPosiciona(){
    if(navigator.geolocation){
        const geoLoc = navigator.geolocation
        const options={timeout:60000}
        const watchPos = geoLoc.watchPosition(centraMapa, onError, options)

    } else {
        alert("Tu navegador no admite GEO")
    }
    
}
function centraMapa(position){
    const nuevaPos= {
        lat: position.coords.latitude,
        lng: position.coords.longitude
    }
    console.log(nuevaPos)
    marker.setPosition(nuevaPos)
    map.setCenter(nuevaPos)

}
function onError(error){
    console.error(error)
}
