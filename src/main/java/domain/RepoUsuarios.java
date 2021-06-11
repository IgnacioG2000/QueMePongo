package domain;

import java.util.List;

public class RepoUsuarios {
  private Sugerencia sugerencia;
  private List<Usuario> usuarios;
  private List<Prenda> lista;

  public void setSugerencia(Sugerencia sugerencias){
    this.sugerencia = sugerencias;
  }

  public void sugerirleAUnUsuario(){
    lista = sugerencia.sugerir();
    cargarListaDeSugerenciasDiarias(lista);
  }

  public void cargarListaDeSugerenciasDiarias(List<Prenda> lista){
    usuarios.forEach(usuario -> usuario.cargarSugerencias(lista));
  }

  public void terminarDia(){
    usuarios.forEach(usuario -> usuario.getListaDiariaDeSugerencias().clear());
  }

  public void enviarMail(Clima climaNuevaAlerta) {
    usuarios.forEach(usuario -> ServicioMail.enviar("Se genero una nueva alerta:" + climaNuevaAlerta.getAlertas(), usuario.getEmail()));
  }

}
