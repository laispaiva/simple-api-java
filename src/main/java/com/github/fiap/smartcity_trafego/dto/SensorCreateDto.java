package com.github.fiap.smartcity_trafego.dto;

import com.github.fiap.smartcity_trafego.model.Sensor;
import lombok.Data;

@Data
public class SensorCreateDto {
    private String localizacao;
    private String status;

    public Sensor toModel() {
        return Sensor.builder()
                .localizacao(localizacao)
                .status(status)
                .build();
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
