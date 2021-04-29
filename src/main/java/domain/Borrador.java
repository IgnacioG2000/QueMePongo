package domain;

public class Borrador {
  TipoPrenda tipoPrenda;
  Color colorPrimario;
  Color colorSecundario;
  Material material;
  TramaMaterial trama;

  public Prenda crearPrenda() {
    if(tipoPrenda == null) {
      throw new PrendaInvalidaException("falta explicitar el tipo");
    }
    if(colorPrimario == null) {
      throw new PrendaInvalidaException("falta explicitar el color principal");
    }
    if(material == null) {
      throw new PrendaInvalidaException("falta explicitar el material");
    }
    if(trama == null) {
      this.asignarTrama(TramaMaterial.LISA);
    }

    return new Prenda(tipoPrenda, colorPrimario, material, colorSecundario,trama);
  }

  public void asignarColorPrimario(Color color) {
    this.colorPrimario = color;
  }

  public void asignarColorSecundario(Color color) {
    this.colorSecundario = color;
  }

  public void asignarMaterial(Material material) {
    this.material = material;
  }

  public void asignarTipo(TipoPrenda tipo) {
    this.tipoPrenda = tipo;
  }
  public void asignarTrama(TramaMaterial trama) {
    this.trama = trama;
  }

}