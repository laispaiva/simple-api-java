package com.github.fiap.smartcity_trafego.controller;

import com.github.fiap.smartcity_trafego.dto.SensorCreateDto;
import com.github.fiap.smartcity_trafego.dto.SensorResponseDto;
import com.github.fiap.smartcity_trafego.dto.SensorUpdateDto;
import com.github.fiap.smartcity_trafego.service.SensorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("sensores")
@RequiredArgsConstructor
public class SensorController {

    private final SensorService service;

    @GetMapping
    public ResponseEntity<List<SensorResponseDto>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("{id}")
    public ResponseEntity<SensorResponseDto> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<SensorResponseDto> cadastrar(@RequestBody @Valid SensorCreateDto dto) {
        SensorResponseDto sensorCriado = service.cadastrar(dto);
        URI uri = URI.create("/sensores/" + sensorCriado.getId());
        return ResponseEntity.created(uri).body(sensorCriado);
    }

    @PutMapping("{id}")
    public ResponseEntity<SensorResponseDto> atualizar(@PathVariable Long id,
                                                       @RequestBody @Valid SensorUpdateDto dto) {
        return service.atualizar(id, dto)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
