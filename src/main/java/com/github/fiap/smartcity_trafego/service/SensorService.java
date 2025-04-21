package com.github.fiap.smartcity_trafego.service;

import com.github.fiap.smartcity_trafego.dto.SensorCreateDto;
import com.github.fiap.smartcity_trafego.dto.SensorResponseDto;
import com.github.fiap.smartcity_trafego.dto.SensorUpdateDto;
import com.github.fiap.smartcity_trafego.model.Sensor;
import com.github.fiap.smartcity_trafego.repository.SensorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SensorService {

    private final SensorRepository repository;

    // Método para listar todos os sensores
    public List<SensorResponseDto> listar() {
        return repository.findAll().stream()
                .map(sensor -> {
                    SensorResponseDto dto = new SensorResponseDto();
                    dto.setId(sensor.getId());  // Usando o getter de Sensor para preencher o DTO
                    dto.setLocalizacao(sensor.getLocalizacao());  // Usando o getter de Sensor para preencher o DTO
                    dto.setStatus(sensor.getStatus());  // Usando o getter de Sensor para preencher o DTO
                    return dto;
                })
                .toList();
    }

    // Método para buscar um sensor por ID
    public Optional<SensorResponseDto> buscarPorId(Long id) {
        return repository.findById(id).map(sensor -> {
            SensorResponseDto dto = new SensorResponseDto();
            dto.setId(sensor.getId());  // Usando o getter de Sensor para preencher o DTO
            dto.setLocalizacao(sensor.getLocalizacao());  // Usando o getter de Sensor para preencher o DTO
            dto.setStatus(sensor.getStatus());  // Usando o getter de Sensor para preencher o DTO
            return dto;
        });
    }

    // Método para cadastrar um novo sensor
    public SensorResponseDto cadastrar(SensorCreateDto dto) {
        Sensor sensor = Sensor.builder()
                .localizacao(dto.getLocalizacao())  // Usando o getter de SensorCreateDto
                .status(dto.getStatus())  // Usando o getter de SensorCreateDto
                .build();
        Sensor sensorSalvo = repository.save(sensor);
        
        // Criando o DTO de resposta
        SensorResponseDto responseDto = new SensorResponseDto();
        responseDto.setId(sensorSalvo.getId());  // Usando o getter de Sensor para preencher o DTO
        responseDto.setLocalizacao(sensorSalvo.getLocalizacao());  // Usando o getter de Sensor para preencher o DTO
        responseDto.setStatus(sensorSalvo.getStatus());  // Usando o getter de Sensor para preencher o DTO
        return responseDto;
    }

    // Método para atualizar um sensor existente
    public Optional<SensorResponseDto> atualizar(Long id, SensorUpdateDto dto) {
        return repository.findById(id).map(sensor -> {
            sensor.setLocalizacao(dto.getLocalizacao());  // Usando o setter de Sensor
            sensor.setStatus(dto.getStatus());  // Usando o setter de Sensor
            
            Sensor sensorAtualizado = repository.save(sensor);

            // Criando o DTO de resposta com os dados atualizados
            SensorResponseDto responseDto = new SensorResponseDto();
            responseDto.setId(sensorAtualizado.getId());  // Usando o getter de Sensor para preencher o DTO
            responseDto.setLocalizacao(sensorAtualizado.getLocalizacao());  // Usando o getter de Sensor para preencher o DTO
            responseDto.setStatus(sensorAtualizado.getStatus());  // Usando o getter de Sensor para preencher o DTO
            return responseDto;
        });
    }

    // Método para deletar um sensor
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
