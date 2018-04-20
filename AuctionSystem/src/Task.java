/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.TimerTask;
import javax.swing.JOptionPane;

public class Task extends TimerTask {
  
 private int sec=10,min=0,hour=0;
   
      public void announceWinner(String Winner)
    {
       if(sec==0)
           {
                JOptionPane.showMessageDialog(null, Winner);   
                
           }
    }
    @Override
    public void run()
    {
       sec--;
       if(sec==60)
       {
           
           sec = 0;
           
           min--;
           
           
          
       }
       if(min==60)
       {
           
           
         min =0;  
           hour--;
         
       }
      if(hour==24)
      {
          hour=0;
      }
       
      //if(sec==0&&min==0&&hour==0)
      //{
          
      //}
    
    
     
      System.out.println("Time is "+hour+":"+min+":"+sec);
      Page6_BidDetails.getGui().addTime("Time is"+Integer.toString(hour)+":"+Integer.toString(min)+":"+Integer.toString(sec));
    }

}
