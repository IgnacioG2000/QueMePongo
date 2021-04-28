package domain;

public class Prenda {
  TipoPrenda tipo;
  Color colorPrincipal;
  TipoMaterial material;
  Color colorSecundario;

  public Prenda(TipoPrenda tipo, Color colorPrincipal,TipoMaterial material, Color colorSecundario) {
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

  // Aca quiero probar el requerimiento 6 de la primera iteracion pero no se si esta bien
  void condiceCon(Categoria categoria) {
    if(!(this.getCategoria() == categoria)) {
      throw new PrendaInvalidaException(tipo + " no pertenece a " + categoria);
    }
  }

  public Categoria getCategoria() {
    return tipo.obtenerCategoria();
  }
}
