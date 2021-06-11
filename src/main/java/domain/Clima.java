package domain;

import java.util.List;
import java.util.Map;

public class Clima {
  private AccuWeatherAPI apiClima = new AccuWeatherAPI();
  private List<Map<String, Object>> condicionesClimaticas;


  public Integer condicionesClimaticas(){
    return (Integer) condicionesClimaticas.get(0).get("Temperature");
  }
  public void setApiClimaBuenosAires() {
    apiClima.getWeather("Buenos Aires, Argentina");
  }

  public List<String> getAlertas() {
    Map<String, Object> alertas = apiClima.getAlertas("Buenos Aires");
    return (List<String>) alertas.get("CurrentAlerts");
  }
}
