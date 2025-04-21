package com.github.fiap.smartcity_trafego.dto;

import com.github.fiap.smartcity_trafego.model.Sensor;

import lombok.Data;

@Data
public class SensorResponseDto {
    private Long id;
    private String localizacao;
    private String status;

    // Construtor para converter Sensor para SensorResponseDto
    public SensorResponseDto(Sensor sensor) {
        this.id = sensor.getId();
        this.localizacao = sensor.getLocalizacao();
        this.status = sensor.getStatus();
    }

    public SensorResponseDto(Long id, String localizacao, String status) {
        this.id = id;
        this.localizacao = localizacao;
        this.status = status;
    }

    public SensorResponseDto() {
    }

    @Override
    public String toString() {
        return "SensorResponseDto [id=" + id + ", localizacao=" + localizacao + ", status=" + status + ", getId()="
                + getId() + ", getLocalizacao()=" + getLocalizacao() + ", getStatus()=" + getStatus() + ", hashCode()="
                + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SensorResponseDto other = (SensorResponseDto) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (localizacao == null) {
            if (other.localizacao != null)
                return false;
        } else if (!localizacao.equals(other.localizacao))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((localizacao == null) ? 0 : localizacao.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        return result;
    }

    
}
