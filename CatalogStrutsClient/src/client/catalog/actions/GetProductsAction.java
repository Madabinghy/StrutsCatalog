package client.catalog.actions;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import catalog.beans.CatalogueRemote;
import catalog.entities.Produit;

import com.opensymphony.xwork2.ActionSupport;

public class GetProductsAction extends ActionSupport{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
  
 
    CatalogueRemote catalog;
    List<Produit> lesProduits;
    Produit produit;
 
    public List<Produit> getLesProduits() {
		return lesProduits;
    }

    public String execute(){
    	Context ctx;
    	
		try {
			ctx = new InitialContext();
			catalog = (CatalogueRemote) ctx.lookup("CatalogueBean/remote");
			lesProduits =  catalog.getLesProduits();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}

}