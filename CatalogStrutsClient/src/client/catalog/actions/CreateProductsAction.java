package client.catalog.actions;

import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import catalog.beans.CatalogueRemote;
import catalog.entities.Produit;

import com.opensymphony.xwork2.ActionSupport;

public class CreateProductsAction extends ActionSupport{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    CatalogueRemote catalog;

    public String execute(){
    	Context ctx;
    	
		try {
			ctx = new InitialContext();
			catalog = (CatalogueRemote) ctx.lookup("CatalogueBean/remote");

			Produit pdt1 = new Produit("sel", "pour saler les ptits plats", 1.59);
			Produit pdt2 = new Produit("poivre", "pour poivrer les ptits plats", 2.19);
			Produit pdt3 = new Produit("epices", "pour epicer les ptits plats", 3.58);
			
			catalog.ajouter(pdt1);
			catalog.ajouter(pdt2);
			catalog.ajouter(pdt3);
			

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}

}