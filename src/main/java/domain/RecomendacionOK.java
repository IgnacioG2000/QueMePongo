package domain;

public class RecomendacionOK implements Recomendacion{
  private Guardarropa guardarropa;
  private Prenda prenda;

  public RecomendacionOK(Guardarropa guardarropa, Prenda prenda) {
    this.guardarropa = guardarropa;
    this.prenda = prenda;
  }

  @Override
  public void recomendarA(Usuario usuario) {
    guardarropa.agregarPrenda(prenda,usuario);
  }

  @Override
  public void deshacerRecomendacion(Usuario usuario) {
    guardarropa.quitarPrenda(prenda,usuario);
  }
}
