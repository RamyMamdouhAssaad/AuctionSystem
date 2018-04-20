package auctionsystem ; 

public class Admin {
    
	private AuctionSession Auctionsession;
	private static Admin instance = null;
	private String Password;
	private String Username;
        private Product product ; 
        private Admin()
        {}
                 
        public void setUsername(String name){
            
            this.Username = name;

	}
        
	public void setPassword(String password){
            this.Password = password;

	}
        
        public String getUsername(){
		return Username;
	}

        public String getPassword(){
		return Password;
	}
        
	public static Admin getInstance(){
            
                if(instance == null)
                {
                    instance = new Admin();
                }
		return instance;
	}
        
        
	public AuctionSession CreateAuctionSession(){
            
            Auctionsession.setDate();
            Auctionsession.setTime();
            return Auctionsession;

        }

	public void deleteProduct(Product product1){
            product1 = null;
           System.out.println("Product Has been deleted Successfully");
	}
            

       	public void updateProduct(Product product1){
            product1.setAvalibality(product1.avaliablity);
            product1.setProductCategory(product1.ProductCategory);
            product1.setProductCode(product1.Productcode);
            product1.setProductName(product1.ProductName);
            product1.setProductDescription(product1.productDescription);
            product1.setProductionYear(product1.ProductionYear);
            product1.setProductPrice(product1.productPrice);
	}
        public boolean Answertorequest(int Productcode,String ProductCategory,String productDescription,int ProductionYear,String ProductName,double productPrice)
        { 
         product=new Product(Productcode,ProductCategory,productDescription,ProductionYear,ProductName,productPrice);
         return true ;
        }
 

}
