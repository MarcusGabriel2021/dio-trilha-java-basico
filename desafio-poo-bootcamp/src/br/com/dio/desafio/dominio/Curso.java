package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private String descricao;
    private String titulo;
    private int cargaHoraria;

    @Override
    public String toString() {
        return "Curso{" +
                "descricao='" + descricao + '\'' +
                ", titulo='" + titulo + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * this.cargaHoraria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
