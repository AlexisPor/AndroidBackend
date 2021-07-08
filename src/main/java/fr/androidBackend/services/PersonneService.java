package fr.androidBackend.services;

import java.math.BigDecimal;
import java.util.List;

import fr.androidBackend.entitie.Personne;

public interface PersonneService {
	
	public void addPersonne(Personne personne);
	
	public void deletePersonne(Personne personne);
	
	public void updatePersonne(Personne personne);
	
	public List<Personne> findAllPersonne();
	
	public Personne findByIdPersonne(BigDecimal id);

}
