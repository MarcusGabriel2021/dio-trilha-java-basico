package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mentoria extends Conteudo{

    private String descricao;
    private String titulo;
    private LocalDate data;

    @Override
    public String toString() {
        return "Mentoria{" +
                "descricao='" + descricao + '\'' +
                ", titulo='" + titulo + '\'' +
                ", data=" + data +
                '}';
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
