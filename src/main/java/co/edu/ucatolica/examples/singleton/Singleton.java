//Definición de Singleton: Asegura que una clase solo tenga una instancia y proporciona un punto global de acceso a ella.
package co.edu.ucatolica.examples.singleton;

public class Singleton {
    // Creación de la instancia única del Singleton
    private static Singleton instanciaUnica = null;

    // Variable de instancia para probar el funcionamiento del Singleton
    private int variableEjemplo;

    // Constructor privado para evitar instanciar desde fuera de la clase
    private Singleton() {
        variableEjemplo = 0;
    }

    // Método estático para obtener la instancia única del Singleton
    public static Singleton obtenerInstancia() {
        // Si la instancia única no ha sido creada, la creamos
        if (instanciaUnica == null) {
            instanciaUnica = new Singleton();
        }
        // Devolvemos la instancia única del Singleton
        return instanciaUnica;
    }

    // Método para probar el funcionamiento del Singleton
    public void setVariableEjemplo(int valor) {
        variableEjemplo = valor;
    }

    // Método para probar el funcionamiento del Singleton
    public int getVariableEjemplo() {
        return variableEjemplo;
    }
}
