package domain;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Map;

public class ServicioMeteorologicoAccuWeatherAPI implements ServicioMeteorologico{
  private final AccuWeatherAPI api;
  private final Duration expiracion;
  private Map<String, Object> ultimaRespuesta;
  private LocalDateTime proximaExpiracion;

  public ServicioMeteorologicoAccuWeatherAPI(AccuWeatherAPI api, Duration expiracion, Map<String,
      Object> ultimaRespuesta, LocalDateTime proximaExpiracion) {
    this.api = api;
    this.expiracion = expiracion;
    this.ultimaRespuesta = ultimaRespuesta;
    this.proximaExpiracion = proximaExpiracion;
  }

  public Map<String, Object> obtenerCondicionesClimaticas(String direccion) {
    if (this.ultimaRespuesta == null || this.expiro()) {
      this.ultimaRespuesta = consultarApi(direccion);
      this.proximaExpiracion = LocalDateTime.now().plus(this.expiracion);
    }
    return this.ultimaRespuesta;
  }

  private boolean expiro() {
    return proximaExpiracion.isAfter(LocalDateTime.now());
  }

  public Map<String, Object> consultarApi(String direccion) {
    return this.api.getWeather(direccion).get(0);
  }

}
