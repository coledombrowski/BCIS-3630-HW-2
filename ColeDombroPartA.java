// Cole Dombrowski - BCIS 3630.2 - Part A

import javax.swing.JOptionPane;
public class ColeDombroPartA
{
   public static void main(String[] args)
   {      
      // Establishing integers
      int courseCost ;
      int courseExtra ;
      int courseExtraCost ;
      int extraCost ;
      int extraHours ;
      int extraPayment ;
      int campusFees = 800 ;
      
      // Calculate tuition cost
      int courseHours ;
      String str ;
      str = JOptionPane.showInputDialog("How many course hours have you taken?");
      courseHours = Integer.parseInt(str) ;
      
      if (courseHours <= 12)
      {
         courseCost = courseHours * 300 ;
      }
      else
      {
         courseExtra = courseHours - 12 ;
         extraCost = courseExtra * 250 ;
         // 3600 comes from what the standard 12 hours will cost
         courseCost = 3600 + extraCost ;
      }
      
      System.out.printf("Your tuition cost will be " + courseCost + "$.");
      
      // Calculate course fees
      int courseFees ;
      String strg ;
      strg = JOptionPane.showInputDialog("Enter your course hours once again." + 
                           "\nThis will calculate your course fees.");
      courseFees = Integer.parseInt(str) ; 
      
      if (courseFees <= 9)
      {
         courseExtraCost = courseHours * 75 ;
      }
      else
      {
         extraHours = courseFees - 9 ;
         extraPayment = extraHours * 50 ;
         courseExtraCost = 675 + extraPayment ;
      }
      
      System.out.printf("\nYour course fees will be " + courseExtraCost + "$.");
      
      // Display campus fees
      System.out.printf("\nYour campus fee is " + campusFees + "$.");
         
      //Display total cost      
      int totalCost = courseCost + courseExtraCost + campusFees ;
      JOptionPane.showMessageDialog(null, "Your total tuition cost is "
                           + totalCost + "$.");
      System.out.printf("\nYour total costs are " + totalCost + "$.") ;
      
      // End of program
      System.exit(0) ; 
       
   }

}