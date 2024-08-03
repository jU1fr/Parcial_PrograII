package Sucursal;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private String nombre;
    private String direccion;
    private List<Object> empleados;
    private List<Object> ingredientes;
    private List<Object> equipos;
    private List<Object> especialidades;

    public Sucursal(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.empleados = new ArrayList<>().reversed();
        this.ingredientes = new ArrayList<>().reversed();
        this.equipos = new ArrayList<>().reversed();
        this.especialidades = new ArrayList<>().reversed();
    }

    public void agregarEmpleado(Object e) {
        empleados.add(e);
    }

    public void agregarIngrediente(Object i) {
        ingredientes.add(i);
    }

    public void agregarEquipo(Object e) {
        equipos.add(e);
    }

    public void agregarEspecialidad(Object p) {
        especialidades.add(p);
    }

    // Getters y Setters
}