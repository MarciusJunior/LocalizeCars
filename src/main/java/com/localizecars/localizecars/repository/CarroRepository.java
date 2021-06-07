package com.localizecars.localizecars.repository;

import com.localizecars.localizecars.models.Carro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {

}
