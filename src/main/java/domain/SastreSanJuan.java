package domain;

public class SastreSanJuan extends Sastre{

  @Override
  Prenda fabricarParteSuperior() {
    borrador = new Borrador();
    borrador.asignarTipo(TipoPrenda.CHOMBA);
    borrador.asignarColorPrimario(new Color(0,255,0)); //RGB verde
    borrador.asignarMaterial(Material.PIQUE);
    return borrador.crearPrenda();
  }

  @Override
  Prenda fabricarParteInferior() {
    borrador = new Borrador();
    borrador.asignarTipo(TipoPrenda.PANTALON);
    borrador.asignarColorPrimario(new Color(155,155,155)); //RGB de gris
    borrador.asignarMaterial(Material.ACETATO);
    return borrador.crearPrenda();
  }

  @Override
  Prenda fabricarCalzado() {
    borrador = new Borrador();
    borrador.asignarTipo(TipoPrenda.ZAPATILLAS);
    borrador.asignarColorPrimario(new Color(255,255,255)); //RGB blanco
    return borrador.crearPrenda(); // No coloco el material ya que directamente se inicializaria con null
  }
}
