package domain;

public class Borrador {
  TipoPrenda tipoPrenda;
  Color colorPrimario;
  Color colorSecundario;
  Material material;
  TramaMaterial trama;

  public Prenda crearPrenda() {

    return new Prenda(tipoPrenda, colorPrimario, material, colorSecundario,trama);
  }

  public void asignarColorPrimario(Color color) {
    if(colorPrimario == null) {
      throw new PrendaInvalidaException("falta explicitar el color principal");
    }
    this.colorPrimario = color;
  }

  public void asignarColorSecundario(Color color) {
    this.colorSecundario = color;
  }

  public void asignarMaterial(Material material) {
    if(material == null) {
      throw new PrendaInvalidaException("falta explicitar el material");
    }
    this.material = material;
  }

  public void asignarTipo(TipoPrenda tipo) {
    if(tipoPrenda == null) {
      throw new PrendaInvalidaException("falta explicitar el tipo");
    }
    this.tipoPrenda = tipo;
  }
  public void asignarTrama(TramaMaterial trama) {
    if(trama == null) {
      this.asignarTrama(TramaMaterial.LISA);
    }

    this.trama = trama;
  }

}