package fr.androidBackend.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.androidBackend.dao.PersonneRepository;
import fr.androidBackend.entitie.Personne;

@Service
@Transactional
public class PersonneServiceImpl implements PersonneService {
	
	@Autowired
	private PersonneRepository personneRepo;

	@Override
	public void addPersonne(Personne personne) {
		personneRepo.save(personne);
		
	}

	@Override
	public void deletePersonne(Personne personne) {
		personneRepo.delete(personne);
		
	}

	@Override
	public void updatePersonne(Personne personne) {
		personneRepo.save(personne);
		
	}

	@Override
	public List<Personne> findAllPersonne() {
		List<Personne> listePersonne = personneRepo.findAll();
		return listePersonne;
	}

	@Override
	public Personne findByIdPersonne(BigDecimal id) {
		Personne personne = personneRepo.findById(id).get();
		return personne;
	}

}
