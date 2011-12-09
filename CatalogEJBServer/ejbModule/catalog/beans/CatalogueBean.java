package catalog.beans;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import catalog.entities.Produit;

/**
 * Session Bean implementation class CatalogueBean
 */
@Stateless
public class CatalogueBean implements CatalogueRemote {

	@PersistenceContext
	EntityManager em;

	public void ajouter(Produit produit) {
		em.persist(produit);
	}

	public Produit rechercherProduit(String id) {
		return em.find(Produit.class, id);
	}

	@Override
	public List<Produit> getLesProduits() {
		return em.createQuery("SELECT p FROM Produit p ORDER BY p.nom").getResultList();
	}
}
