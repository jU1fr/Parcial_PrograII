package postres;

public class Pastel extends Postre {
    private String sabor;

    public Pastel(String nombre, String tamaño, double precio, String sabor) {
        super(nombre, tamaño, precio);
        this.sabor = sabor;
    }

    @Override
    public void preparar() {
        // Implementación de preparar para Pastel
    }

    @Override
    public void servir() {
        // Implementación de servir para Pastel
    }

    // Getters y Setters
}