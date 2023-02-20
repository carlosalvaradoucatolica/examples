package co.edu.ucatolica.examples.factorymethod;

public class CreadorConcreto extends Creador{
    public Producto factoryMethod() {
        return new ProductoConcreto();
    }
}
