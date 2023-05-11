// Cole Dombrowski - BCIS 3630.2 - Part C

import java.util.Scanner ;
public class ColeDombroPartC
{
   public static void main(String[] args)
   {            
      // Variable initialization
      double adCost ;
      
      // Cost rates
      double rateOne ;
      rateOne = .20 ;
      double rateTwo ;
      rateTwo = .18 ;
      double rateThree ;
      rateThree = .15 ;
      double rateFour ;
      rateFour = .12 ;
      
      int adClicks ;
      Scanner keyboard = new Scanner(System.in) ;
      System.out.print("How many times was your internet ad clicked?\n") ;
      adClicks = keyboard.nextInt() ;    
      
      if (adClicks > 1 && adClicks < 50) 
         {
            adCost = adClicks * rateOne ;
            System.out.println("There was " + adClicks + " clicks at a rate of " + rateOne + "$ per click, for a total cost of " + adCost + "$.") ;
         }  
      else if (adClicks > 50 && adClicks < 151)
         {
            adCost = adClicks * rateTwo ;
            System.out.println("There was " + adClicks + " clicks at a rate of " + rateTwo + "$ per click, for a total cost of " + adCost + "$.") ;
         }
      else if (adClicks > 151 && adClicks < 301)
         {
            adCost = adClicks * rateThree ;
            System.out.println("There was " + adClicks + " clicks at a rate of " + rateThree + "$ per click, for a total cost of " + adCost + "$.") ;
         }
      else if (adClicks >= 301)
         {
            adCost = adClicks * rateFour ;
            System.out.println("There was " + adClicks + " clicks at a rate of " + rateFour + "$ per click, for a total cost of " + adCost + "$.") ;
         }
      else
         {
            System.out.println("You will not pay anything if your ad did not recieve any clicks.") ;           
         }
        
      // End of program
      System.exit(0) ;
      
   }

}   