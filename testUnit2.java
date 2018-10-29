/*
Programmer: David Jiang
Name: Recipt Performance Task
Github: https://github.com/xpoes123/Intro-To-Java-Programming/blob/master/testUnit2.java
*/



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
   
   ImageIcon NSB = new ImageIcon("download.jfif");
   
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
   tax = tax * 100;
   
   DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
   Calendar cal = Calendar.getInstance();
   
   JOptionPane.showMessageDialog(null, "Local Business Name" + "\nDate: "+dateFormat.format(cal.getTime()) + "\nSwindles quantity: " + swindBought + "*$59.75"+"\nPiPhones quantity: "+piBought + "*$37.50" +"\nSubtotal: $" + total1 + "\nTax " + tax + "%: $" + taxAmount + "\nTotal: $" + total2+"\n\nTell us what you think! \nWe want to hear about your recent experience in one of our shops. \nKeep the receipt, take our 1-minute survey and receive a surprise offer!\nhttps://tinyurl.com/mhslocalsurvey", "Recipt", -1, NSB);
   }
   }
