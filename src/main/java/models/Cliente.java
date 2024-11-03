package models;

public class Cliente {
    private String id;
    private String nombre;
    private String correoElectronico;
    private String numeroTelefono;

    public Cliente(String id, String nombre, String correoElectronico, String numeroTelefono) {
        this.id = id;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.numeroTelefono = numeroTelefono;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", Nombre: " + nombre +
                ", Correo Electronico: " + correoElectronico +
                ", Numero Telefono: " + numeroTelefono;
    }
}
