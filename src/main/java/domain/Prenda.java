package domain;

public class Prenda {
  TipoPrenda tipo;
  Color colorPrincipal;
  Material material;
  Color colorSecundario;
  TramaMaterial trama;

  public Prenda(TipoPrenda tipo, Color colorPrincipal,Material material, Color colorSecundario, TramaMaterial trama) {
    this.tipo = tipo;
    this.colorPrincipal = colorPrincipal;
    this.material = material;
    this.colorSecundario = colorSecundario;//Si no tiene color secundario, directamente lo inicializamos con null
    this.trama = trama;
  }

  public Categoria getCategoria() {
    return tipo.obtenerCategoria();
  }
}
