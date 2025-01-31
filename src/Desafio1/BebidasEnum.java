package Desafio1;

public enum BebidasEnum {
    CERVEJA(18), ÁGUA(0), REFRIGERANTE(0);

    private Integer idadeMinima;

    BebidasEnum(Integer idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public Integer getIdadeMinima() {
        return idadeMinima;
    }
}
