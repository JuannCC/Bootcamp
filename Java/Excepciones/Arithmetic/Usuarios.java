import java.util.ArrayList;

public class Usuarios {
    //ArrayList<String> usuarios = new ArrayList();
    int [] numeros = new int[]{1,2,3,4,5};
    /**
    public void meterUsuario(String nombre) throws UsuariosYaRegistradoException{
        for (String usuario: usuarios){
            if (usuario == nombre){
                throw new UsuariosYaRegistradoException("Error el meter usuario "+ nombre);
            }
        }
        usuarios.add(nombre);
        System.out.println("Usuario metido: " + nombre);
     */
    public void buscarNumero(int elemento) throws UsuariosYaRegistradoException{

            if (elemento > numeros.length){
                throw new UsuariosYaRegistradoException("No existe el indice: "+ elemento);
            } else {
                System.out.println("El elemento es el " + numeros[elemento]);
            }
    }
}
