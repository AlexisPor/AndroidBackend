package fr.androidBackend.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.androidBackend.entitie.Personne;
import fr.androidBackend.services.PersonneService;

@RestController
@RequestMapping("personne")
public class PersonneRestController {

	@Autowired
	private PersonneService personneService;
	
	@GetMapping("/list")
	public List<Personne> findAllPersonne(){
		return personneService.findAllPersonne();
	}
	
	@PostMapping("/add")
	public void addPersonne(@RequestBody Personne personne) {
		personneService.addPersonne(personne);
	}
	
	@PutMapping("/update/{id}")
	public void updatePersonne(@RequestBody Personne personne) {
		personneService.updatePersonne(personne);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletePersonne(@PathVariable(name = "id") BigDecimal id) {
		Personne p = personneService.findByIdPersonne(id);
		personneService.deletePersonne(p);
	}
	
	@GetMapping("/find/{id}")
	public Personne findByIdPersonne(@PathVariable(name="id")BigDecimal id) {
		
		return personneService.findByIdPersonne(id);
		
	}
}
