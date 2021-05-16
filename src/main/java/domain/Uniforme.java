package domain;

import org.jetbrains.annotations.NotNull;

public class Uniforme {
  Prenda parteSuperior;
  Prenda parteInferior;
  Prenda calzado;

  public Uniforme(@NotNull Prenda parteSuperior,@NotNull Prenda parteInferior,@NotNull Prenda calzado) {
    this.parteSuperior = parteSuperior;
    this.parteInferior = parteInferior;
    this.calzado = calzado;
  }
}