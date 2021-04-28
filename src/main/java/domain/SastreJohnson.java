package domain;

public class SastreJohnson extends Sastre{

  @Override
  Prenda fabricarParteSuperior() {
    borrador = new Borrador(TipoPrenda.CAMISA);
    borrador.asignarColorPrimario(new Color(255,255,255));
    borrador.asignarMaterial(new Material(null,null));
    return borrador.crearPrenda();
  }

  @Override
  Prenda fabricarParteInferior() {
    borrador = new Borrador(TipoPrenda.PANTALON);
    borrador.asignarColorPrimario(new Color(10,10,10)); //RGB negro
    borrador.asignarMaterial(new Material(null,null));
    return borrador.crearPrenda();
  }

  @Override
  Prenda fabricarCalzado() {
    borrador = new Borrador(TipoPrenda.ZAPATO);
    borrador.asignarColorPrimario(new Color(10,10,10));
    borrador.asignarMaterial(new Material(null,null));
    return borrador.crearPrenda();
  }
}
