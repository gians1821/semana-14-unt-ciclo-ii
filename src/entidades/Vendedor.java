package entidades;

public class Vendedor {
    private String nombre;
    private double montoVentas;

    public Vendedor() {
        this("NN", 0.0);
    }

    public Vendedor(String nombre, double montoVentas) {
        this.nombre = nombre;
        this.montoVentas = montoVentas;
    }

    public double getMontoVentas() {
        return montoVentas;
    }

    public void setMontoVentas(double montoVentas) {
        this.montoVentas = montoVentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "\nNombre y apellidos: " + getNombre() + 
               "\nMonto de ventas: " + getMontoVentas();
    }   
}