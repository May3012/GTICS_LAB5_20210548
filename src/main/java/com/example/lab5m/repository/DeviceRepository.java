package com.example.lab5m.repository;

import com.example.lab5m.dto.IntervencionesPorSitioDto;
import com.example.lab5m.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DeviceRepository extends JpaRepository<Device,Integer> {

}
