package Desafio3;

public enum MediaEnum {
//    MEDIA_APROVADO(7), MEDIA_RECUPERACAO(5), MEDIA_REPROVADO(0);
    MEDIA_RECUPERACAO(7), MEDIA_REPROVADO(5);

    private float nota;

    MediaEnum(float nota) {
        this.nota = nota;
    }

    public Float getNota() {
        return nota;
    }
}
