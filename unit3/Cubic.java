import javax.swing.*;

public class perfTaskTest
{
    public static void main(String[]args)
    {
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        double idk, place, place2, place3, cbrt, cbrt2, solution, First, Second;
        String Input;
        ImageIcon equ = new ImageIcon("cubic.PNG");
        JOptionPane.showMessageDialog(null, "Wildly inaccurate cubic equation solver, try ayour own precaution!", "Equation", 0, equ);
        Input = JOptionPane.showInputDialog(null, "What is your a value?");
        try{
            a = Double.parseDouble(Input);
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Not a number. Try again.");
            System.exit(0);
        }

        Input = JOptionPane.showInputDialog(null, "What is your b value?");
        try{
            b = Double.parseDouble(Input);
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Not a number. Try again.");
            System.exit(0);
        }
        Input = JOptionPane.showInputDialog(null, "What is your c value?");
        try{
            c = Double.parseDouble(Input);
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Not a number. Try again.");
            System.exit(0);
        }
        Input = JOptionPane.showInputDialog(null, "What is your d value?");
        try{
            d = Double.parseDouble(Input);
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Not a number. Try again.");
            System.exit(0);
        }
        place = (((Math.pow(-b,3)/(27*Math.pow(a,3))) +
                (((b*c)/(6*Math.pow(a,2))) -((b)/(a*2)))));

        place2 = (Math.sqrt(Math.pow((((Math.pow(-b,3))/(27*Math.pow(a,3))) +
                (((b*c)/(6*Math.pow(a,2))) -((d)/(2*a)))), 2))+(Math.pow((((c)/(3*a))-
                        ((b*b)/(9*a*a))),3)));
                        
        System.out.println("First" + place);
        System.out.println("Second"+place2);
        
        First = place+place2;
        System.out.println("First: "+First);
                        
        cbrt = Math.cbrt(First);
        
        System.out.println("First term's cube rooted: "+ cbrt);
        
        place = (((Math.pow(-b,3)/(27*Math.pow(a,3))) +
                (((b*c)/(6*Math.pow(a,2))) -((b)/(a*2)))));

        place2 = (Math.sqrt(Math.pow((((Math.pow(-b,3))/(27*Math.pow(a,3))) +
                (((b*c)/(6*Math.pow(a,2))) -((d)/(2*a)))), 2))+(Math.pow((((c)/(3*a))-
                        ((b*b)/(9*a*a))),3)));
                        
        cbrt2 = Math.cbrt(place-place2);
        
        idk = (b/(3*a));

        solution = cbrt + cbrt2 - idk;

        System.out.println("Third" + place);
        System.out.println("Fourth" + place2);
        System.out.println("idk term"+idk);
        
        System.out.println("Third + Fourth"+ cbrt2);
        JOptionPane.showMessageDialog(null, solution);
        System.out.println("~~~~~~~~~~~~"+solution+ "~~~~~~~~~~~~~~");
    }
}
