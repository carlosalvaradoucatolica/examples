package co.edu.ucatolica.examples.facade;
//Definición de Facade: Proporciona una interfaz simplificada a un subsistema complejo.
public class Implementacion {
    public Implementacion(){
        Facade facade = new Facade();
        facade.operacionUno();
        facade.operacionDos();
        facade.operacionTres();
    }

}
