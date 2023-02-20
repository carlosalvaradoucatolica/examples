package co.edu.ucatolica.examples.facade;

public class Facade {
    private SubsistemaUno subsistemaUno;
    private SubsistemaDos subsistemaDos;
    private SubsistemaTres subsistemaTres;

    public Facade() {
        this.subsistemaUno = new SubsistemaUno();
        this.subsistemaDos = new SubsistemaDos();
        this.subsistemaTres = new SubsistemaTres();
    }

    public void operacionUno() {
        subsistemaUno.operacionUno();
    }

    public void operacionDos() {
        subsistemaDos.operacionDos();
    }

    public void operacionTres() {
        subsistemaTres.operacionTres();
    }
}
