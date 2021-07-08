package fr.androidBackend.dao;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.androidBackend.entitie.Personne;

public interface PersonneRepository extends JpaRepository<Personne, BigDecimal> {

}
