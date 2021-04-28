package domain;

public enum TipoPrenda{
  CAMISA(Categoria.PARTE_SUPERIOR),
  REMERA(Categoria.PARTE_SUPERIOR),
  BUZO(Categoria.PARTE_SUPERIOR),
  CHOMBA(Categoria.PARTE_SUPERIOR),
  ANTEOJOS(Categoria.ACCESORIO),
  BERMUDA(Categoria.PARTE_INFERIOR),
  PANTALON(Categoria.PARTE_INFERIOR),
  ZAPATO(Categoria.CALZADO),
  ZAPATILLAS(Categoria.CALZADO);

  private Categoria categoria;

  TipoPrenda(Categoria categoria){
    this.categoria = categoria;
  }

  Categoria obtenerCategoria() {
    return categoria;
  }
}