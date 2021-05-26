package domain;

import java.util.List;

public class Guardarropa {
  private List<Prenda> prendas;
  private Usuario duenio;

  public Guardarropa(List<Prenda> prendas, Usuario duenio) {
    this.prendas = prendas;
    this.duenio = duenio;
  }

  public void validarDuenioGuardarropa(Usuario usuario) {
    if(!usuario.equals(duenio))
      throw new GuardarropaException(usuario + "no es el propietario");
  }

  public void agregarPrenda(Prenda prenda,Usuario usuario) {
    this.validarDuenioGuardarropa(usuario);
    prendas.add(prenda);
  }

  public void quitarPrenda(Prenda prenda, Usuario usuario) {
    this.validarDuenioGuardarropa(usuario);
    prendas.remove(prenda);
  }
}
