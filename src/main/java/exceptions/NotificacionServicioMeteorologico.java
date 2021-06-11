package exceptions;

public class NotificacionServicioMeteorologico extends RuntimeException {
  public NotificacionServicioMeteorologico(String causa) {
    super(causa);
  }
}
