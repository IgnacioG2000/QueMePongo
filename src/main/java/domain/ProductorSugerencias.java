package domain;


import java.util.List;

public interface ProductorSugerencias {

  List<Atuendo> generarSugerenciaDesde(List<Prenda> prendasAptas);
}
