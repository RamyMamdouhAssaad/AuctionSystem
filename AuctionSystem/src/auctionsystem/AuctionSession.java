package auctionsystem ;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class AuctionSession {
       public static Timer time;
       public static TimerTask timetask;
       
    	private int dd;
	private int hour;
	private int mins;
	private int mm;
	public Product product;
	private int sec;
	private int yyyy;
	
        public AuctionSession(int day , int month,int year,int hour,int mins, int secs)
        {
           this.dd = day;
           this.mm = month;
           this.yyyy = year;
           this.hour = hour;
           this.mins = mins;
           this.sec = secs;
        }
        
        public void addProduct(int a , String b , String c , int d , String e ,double g)
        {  
          product=new Product(a,b,c,d,e,g);
          setTime() ;
          if(endOfAuctionSession())
          {
              product.setProductPrice(product.productPrice);
              product=null;
          }
        }
       public void deleteProdcut(Product product1)
       {
           if(endOfAuctionSession())
           {
           product1 = null;
           System.out.println("Product Has been deleted Successfully");
           }
           
       }
       public void setTime()
       {
            time = new Timer();
            timetask = new Task();
            time.scheduleAtFixedRate(timetask, 1000, 1000);
           
       }
       public void getTime()
       {
           setTime();
       }
       public void setDate()
       {
            Date dNow = new Date( );
           SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

      System.out.println("Current Date: " + ft.format(dNow));
       }
       public void getDate()
       {
           setDate();
       }
       public boolean endOfAuctionSession()
       {
       return true ; 
       }
       
}       
