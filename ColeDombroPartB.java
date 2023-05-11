// Cole Dombrowski - BCIS 3630.2 - Part B

import javax.swing.JOptionPane;
public class ColeDombroPartB
{
   public static void main(String[] args)
   {   
      // State tax for every case
      double stateTax ;
      stateTax = 0.0825 ;
      
      // Initialize variables
      double salesTax ;
      double totalCost ;
      
      // First option box that will pop up, will contain menu choices
      String flavorChoice ;
      flavorChoice = JOptionPane.showInputDialog("Welcome! Here's the menu, chose your snow cone flavor:" +
                              "\n------------------------------------------------------" +
                              "\nOption (A): Plain Snow Cone, $1.50" +
                              "\nOption (B): Plain Cone with Cream, $1.75" +
                              "\nOption (C): Rainbow (5 or more flavors), $2.00" +
                              "\nOption (D): Rainbow with Cream, $2.25" +
                              "\nOption (E): Shaved Ice, $2.50" +
                              "\nOption (F): Shaved Ice with Cream, $2.75" +
                              "\n------------------------------------------------------" +
                              "\nPlease enter the corresponding letter for your choice below.") ;
      String choice = flavorChoice ;              
      
      // Start of the switch statement
      switch (choice)
      {
         case "a":
         case "A":
            salesTax = 1.50 * stateTax ;
            totalCost = salesTax + 1.50 ;
            JOptionPane.showMessageDialog(null, "You chose the Plain Snow Cone." +
                                 "\nYour total cost with tax is $" + totalCost + "." +
                                 "\nThank you for your purchase!") ;
            break;
         case "b":
         case "B":
            salesTax = 1.75 * stateTax ;
            totalCost = salesTax + 1.75 ;
            JOptionPane.showMessageDialog(null, "You chose the Plain Snow Cone with Cream." +
                                 "\nYour total cost with tax is $" + totalCost + "." +
                                 "\nThank you for your purchase!") ;
            break;
         case "c":
         case "C":
            salesTax = 2.00 * stateTax ;
            totalCost = salesTax + 2.00 ;
            JOptionPane.showMessageDialog(null, "You chose the Rainbow (5 or more flavors)." +
                                 "\nYour total cost with tax is $" + totalCost + "." +
                                 "\nThank you for your purchase!") ;
            break;
         case "d":
         case "D":
            salesTax = 2.25 * stateTax ;
            totalCost = salesTax + 2.25 ;
            JOptionPane.showMessageDialog(null, "You chose the Rainbow with Cream." +
                                 "\nYour total cost with tax is $" + totalCost + "." +
                                 "\nThank you for your purchase!") ;
            break;
         case "e":
         case "E":
            salesTax = 2.50 * stateTax ;
            totalCost = salesTax + 2.50 ;
            JOptionPane.showMessageDialog(null, "You chose the Shaved Ice." +
                                 "\nYour total cost with tax is $" + totalCost + "." +
                                 "\nThank you for your purchase!") ;
            break;
         case "f":
         case "F":
            salesTax = 2.75 * stateTax ;
            totalCost = salesTax + 2.75 ;
            JOptionPane.showMessageDialog(null, "You chose the Shaved Ice with Cream." +
                                 "\nYour total cost with tax is $" + totalCost + "." +
                                 "\nThank you for your purchase!") ;
            break;
         default:
            JOptionPane.showMessageDialog(null,"You did not enter a letter corrsponding to a menu item." +
                                    "\nPlease enter in a valid input to continue with your purchase.") ;          
      }  
        
      // End of program   
      System.exit(0) ;
      
   }

}   