package com.LojaDeJogos.luan.projeto.jogo;

import java.util.Objects;

public class DadosCadastroJogo{

    private String id;
    private String nome;
    private String genero;
    private Double preco;
    private String desenvolvedora;
    private String distribuidora;
    private String lancamento;

    public DadosCadastroJogo(){

    }

    public DadosCadastroJogo(String id, String nome, String genero, Double preco,
                             String desenvolvedora, String distribuidora, String lancamento) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
        this.desenvolvedora = desenvolvedora;
        this.distribuidora = distribuidora;
        this.lancamento = lancamento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getLancamento() {
        return lancamento;
    }

    public void setLancamento(String lancamento) {
        this.lancamento = lancamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DadosCadastroJogo that = (DadosCadastroJogo) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "DadosCadastroJogo{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", preco=" + preco +
                ", desenvolvedora='" + desenvolvedora + '\'' +
                ", distribuidora='" + distribuidora + '\'' +
                ", lancamento='" + lancamento + '\'' +
                '}';
    }
}
