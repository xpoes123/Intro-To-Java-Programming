import javax.swing.*;
import java.util.*;
import java.text.*;

public class perfTaskTest
{
   public static void main(String[]args)
   {
   int a = 0;
   int b = 0;
   int c = 0;
   int d = 0;
   double root1, root2, root3, rootsTester, place;
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
    +
   Input = JOptionPane.showInputDialog(null, "What is your c value?");
   try{
   c = Integer.parseInt(Input);
   }
   catch(NumberFormatException e)
   {
   JOptionPane.showMessageDialog(null, "Not a number. Try again.");
   System.exit(0);
   }
   try{
   d = Integer.parseInt(Input);
   }
   catch(NumberFormatException e)
   {
   JOptionPane.showMessageDialog(null, "Not a number. Try again.");
   System.exit(0);
   }
 place = Math.cbrt(((b*c)/(6*a*a)) - ((d)/(2*a)) - ((b*b*b)/(27*a*a*a))+ (Math.sqrt((Math.pow(((b*c)/(6*a*a) - ((d)/(2a)-((b*b*b)/(27*a*a*a), 2) + Math.pow(((c)/(3*a))-((b*b)/(9*a*a)), 3)) + (Math.cbrt(((b*c)/(6*a*a))-((d)/(2*a))-((b*b*b)/(27*a*a*a))-(Math.sqrt(Math.pow(((b*c)/(6*a*a))-((d)/(2*a))-((b*b*b)/(27*a*a*a)),2))+(Math.pow(((c)/(3*a))-((b*b)/(9*a*a)), 3))-((b)/(3*a));
  System.out.print(place);
      }
}
