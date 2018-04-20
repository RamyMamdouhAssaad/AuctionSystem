package auctionsystem ;
class Product implements Observer  {

	public AuctionSession auctionSession;
	boolean avaliablity;
	public String ProductCategory;
	public int Productcode;
	public String productDescription;
	public int ProductionYear;
	public String ProductName;
	public double productPrice;
	public User user;
	public bidTransaction Bid_Transaction;
        Subject BidTransactions ;
	public Product(int Productcode,String ProductCategory,String productDescription,int ProductionYear,String ProductName,double productPrice)
        
        {
            this.Productcode=Productcode ; 
            this.ProductCategory=ProductCategory ; 
            this.productDescription=productDescription ; 
            this.ProductionYear=ProductionYear ; 
            this.ProductName=ProductName ; 
            this.productPrice=productPrice ; 
            avaliablity =true ; 

	}
        public Product(Subject bidtransaction)
        {
            this.BidTransactions = bidtransaction;
            BidTransactions.addObserver(this);  
        }

	public void displayProductDetails(int Productcode)
        {
            
	}

	public boolean getAvaliablity()
        {
	return avaliablity ; 
	}

	public String getProductCategory(){
		return ProductCategory ;
	}

	public int getProductCode(){
		return Productcode;
	}

	public String getProductDescription(){
		return productDescription;
	}

	public int getProductionYear(){
		return ProductionYear;
	}

	public String getProductName(){
		return ProductName;
	}

	public double getProductPrice(){
		return productPrice;
	}

	/**
	 * 
	 * @param isavailable
	 */
	public void setAvalibality(boolean isavailable){
            avaliablity=isavailable ; 
	}

	/**
	 * 
	 * @param Code
	 */
	public void setProductCode(int Code){
            Productcode =Code ; 
	}

	public void setProductCategory(String category){
         ProductCategory=category ;    
	}

	public void setProductDescription(String description){
            productDescription=description ; 
	}

	public void setProductionYear(int year){
            ProductionYear=year ; 
	}

	
	public void setProductName(String Name){
            ProductName=Name ; 
	}

	/**
	 * 
	 * @param price
	 */
	public void setProductPrice(double price){
            productPrice=price ; 
	}

	public void updatePrice(float Price){

            productPrice=Price ; 
	}

    @Override
    public void updatePrice(double price) {
        this.productPrice = price;
        System.out.println("Current Price is :" + productPrice);
    }


}