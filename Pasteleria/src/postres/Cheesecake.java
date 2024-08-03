package postres;

public class Cheesecake extends Postre {
    private String tipoQueso;

    public Cheesecake(String nombre, String tamaño, double precio, String tipoQueso) {
        super(nombre, tamaño, precio);
        this.tipoQueso = tipoQueso;
    }

    @Override
    public void preparar() {
        // Implementación de preparar para Cheesecake
    }

    @Override
    public void servir() {
        // Implementación de servir para Cheesecake
    }

    // Getters y Setters
}