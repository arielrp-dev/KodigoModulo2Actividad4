package exceptions;

public class ExcepcionGeneral extends Exception {
    public ExcepcionGeneral(String mensaje) {
        super(mensaje);
    }

    public ExcepcionGeneral(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}