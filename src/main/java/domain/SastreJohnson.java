package domain;

public class SastreJohnson extends Sastre{

  @Override
  Prenda fabricarParteSuperior() {
    borrador = new Borrador();
    borrador.asignarTipo(TipoPrenda.CAMISA);
    borrador.asignarColorPrimario(new Color(255,255,255));
    return borrador.crearPrenda();
  }

  @Override
  Prenda fabricarParteInferior() {
    borrador = new Borrador();
    borrador.asignarTipo(TipoPrenda.PANTALON);
    borrador.asignarColorPrimario(new Color(10,10,10)); //RGB negro
    return borrador.crearPrenda();
  }

  @Override
  Prenda fabricarCalzado() {
    borrador = new Borrador();
    borrador.asignarTipo(TipoPrenda.ZAPATO);
    borrador.asignarColorPrimario(new Color(10,10,10));
    return borrador.crearPrenda();
  }
}
