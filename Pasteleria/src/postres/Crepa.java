package postres;

public class Crepa extends Postre {
    private String tipoMasa;

    public Crepa(String nombre, String tamaño, double precio, String tipoMasa) {
        super(nombre, tamaño, precio);
        this.tipoMasa = tipoMasa;
    }

    @Override
    public void preparar() {
        // Implementación de preparar para Crepa
    }

    @Override
    public void servir() {
        // Implementación de servir para Crepa
    }


}