import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

import static java.lang.String.valueOf;

public class main {
    String texto;
    public static String reverse(String texto) {
        String reve="";

        for (int i=texto.length()-1;i >= 0;i--){
            reve= valueOf(texto.charAt(i));
            System.out.print(reve);
        }
        return reve;
    }
    public static void main(String[] args) {
        reverse("Hola mundo");

//--------ARRAY UNIDIM--------------------------------------
        System.out.println("");

        String[] arrayUni = new String[]{"Juan","Pedro","Carlo"};
        for (String nombre: arrayUni){
            System.out.println(nombre);
        }
//--------ARRAY BIDI---------------------------------------------
        int[][] arrayBidi = new int[2][2];
        arrayBidi[0][0]=1;
        arrayBidi[0][1]=2;
        arrayBidi[1][0]=3;
        arrayBidi[1][1]=4;

        for (int i=0;i < arrayBidi.length;i++){
            for (int j=0;j < arrayBidi[1].length;j++){
                System.out.println("Estoy en i: " + i + " En j: "+j);
                System.out.println(arrayBidi[i][j]);
            }
        }
//--------Vector---------------------------------------------
        Vector<Integer> vectore= new Vector();
        vectore.add(5);
        vectore.add(2);
        vectore.add(19);
        vectore.add(1);
        vectore.add(12);
        System.out.println("Vector: "+ vectore);
        vectore.remove(1);
        vectore.remove(1);
        System.out.println("Vector: "+ vectore);

        //La capacidad (array subyacente) es disitnto al tamaño en los vectores, cada vez que aumenta el tamaño
        //aumenta la capacidad. El vector crece automaticamente pero esto tiene un costo computacional porque
        //se copia y crea un array nuevo.

//--------ArrayList---------------------------------------------
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Element1");
        lista.add("Element2");
        lista.add("Element3");
        lista.add("Element4");
        System.out.println(lista);
//-------LinkedList----------------------------------------------
        LinkedList<String> listaEnlazada = new LinkedList<String>(lista);
        System.out.println(listaEnlazada);
//---------------------------------------------------------------
        ArrayList<Integer> listaCom = new ArrayList<Integer>();
        for (int i=0; i<11; i++){
            listaCom.add(i);
        }
        System.out.println(listaCom);
        for (int i=1; i<listaCom.size(); i++){
            Integer aux=listaCom.get(i);
            if ( aux %2 == 0) {
                listaCom.remove(aux);
            }
        }
        System.out.println(listaCom);
        try{
        int d=DividePorCero(4,1);
        System.out.println(d);
        } catch (Exception e){
            System.out.println("Esto no puede hacerse: " + e.getClass());
        } finally {
            System.out.println("Demo de codigo");
        }
//-------------------------------------------------
        try {
            //LEER FICHEROS
            InputStream fichero = new FileInputStream("filein.txt");
            try {
                byte[] datos = fichero.readAllBytes();

                for (byte dato : datos ) {
                    System.out.print((char)dato);
                }
                //GENERAR FICHEROS
                PrintStream out = new PrintStream("fileout.txt");
                out.write(datos);

            } catch (IOException e) {
                System.out.println("No puedo leer el fichero" + e.getMessage());
            }
        } catch (FileNotFoundException e){
            System.out.println("NOSE QUE PASA"+ e.getMessage());
        }

    }
//--------Control de errores-----------------------------------------

    public static int DividePorCero(int a, int b){
        int c=a/b;
        return c;
    }
}
