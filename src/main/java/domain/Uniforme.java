package domain;

public class Uniforme {
  Prenda parteSuperior;
  Prenda parteInferior;
  Prenda calzado;

  public Uniforme(Prenda parteSuperior, Prenda parteInferior, Prenda calzado) {
    agregarParteSuperior(parteSuperior);
    agregarParteInferior(parteInferior);
    agregarCalzado(calzado);
  }

  public void agregarParteInferior(Prenda unaParteInferior) {
    this.parteInferior = unaParteInferior;
  }

  public void agregarParteSuperior(Prenda unaParteSuperior) {
    this.parteSuperior = unaParteSuperior;
  }

  public void agregarCalzado(Prenda unCalzado) {
    this.calzado = unCalzado;
  }
}
