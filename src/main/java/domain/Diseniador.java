package domain;
import java.util.List;
import java.util.stream.Collectors;

public class Diseniador {
  private ServicioMeteorologicoAccuWeatherAPI servicioMeteorologicoAccuWeatherAPI;
  private List<Prenda> prendas;

  public Diseniador(ServicioMeteorologicoAccuWeatherAPI servicioMeteorologicoAccuWeatherAPI, List<Prenda> prendas) {
    this.servicioMeteorologicoAccuWeatherAPI = servicioMeteorologicoAccuWeatherAPI;
    this.prendas = prendas;
  }

  public Atuendo sugerirAtuendo(ProductorSugerencias generador) {
    double temperatura = (double) servicioMeteorologicoAccuWeatherAPI.consultarApi("Temperature").get("value");
    List<Atuendo> todasLasPosiblesPrendas = generador.generarSugerenciaDesde(prendas);

    return todasLasPosiblesPrendas.
        stream()
        .filter(unAtuendo-> unAtuendo.todasAptasParaTemperatura(temperatura))
        .collect(Collectors.toList()).get(0);
  }
}
