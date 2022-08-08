import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws UsuariosYaRegistradoException {
        try{
            int valor= 5/0;
        } catch (Exception e) {
            System.out.println("Esto es una division por cero");
            //for (StackTraceElement valor : e.getStackTrace()){
            //    System.out.println("Linea: "+ valor.getLineNumber());
            //}
        }
      
        /**
        try{
        Usuarios usuarios = new Usuarios();
        usuarios.meterUsuario("pepe");
        usuarios.meterUsuario("Juan");
        usuarios.meterUsuario("pepe");
        } catch (UsuariosYaRegistradoException e){
            System.out.println(e.getMessage());
        }
         */
      
        try {
            Usuarios numeros = new Usuarios();
            numeros.buscarNumero(3);
        } catch (UsuariosYaRegistradoException e){
            System.out.println(e.getMessage());
        }
    }
}
