package com.github.fiap.smartcity_trafego.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String placa;
    private String tipo; // ex: carro, moto, caminhão
    private String cor;
    private String velocidadeRegistrada;
}
