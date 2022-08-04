public class Refact {
        public static void main(String[] args) {
            String[] vector= {"Juan","Pedro","Vale"};
            String con;
            String conC="";
            String conCa="";
            //for(String nombres : vector){
            //  System.out.println(nombres);
            for (int i = 0; i < vector.length; i++) {
                String nombres;
                con=vector[i];
                conC=con + " " + conC;
            }
            System.out.println(conC);

            for(String nombre : vector) {
                //mayor = mayor < vector[i] ? vector[i] : mayor;
                //menor = menor > vector[i] ? vector[i] : menor;
                con=nombre;
                conCa=con + " " + conCa;
            }
            System.out.println(conCa);
            // int mayor = Arrays.stream(numeros)
            //  .reduce(0, (a,b) -> a >b ? a:b);
        }
    }
