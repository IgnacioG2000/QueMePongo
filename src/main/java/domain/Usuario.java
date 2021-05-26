package domain;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  private List<Guardarropa> guardarropas = new ArrayList<>();
  private List<Recomendacion> recomendaciones = new ArrayList<>();
  private List<Recomendacion> recomendacionesAceptadas = new ArrayList<>();

  public Usuario(List<Guardarropa> guardarropas, List<Recomendacion> recomendaciones, List<Recomendacion> recomendacionesAceptadas) {
    this.guardarropas = guardarropas;
    this.recomendaciones = recomendaciones;
    this.recomendacionesAceptadas = recomendacionesAceptadas;
  }

  public void agregarRecomendacion(Recomendacion recomendacion){
    this.recomendaciones.add(recomendacion);
  }

  public void quitarRecomendacion(Recomendacion recomendacion) {
    this.recomendaciones.remove(recomendacion);
  }

  public void agregarRecomendacionAceptada(Recomendacion recomendacion) {
    this.recomendacionesAceptadas.add(recomendacion);
  }

  public void tomarRecomendacion(Recomendacion recomendacion) {
    this.validarRecomendacion(recomendacion,recomendaciones);
    recomendacion.recomendarA(this);
    this.quitarRecomendacion(recomendacion);
    this.agregarRecomendacionAceptada(recomendacion);
  }

  public void noTomarRecomendacion(Recomendacion recomendacion) {
    this.quitarRecomendacion(recomendacion);
  }

  public void deshacerRecomendacion(Recomendacion recomendacion) {
    this.validarRecomendacion(recomendacion,recomendacionesAceptadas);
    recomendacion.deshacerRecomendacion(this);
  }

  private void validarRecomendacion(Recomendacion recomendacion, List<Recomendacion> lista) {
    if(!lista.contains(recomendacion))
      throw new RecomendacionException(recomendacion + "no se encuentra en la lista de" + lista);
  }
}
