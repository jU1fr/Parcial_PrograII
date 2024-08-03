package postres;

public class Brownie extends Postre {
    private String tipoChocolate;

    public Brownie(String nombre, String tamaño, double precio, String tipoChocolate) {
        super(nombre, tamaño, precio);
        this.tipoChocolate = tipoChocolate;
    }

    @Override
    public void preparar() {
        // Implementación de preparar para Brownie
    }

    @Override
    public void servir() {
        // Implementación de servir para Brownie
    }

    // Getters y Setters
}