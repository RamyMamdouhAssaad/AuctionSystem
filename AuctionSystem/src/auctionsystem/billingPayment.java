package auctionsystem ; 

/**
 * @author Mena108
 * @version 1.0
 * @created 11-May-2015 07:33:47
 */
public class billingPayment  {

	public Product product;
	public User user;
	public bidTransaction Bid_Transaction;
	public AuctionSession AuctionSession;

	public billingPayment(){

	}


	public double getFinalProductPrice(double productprice){
		return productprice;
	}

	public String getproductName(String name){
		return name;
	}

	public int getUserID(int userid)
                
        {
         return userid ;    
        }

	public void updatePrice(float Price){

	}

	public void WinnerUserIDproductID(int userID, Product product)
        {
            getFinalProductPrice(product.productPrice);
            getproductName(product.ProductName);
            getUserID(userID);
	}

}