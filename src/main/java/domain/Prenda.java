package domain;

public class Prenda {
  TipoPrenda tipo;
  Color colorPrincipal;
  Material material;
  Color colorSecundario;

  public Prenda(TipoPrenda tipo, Color colorPrincipal,Material material, Color colorSecundario) {
    if(tipo == null) {
      throw new PrendaInvalidaException("falta explicitar el tipo");
    }
    if(colorPrincipal == null) {
      throw new PrendaInvalidaException("falta explicitar el color principal");
    }
    if(material == null) {
      throw new PrendaInvalidaException("falta explicitar el material");
    }
    this.tipo = tipo;
    this.colorPrincipal = colorPrincipal;
    this.material = material;
    this.colorSecundario = colorSecundario; //Si no tiene color secundario, directamente lo inicializamos con null
  }

  public Categoria getCategoria() {
    return tipo.obtenerCategoria();
  }
}
