package co.edu.ucatolica.examples.factorymethod;
//Definición de Factory Method: Proporciona una interfaz para crear objetos en una superclase,
// permitiendo a las subclases reemplazar la clase objetiva que se crea.
public class Implementacion {
    public Implementacion(){
        Creador creador = new CreadorConcreto();
        creador.operacion();
    }

}
