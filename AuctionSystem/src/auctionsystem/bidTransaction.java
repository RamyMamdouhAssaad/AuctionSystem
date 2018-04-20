package auctionsystem ;
import java.util.ArrayList;
public class bidTransaction implements Subject {

	public Product product;
	public User User1;
        public double d = product.getProductPrice();
        public double c = product.productPrice;
        String f = Double.toString(c);
        public billingPayment bP ; 
        ArrayList observers;
	public bidTransaction(){
         observers = new ArrayList();
	}

	public void automaticAddingBid(float HighestBidAmount,Product product1,int userID){
            
            product1.setProductPrice(HighestBidAmount);
            boolean condition=product1.auctionSession.endOfAuctionSession();
            if(condition==true)
            {
              product1.setProductPrice(product1.productPrice);
              
              product1=null;
               bP.WinnerUserIDproductID(userID,product1);
            }
            else
            {
                
            }
         }
	
        
	

	public User winnerAnnounce(AuctionSession Final,User User1){
		boolean condition=Final.endOfAuctionSession();
                if(condition==true)
                {
                    
                }
                return User1;
	}

    @Override
    public void addObserver(Observer o) {
          observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
       int i = observers.indexOf(o);
       if(i >=0){
        observers.remove(o);
       }
    }

    @Override
    public void notifyObserver() {
            for (Object observer : observers) {
                Observer o = (Observer) observer;
                o.updatePrice(d);
            }
    }

    @Override
    public void setState(String state) {
       f = state;
        notifyObserver();
    }
  
    @Override
    public double changeProductPrice(double x) {
       c = x;
       return c;
    }

}