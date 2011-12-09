package catalog.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;

@Entity
public class Produit implements Serializable {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int reference;
	private String nom;
	private String description;
	private double prix;

	public Produit() {
		super();
	}

	public Produit(String nom, String description, double prix) {

		this.nom = nom;
		this.description = description;
		this.prix = prix;
	}

	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

}
