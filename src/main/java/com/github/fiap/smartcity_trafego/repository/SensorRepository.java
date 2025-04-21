package com.github.fiap.smartcity_trafego.repository;

import com.github.fiap.smartcity_trafego.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Long> {
}
