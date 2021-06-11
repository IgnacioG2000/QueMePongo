package domain;

import exceptions.RecomendacionException;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  private List<Guardarropa> guardarropas = new ArrayList<>();
  private List<Recomendacion> recomendaciones = new ArrayList<>();
  private List<Recomendacion> recomendacionesAceptadas = new ArrayList<>();
  private List<Prenda> listaDiariaDeSugerencias;
  private String email;

  public Usuario(List<Guardarropa> guardarropas, List<Recomendacion> recomendaciones, List<Recomendacion> recomendacionesAceptadas, List<Prenda> listaDiariaDeSugerencias, String email) {
    this.guardarropas = guardarropas;
    this.recomendaciones = recomendaciones;
    this.recomendacionesAceptadas = recomendacionesAceptadas;
    this.listaDiariaDeSugerencias = listaDiariaDeSugerencias;
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  public void cargarSugerencias(List <Prenda> lista){
    this.listaDiariaDeSugerencias.addAll(lista);
  }

  public List<Prenda> getListaDiariaDeSugerencias() {
    return this.listaDiariaDeSugerencias;
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
