package com.github.fiap.smartcity_trafego.model;

import java.time.LocalDateTime;

public class RegistroOcorrencia {
    private String id;
    private String tipoOcorrencia;
    private String descricao;
    private LocalDateTime dataHora;
    private String localizacao;
    private String gravidade;

    // Construtor
    public RegistroOcorrencia(String id, String tipoOcorrencia, String descricao, 
                              LocalDateTime dataHora, String localizacao, String gravidade) {
        this.id = id;
        this.tipoOcorrencia = tipoOcorrencia;
        this.descricao = descricao;
        this.dataHora = dataHora;
        this.localizacao = localizacao;
        this.gravidade = gravidade;
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoOcorrencia() {
        return tipoOcorrencia;
    }

    public void setTipoOcorrencia(String tipoOcorrencia) {
        this.tipoOcorrencia = tipoOcorrencia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getGravidade() {
        return gravidade;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }

    @Override
    public String toString() {
        return "RegistroOcorrencia{" +
                "id='" + id + '\'' +
                ", tipoOcorrencia='" + tipoOcorrencia + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataHora=" + dataHora +
                ", localizacao='" + localizacao + '\'' +
                ", gravidade='" + gravidade + '\'' +
                '}';
    }
}
