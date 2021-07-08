package fr.androidBackend.entitie;
// Generated 7 juil. 2021 � 14:22:41 by Hibernate Tools 5.0.6.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Personne generated by hbm2java
 */
@Entity
@Table(name = "PERSONNE", schema = "ANDROIDBACKEND")
public class Personne implements java.io.Serializable {

	private BigDecimal id;
	private String nom;
	private String prenom;
	private String adresse;

	public Personne() {
	}

	public Personne(BigDecimal id) {
		this.id = id;
	}

	public Personne(BigDecimal id, String nom, String prenom, String adresse) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	@Id

	@Column(name = "ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	@Column(name = "NOM", length = 20)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "PRENOM", length = 20)
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name = "ADRESSE", length = 20)
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
