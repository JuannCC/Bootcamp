import java.io.*;

public class main {
    public static void main(String[] args) {
        try {
            //LEER FICHEROS
            InputStream fichero = new FileInputStream("libro.txt");
            try {
                byte[] datos = fichero.readAllBytes();

                for (byte dato : datos ) {
                    System.out.print((char)dato);
                }
                //GENERAR FICHEROS
                //PrintStream out = new PrintStream("destino.txt");
                //out.write(datos);

            } catch (IOException e) {
                System.out.println("No puedo leer el fichero" + e.getMessage());
            }
        } catch (FileNotFoundException e){
            System.out.println("NOSE QUE PASA"+ e.getMessage());
        }
    }
}
