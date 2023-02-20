package co.edu.ucatolica.examples.factorymethod;

public abstract class Creador {
    public abstract Producto factoryMethod();

    public void operacion() {
        Producto producto = factoryMethod();
        producto.operacion();
    }
}
