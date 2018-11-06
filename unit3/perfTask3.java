import javax.swing.*;
import java.util.*;
import java.text.*;

public class perfTask3
{
   public static void main(String[]args)
   {
   int a = 0;
   int b = 0;
   int c = 0;
   double root1, root2, rootsTester;
   String Input;
   Input = JOptionPane.showInputDialog(null, "What is your a value?");
   try{
   a = Integer.parseInt(Input);
   }
   catch(NumberFormatException e)
   {
   JOptionPane.showMessageDialog(null, "Not a number. Try again.");
   System.exit(0);
   }
   
   Input = JOptionPane.showInputDialog(null, "What is your b value?");
   try{
   b = Integer.parseInt(Input);
   }
   catch(NumberFormatException e)
   {
   JOptionPane.showMessageDialog(null, "Not a number. Try again.");
   System.exit(0);
   }
   
   Input = JOptionPane.showInputDialog(null, "What is your c value?");
   try{
   c = Integer.parseInt(Input);
   }
   catch(NumberFormatException e)
   {
   JOptionPane.showMessageDialog(null, "Not a number. Try again.");
   System.exit(0);
   }
   
   rootsTester = b * b -4 *a*c;
   if(rootsTester > 0)
   {
      JOptionPane.showMessageDialog(null, "Roots are both real and unequal");
      root1 = (-b + Math.sqrt(rootsTester))/(2*a);
      root2 = (-b - Math.sqrt(rootsTester))/(2*a);
      JOptionPane.showMessageDialog(null, "Your roots are " + root1 + "& " + root2);
      }  
   else if(rootsTester == 0)
   {
      JOptionPane.showMessageDialog(null, "Roots are both real and equal");
      root1 = (-b + Math.sqrt(rootsTester))/(2*a);
      JOptionPane.showMessageDialog(null, "Your root is " +root1);
      }
   else
   {
      JOptionPane.showMessageDialog(null, "Your Roots are imaginary");
      }
   }
}
