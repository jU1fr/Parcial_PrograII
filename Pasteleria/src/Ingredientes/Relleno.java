package Ingredientes;

public class Relleno implements Ingrediente {
    private String sabor;
    private double cantidad;

    public Relleno(String sabor, double cantidad) {
        this.sabor = sabor;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return sabor;
    }

    @Override
    public double obtenerCantidad() {
        return cantidad;
    }

    // Getters y Setters
}