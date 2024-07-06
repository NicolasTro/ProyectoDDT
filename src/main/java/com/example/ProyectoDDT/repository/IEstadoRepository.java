package com.example.ProyectoDDT.repository;

import com.example.ProyectoDDT.entity.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstadoRepository extends JpaRepository<Estado, Integer> {
}
