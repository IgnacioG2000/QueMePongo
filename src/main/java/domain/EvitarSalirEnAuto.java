package domain;

import exceptions.NotificacionServicioMeteorologico;

import java.util.List;

public class EvitarSalirEnAuto implements Alertas{
  @Override
  public void recibirAlertas(List<String> alertas) {
    if (this.estaGranizando(alertas)) {
      throw new NotificacionServicioMeteorologico("No salgas con el auto porque esta granizando");
    }
  }

  public boolean estaGranizando(List<String> alertas) {
    return alertas.contains("HAIL");
  }
}
