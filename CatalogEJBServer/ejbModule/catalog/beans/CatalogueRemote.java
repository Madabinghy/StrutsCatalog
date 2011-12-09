package catalog.beans;
import java.util.List;

import javax.ejb.Remote;

import catalog.entities.Produit;

@Remote
public interface CatalogueRemote {

	public List<Produit> getLesProduits();
	public void ajouter(Produit produit);
}
