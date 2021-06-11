package domain;

import java.util.List;

public class Sugerencia {
  private List<Prenda> partesSuperiores;
  private List<Prenda> partesInferiores;
  private List<Prenda> calzados;
  private List<Prenda> accesorios;
  private ServicioMeteorologicoAccuWeatherAPI climaReciente;
  private List<Prenda> listaSugerencias;

  public Sugerencia(List<Prenda> partesSuperiores, List<Prenda> partesInferiores, List<Prenda> calzados, List<Prenda> accesorios, ServicioMeteorologicoAccuWeatherAPI climaReciente) {
    this.accesorios = accesorios;
    this.calzados = calzados;
    this.partesInferiores = partesInferiores;
    this.partesSuperiores = partesSuperiores;
    this.climaReciente = climaReciente;
  }

  public Prenda sugerirParteSup() {
    return partesInferiores.stream().filter(prenda -> prenda.sePuedeUsarEnEsaAlerta(climaReciente.getClima())).findAny().get();
  }

  public Prenda sugerirParteInf() {
    return partesInferiores.stream().filter(prenda -> prenda.sePuedeUsarEnEsaAlerta(climaReciente.getClima())).findAny().get();
  }

  public Prenda sugerirCalzado() {
    return calzados.stream().filter(prenda -> prenda.sePuedeUsarEnEsaAlerta(climaReciente.getClima())).findAny().get();
  }

  public Prenda sugerirAccesorio() {
    return accesorios.stream().filter(prenda -> prenda.sePuedeUsarEnEsaAlerta(climaReciente.getClima())).findAny().get();
  }

  public void cargarLista() {
    listaSugerencias.add(sugerirParteSup());
    listaSugerencias.add(sugerirParteInf());
    listaSugerencias.add(sugerirCalzado());
    listaSugerencias.add(sugerirAccesorio());
  }

  public List<Prenda> sugerir() {
    cargarLista();
    return listaSugerencias;
  }

}