package exceptions;

public class AtuendoInvalidoException extends RuntimeException{
  public AtuendoInvalidoException(String causa) {
    super("El atuendo es invalido porque " + causa);
  }
}
