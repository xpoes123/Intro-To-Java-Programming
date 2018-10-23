import java.util.*;
import java.text.*;
import javax.swing.*;

public class testUnit2
{
   public static void main(String[] args)
   {
   //pi phones = 37.5 swindles = 59.75. Sales tax = 5.5%. create recipts
   String Input;
   double total1 = 0;
   int piBought = 0;
   int swindBought=0;
   double pi=37.5;
   double swind=59.75;
   double tax=.055;
   double taxAmount = 0;
   double total2 = 0;
   Input = JOptionPane.showInputDialog(null, "How many pi phones did they buy?");
   try{
   piBought = Integer.parseInt(Input);
   }
   catch(NumberFormatException e)
   {
   JOptionPane.showMessageDialog(null, "Not a number. Try again.");
   System.exit(0);
   }
   Input = JOptionPane.showInputDialog(null, "How many Swindles did they buy?");
   try{
   swindBought = Integer.parseInt(Input);
   }
   catch(NumberFormatException e)
   {
   JOptionPane.showMessageDialog(null, "Not a number. Try again.");
   System.exit(0);
   }
   total1 = (piBought * pi) +  (swindBought + swind);
   taxAmount = (total1 * tax);
   total2 = taxAmount + total1;
   //JOptionPane.showMessageDialog(null, "$"+total1);
   DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
   Calendar cal = Calendar.getInstance();
   tax = tax * 100;
   
   JOptionPane.showMessageDialog(null, "Date: "+dateFormat.format(cal.getTime()) + "\nSubtotal: $" + total1 + "\nTax " + tax + "%: $" + taxAmount + "\nTotal: $" + total2);
   }
   }