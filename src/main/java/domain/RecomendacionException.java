package domain;

public class RecomendacionException extends RuntimeException {
  public RecomendacionException(String causa) {
    super("La recomendacion es invalida porque" + causa);
  }
}
