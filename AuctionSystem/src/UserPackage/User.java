package UserPackage ; 
import auctionsystem.Admin ;
import auctionsystem.bidTransaction ;
import auctionsystem.billingPayment ;
import auctionsystem.Observer ;

public class User implements Observer {

	private String E_mail;
	private String Name;
	private String Password;
	private int PhoneNumber;
	private int UserID;
	private String Username;
	private int VisaCardNumber;
	public bidTransaction BidTransaction;
	public ProductReadOnly ProductReadOnly1; 
	public Admin Admin1;
        
	public User(String Name , String Password ,int PhoneNumber,int VisaCardNumber){
            this.Name=Name ; 
            this.Password=Password ; 
            this.PhoneNumber=PhoneNumber ; 
            this.VisaCardNumber=VisaCardNumber ; 
	}


	public void enterBidAmount(int number,ProductReadOnly ProductReadOnly1)
        {
           BidTransaction.automaticAddingBid(number,ProductReadOnly1.,this.UserID);
	}

	public void getApprovalToAuction(boolean avaliablity,String ProductCategory,int Productcode,String productDescription,int ProductionYear,String ProductName,double productPrice)
	{
		Admin1.Answertorequest(Productcode,ProductCategory,productDescription,ProductionYear, ProductName, productPrice);
	}

	public String getPassword(){
		return Password;
	}

	public void getSearchResult(){

	}

	public String getUsername(){
		return Username;
	}



	public void setPassword(String password){
            this.Password=password ; 
	}

	public void setUsername(String username){
            this.Username=username; 
	}

	public void viewProfile(){
           System.out.println("UserName:"    +Username);
           System.out.println("Account ID: " +UserID);
           System.out.println ("VisaCard Number:"+VisaCardNumber);
	}

	public void WithdrawMoney(billingPayment Billing){

	}

    @Override
    public void updatePrice(double price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}