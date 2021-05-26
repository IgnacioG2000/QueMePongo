package domain;

public class RecomendacionNoOK implements Recomendacion {
  private Guardarropa guardarropa;
  private Prenda prenda;

  public RecomendacionNoOK(Guardarropa guardarropa, Prenda prenda) {
    this.guardarropa = guardarropa;
    this.prenda = prenda;
  }

  @Override
  public void recomendarA(Usuario usuario) {
    guardarropa.quitarPrenda(prenda,usuario);
  }

  @Override
  public void deshacerRecomendacion(Usuario usuario) {
    guardarropa.agregarPrenda(prenda,usuario);
  }
}
