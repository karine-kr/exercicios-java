package Desafio3;

public enum MediaEnum {
    MEDIA_RECUPERACAO(7), MEDIA_REPROVADO(5);

    private float nota;

    MediaEnum(float nota) {
        this.nota = nota;
    }

    public Float getNota() {
        return nota;
    }
}
