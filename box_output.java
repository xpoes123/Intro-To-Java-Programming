// Programmer: David Jiang, MADLIB 1, 10-2-18
// Github Link: https://github.com/xpoes123/Intro-To-Java-Programming/
// Original Story: https://www.youtube.com/watch?v=omj9K2J71Zk
// Images: • https://goo.gl/MwaFwL 
//        • https://goo.gl/pD2oFn
//        • https://goo.gl/3g81ZW
//        • https://goo.gl/9uhkUx
//        • https://goo.gl/YbnpFp


/*************************************************************
TODO List:
1. Re-find the Welcome photo with reverse searching  - Done
2. ~~~Upload to Github~~~                            - Done
3. Turn in                                           - WIP
*************************************************************/


//Framework
import javax.swing.*;
public class box_output { 
    public static void main(String[] args){
         //Declaring String Variables
         String noun, verb, name, name2, adjective;
		 
         //ImageIcon 
         ImageIcon Verb = new ImageIcon("/media/Capture.PNG");
         ImageIcon Noun = new ImageIcon("/media.Capture2.PNG");
         ImageIcon Name = new ImageIcon("Capture3.PNG");
         ImageIcon Adjective = new ImageIcon("/media/adjective.png");
         ImageIcon Welcome = new ImageIcon("/media/welcome.png");
         ImageIcon Stack = new ImageIcon("/media/stack.png");
         ImageIcon Gif = new ImageIcon("/media/sheldon.gif");
		 
         //DropDown Menu options
         String[ ] verbitems = {"Run", "Jump", "Dance", "Pee"};
		 
         //Introduction Dialog
         JOptionPane.showMessageDialog(null, "Welcome to David Jiang's Madblib!", "Welcome!",-1, Welcome);
         JOptionPane.showMessageDialog(null, "Madlib works by you giving random words with the only parameter being the part of speech, afterwards you will see what your story becomes.", "Instructions:", -1, null);
         
         //Madlib Questions
         name = (String)JOptionPane.showInputDialog(null,"Give me a person's name", "Name", -1, Name, null, null);
         
         name2 = (String)JOptionPane.showInputDialog(null,"Give me another person's name", "Mame", -1, Name, null, null);
         
         noun = (String)JOptionPane.showInputDialog(null,"Give me a noun", "Noun", -1, Noun, null, null);
         
         verb = (String)JOptionPane.showInputDialog(null,"Give me a verb?", "Verb", -1, Verb, verbitems, verbitems[2]);
         
         adjective = (String)JOptionPane.showInputDialog(null, "Give me an adjective?", "Adjevtive", -1, Adjective, null, null);
         //Final Story
        JOptionPane.showMessageDialog(null, "There once was a brave lad named " + name + "\nWith a fi fi fiddle dee dee,\n who faced a " + adjective + " " + noun + "\n while " + name2 + " just needed to " + verb, " your MadLib", -1, null);
        //video
        JOptionPane.showMessageDialog(null, "Video", "First Few Frames", -1, Gif);
   }

}