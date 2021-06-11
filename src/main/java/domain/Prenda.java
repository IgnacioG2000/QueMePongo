package domain;

public class Prenda {
  private TipoPrenda tipo;
  private Color colorPrincipal;
  private Material material;
  private Color colorSecundario;
  private TramaMaterial trama;
  private double temperatura;
  private AlertaAptaPara alertaOk;


  public Prenda(TipoPrenda tipo, Color colorPrincipal,Material material, Color colorSecundario, TramaMaterial trama, double temperatura) {
    this.tipo = tipo;
    this.colorPrincipal = colorPrincipal;
    this.material = material;
    this.colorSecundario = colorSecundario;//Si no tiene color secundario, directamente lo inicializamos con null
    this.trama = trama;
    this.temperatura = temperatura;
  }

  public boolean esAptaParaTemperatura(double unaTemperatura) {
    return this.temperatura <= unaTemperatura;
  }

  public Categoria getCategoria() {
    return tipo.obtenerCategoria();
  }

  public boolean esParteSuperior() {
    return getCategoria() == Categoria.PARTE_SUPERIOR;
  }

  public boolean esParteInferior() {
    return getCategoria() == Categoria.PARTE_INFERIOR;
  }

  public boolean esCalzado() {
    return getCategoria() == Categoria.CALZADO;
  }

  public boolean esAccesorio() {
    return getCategoria() == Categoria.ACCESORIO;
  }

  public boolean sePuedeUsarEnEsaAlerta(Clima clima) {
    return clima.getAlertas().contains(this.alertaOk);
  }
}
