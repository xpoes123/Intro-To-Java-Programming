package cubic;
import javax.swing.*;
import java.util.*;
import java.text.*;

public class perfTaskTest
{
   public static void main(String[]args)
   {
   double a = 0;
   double b = 0;
   double c = 0;
   double d = 0;
   double root1, root2, root3, rootsTester, place, place2, place3;
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
   Input = JOptionPane.showInputDialog(null, "What is your d value?");
   try{
   d = Integer.parseInt(Input);
   }
   catch(NumberFormatException e)
   {
   JOptionPane.showMessageDialog(null, "Not a number. Try again.");
   System.exit(0);
   }
   place = Math.cbrt(((Math.pow(-b,3)/(27*Math.pow(a,3)) + ((b*c)/(6*Math.pow(a,2)) -((b)/(a*2))))));
   place2 = (Math.sqrt(Math.pow((((Math.pow(-b,3))/(27*Math.pow(a,3))) + ((b*c)/(6*Math.pow(a,2)) -((d)/(2*a)))), 2)+(Math.pow((((c)/(3*a))-((b*b)/(9*a*a))),3))));

    System.out.println(place);
    System.out.println(place2);
      }
}
