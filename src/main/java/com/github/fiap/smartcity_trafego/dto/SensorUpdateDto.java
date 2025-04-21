package com.github.fiap.smartcity_trafego.dto;

import com.github.fiap.smartcity_trafego.model.Sensor;
import lombok.Data;

@Data
public class SensorUpdateDto {
    private Long id;
    private String localizacao;
    private String status;

    public Sensor toModel() {
        return Sensor.builder()
                .id(id)
                .localizacao(localizacao)
                .status(status)
                .build();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
