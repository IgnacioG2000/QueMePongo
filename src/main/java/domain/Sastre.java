package domain;

public abstract class Sastre {
  Prenda calzado;
  Prenda parteSuperior;
  Prenda parteInferior;
  Borrador borrador;

  public Uniforme fabricarUniforme() {
    return new Uniforme(this.fabricarParteSuperior(),this.fabricarParteInferior(),this.fabricarCalzado());
  }

  abstract Prenda fabricarParteSuperior();
  abstract Prenda fabricarParteInferior();
  abstract Prenda fabricarCalzado();
}
