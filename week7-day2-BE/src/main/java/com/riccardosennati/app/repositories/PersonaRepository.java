package com.riccardosennati.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riccardosennati.app.entities.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer>{

}
