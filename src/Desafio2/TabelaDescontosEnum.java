package Desafio2;

public enum TabelaDescontosEnum {
    DESCONTO_10(20, 10, "10%"),
    DESCONTO_20(50, 20, "20%"),
    DESCONTO_25(50, 25, "25%");

    private Integer limiteUnidades;
    private Integer porcentagemDesconto;
    private String mensagem;

    TabelaDescontosEnum(Integer limiteUnidades, Integer porcentagemDesconto, String mensagem) {
        this.limiteUnidades = limiteUnidades;
        this.porcentagemDesconto = porcentagemDesconto;
        this.mensagem = mensagem;
    }

    public Integer getLimiteUnidades() {
        return limiteUnidades;
    }

    public Integer getPorcentagemDesconto() {
        return porcentagemDesconto;
    }

    public String getMensagem() {
        return mensagem;
    }
}
