package client.catalog.actions;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import catalog.beans.CatalogueRemote;
import catalog.entities.Produit;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteOneProductByNameAction extends ActionSupport{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    CatalogueRemote catalog;
    //private Produit produit;
    
	String nom;// = produit.getNom();
	String description;// = produit.getDescription();
	double prix;// = produit.getPrix();

    public void setNom(String nom){
    	//this.produit.setNom(nom);
    	this.nom=nom;
    }
    public void setDescription(String description){
    	//this.produit.setDescription(description);
    	this.description=description;
    }
    public void setprix(String prix){
    	//this.produit.setPrix(prix);
    	this.prix=Double.valueOf(prix);
    }
    
    public String execute(){
    	Context ctx;
    	

		try {
			ctx = new InitialContext();
			catalog = (CatalogueRemote) ctx.lookup("CatalogueBean/remote");
			
			Produit pdt = new Produit(nom, description, prix);
			catalog.ajouter(pdt);
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}

}