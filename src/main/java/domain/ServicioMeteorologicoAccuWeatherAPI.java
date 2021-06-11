package domain;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class ServicioMeteorologicoAccuWeatherAPI implements ServicioMeteorologico {
  private Clima clima;
  private final AccuWeatherAPI api;
  private final Duration expiracion;
  private Map<String, Object> ultimaRespuesta;
  private LocalDateTime proximaExpiracion;

  public ServicioMeteorologicoAccuWeatherAPI(Clima clima, AccuWeatherAPI api, Duration expiracion, Map<String,
      Object> ultimaRespuesta, LocalDateTime proximaExpiracion) {
    this.clima = clima;
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

  public List<String> getAlertas() {
    Map<String, Object> alertas = api.getAlertas("Buenos Aires");
    return (List<String>) alertas.get("CurrentAlerts");
  }

  public Clima getClima() {
    return clima;
  }

}
