package domain;

public enum TipoMaterial {
    TELA(TramaMaterial.LISA),
    ALGODON(null),
    POLIESTER(null),
    LANA(null),
    CUERO(null),
    JEAN(null),
    PIQUE(null),
    ACETATO(null);

    TramaMaterial trama;

    TipoMaterial(TramaMaterial trama) {
        this.trama = trama;
    }
}