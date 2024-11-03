package models;

public class Habitacion {
    private String id;
    private String tipo; // Ejemplo: "Individual", "Doble", "Suite"
    private double precioPorNoche;
    private boolean disponible;

    public Habitacion(String id, String tipo, double precioPorNoche) {
        this.id = id;
        this.tipo = tipo;
        this.precioPorNoche = precioPorNoche;
        this.disponible = true; // Por defecto, la habitación está disponible
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", Tipo: " + tipo +
                ", Precio Por Noche: $" + precioPorNoche + " USD" +
                ", Disponible: " + disponible;
    }
}
