package Singleton;

//Factory Method: Proporciona una interfaz para la creadcion de objetos en una superclase, mientras permite a las subclases alterar el tipo de objetos que se crearan.
//Abtract Factory: Permite producir familias de objetos relacionados sin especificar sus clases concretas
//Builder: Permite construir objetos complejos paso a paso. Este patron nos permite producir distintos tipos y representaciones de un objeto empleando el mismo codigo de contruccion.
//Singleton: Permite asegurarnos de que una clase tenga una unica instancia, a la vez que proporciona un punto de acceso global a dicha instancia.
//Prototype: Permite copiar objetos existentes sin que el codigo dependa de sus clases.

public class Singleton {

   private static Singleton singleton;
   int contador;

   private Singleton(){}
   public static Singleton getInstance(){
       if(singleton==null){
       singleton = new Singleton();
       }
       return singleton;
   }
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
