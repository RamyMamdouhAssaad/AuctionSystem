/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auctionsystem;
import java.util.TimerTask;
/**
 *
 * @author Mena108
 */
public class Task extends TimerTask {
 private int sec=0,min=0,hour=0;    
    
    @Override
    public void run()
    {
       sec++;
       if(sec==60)
       {
           sec = 0;
           min++;
       }
       if(min==60)
       {
           min=0;
           hour++;
       }
      if(hour==24)
      {
          hour=0;
      }
    
      System.out.println("Time is "+hour+":"+min+":"+sec);
     // TimerTest.getGui().addTime("Time is"+Integer.toString(hour)+":"+Integer.toString(min)+":"+Integer.toString(sec));
    }

}
