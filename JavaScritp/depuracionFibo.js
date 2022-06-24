var x=0;
var y=1;
var z=0;
function fibo(num){

    for(i=0; i<num; i++) {
        z=x+y;
        console.log(x)
        x=y;
        y=z;
    }
        
}
fibo(9)
