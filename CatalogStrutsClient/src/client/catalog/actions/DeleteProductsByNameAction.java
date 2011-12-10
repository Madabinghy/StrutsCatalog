package client.catalog.actions;

import java.util.Iterator;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import catalog.beans.CatalogueRemote;
import catalog.entities.Produit;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteProductsByNameAction extends ActionSupport{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    CatalogueRemote catalog;
    //private Produit produit;
    
    private String[] productTodelete;
    public String[] getProductTodelete() {
        return productTodelete;
    }

    public void setProductTodelete(String[] productTodelete) {
       this.productTodelete = productTodelete;
    }

    
    public String execute(){
    	Context ctx;
    	

		try {
			ctx = new InitialContext();
			catalog = (CatalogueRemote) ctx.lookup("CatalogueBean/remote");

	    	for(String name : productTodelete){
	    		catalog.deleteByName(name);
	    	}
			
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}

}