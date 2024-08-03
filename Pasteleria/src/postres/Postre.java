package postres;

public abstract class Postre {
    private String nombre;
    private String tamaño;
    private double precio;

    public Postre(String nombre, String tamaño, double precio) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public abstract void preparar();
    public abstract void servir();


}