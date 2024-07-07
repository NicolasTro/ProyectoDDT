package com.example.ProyectoDDT.repository;

import com.example.ProyectoDDT.entity.Tercista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITercistaRepository extends JpaRepository<Tercista, Integer> {
}
