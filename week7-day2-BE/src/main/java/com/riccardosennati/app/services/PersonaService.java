package com.riccardosennati.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riccardosennati.app.entities.Persona;
import com.riccardosennati.app.repositories.PersonaRepository;

@Service
public class PersonaService {
	
	@Autowired
	PersonaRepository pr;
	
	public Persona save(Persona p) {
		return pr.save(p);
	}
	
	public Optional<Persona> getById(int id) {
		return pr.findById(id);
	}
	
	public List<Persona> getAll() {
		return pr.findAll();
	}

}
