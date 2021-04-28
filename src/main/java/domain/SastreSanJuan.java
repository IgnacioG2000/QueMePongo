package domain;

public class SastreSanJuan extends Sastre{

  @Override
  Prenda fabricarParteSuperior() {
    borrador = new Borrador(TipoPrenda.CHOMBA);
    borrador.asignarColorPrimario(new Color(0,255,0));
    borrador.asignarMaterial(new Material(TipoMaterial.PIQUE,null));
    return borrador.crearPrenda();
  }

  @Override
  Prenda fabricarParteInferior() {
    borrador = new Borrador(TipoPrenda.PANTALON);
    borrador.asignarColorPrimario(new Color(155,155,155)); //RGB de gris
    borrador.asignarMaterial(new Material(TipoMaterial.ACETATO,null));
    return borrador.crearPrenda();
  }

  @Override
  Prenda fabricarCalzado() {
    borrador = new Borrador(TipoPrenda.ZAPATILLAS);
    borrador.asignarColorPrimario(new Color(255,255,255)); //RGB blanco
    borrador.asignarMaterial(new Material(null,null));
    return borrador.crearPrenda();
  }
}
