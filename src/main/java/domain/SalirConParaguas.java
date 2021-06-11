package domain;

import exceptions.NotificacionServicioMeteorologico;

import java.util.List;

public class SalirConParaguas implements Alertas{
  @Override
  public void recibirAlertas(List<String> alertas) {
    if(this.estaLloviendo(alertas)) {
      throw new NotificacionServicioMeteorologico("Se recomienda salir con paraguas porque va a llover");
    }
  }

  private boolean estaLloviendo(List<String> alertas) {
    return alertas.contains("STORM");
  }
}
