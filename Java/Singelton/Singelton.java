package Singleton;
//https://refactoring.guru/es/design-patterns/creational-patterns

//Factory Method: Proporciona una interfaz para la creadcion de objetos en una superclase, mientras permite a las subclases alterar el tipo de objetos que se crearan.
//Imagina que estás creando una aplicación de gestión logística. La primera versión de tu aplicación sólo es capaz de manejar el transporte en camión, por lo que la mayor parte de tu código se encuentra dentro de la clase Camión.
//En este momento, la mayor parte de tu código está acoplado a la clase Camión. Para añadir barcos a la aplicación habría que hacer cambios en toda la base del código. Además, si más tarde decides añadir otro tipo de transporte a la aplicación, probablemente tendrás que volver a hacer todos estos cambios.

//Abtract Factory: Permite producir familias de objetos relacionados sin especificar sus clases concretas
//Simulador de tienda de muebles. 

//Builder: Permite construir objetos complejos paso a paso. Este patron nos permite producir distintos tipos y representaciones de un objeto empleando el mismo codigo de contruccion.
//Construiccion casa. El patrón Builder sugiere que saques el código de construcción del objeto de su propia clase y lo coloques dentro de objetos independientes llamados constructores.

//Singleton: Permite asegurarnos de que una clase tenga una unica instancia, a la vez que proporciona un punto de acceso global a dicha instancia.
//El gobierno es un ejemplo excelente del patrón Singleton. Un país sólo puede tener un gobierno oficial. Independientemente de las identidades personales de los individuos que forman el gobierno, el título “Gobierno de X” es un punto de acceso global que identifica al grupo de personas a cargo.

//Prototype: Permite copiar objetos existentes sin que el codigo dependa de sus clases.
//En la vida real, los prototipos se utilizan para realizar pruebas de todo tipo antes de comenzar con la producción en masa de un producto. Sin embargo, en este caso, los prototipos no forman parte de una producción real, sino que juegan un papel pasivo.

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
