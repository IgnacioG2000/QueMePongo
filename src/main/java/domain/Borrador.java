
package domain;

public class Borrador {
  TipoPrenda tipoPrenda;
  Color colorPrimario;
  Color colorSecundario;
  Material material;

  public Borrador(TipoPrenda tipoPrenda) {

    if(tipoPrenda == null) {
      throw new PrendaInvalidaException("falta explicitar el tipo");
    }
    this.tipoPrenda = tipoPrenda;
  }

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
    return new Prenda(tipoPrenda, colorPrimario, material, colorSecundario);
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

}