/*
 * Programmer: David Jiang
 * Github: https://tinyurl.com/tictactoe-MHS
 * WIP
 */
//imports
import javax.swing.*;
public class testUnit3
{
	//all my dumb variables 
static String[] game;
static String input;
static int n = 0;
static boolean winx = false;
static boolean wino = false;
static String turn = "X";
static String lvalue = "---";
static String lvalue1 = "---";
static String lvalue2 = "---";
static String lvalue3 = "---";
static String lvalue4 = "---";
static String lvalue5 = "---";
static String lvalue6 = "---";
static String lvalue7 = "---";

//this is the meat of the program!
public static void main(String[] args) {
   game = new String[9];//creates game board
   for (int a = 0; a < 9; a++) {
			game[a] = String.valueOf(a+1);
         }
         game();//asks the question on where they want to go
         win();//I have no idea where this needs to go
   int result = Integer.parseInt(input);	
	System.out.println(result);
   while(wino == false && winx == false)//game
   {
	   win();//I have no idea where this needs to go
	   javasucks();//this is where I got mad and didn't know how to test for winning, until I figured it out.
	   
   if(result == n+1)//tests for whether the placement of the piece works, and then places the piece
   {
   game[n] = String.valueOf(turn);
   n += 1;
   game();
   win();//I have no idea where this needs to go
   result = Integer.parseInt(input);	
   if (turn.equals("X")) {//turn switcheroo
					turn = "O";
               n = 0;
				} else {
					turn = "X";
               n = 0;
				}
   }
   else//finds the piece that the user wants to add to.
	   win();//I have no idea where this needs to go
   n += 1;
   }
   JOptionPane.showMessageDialog(null, "Win");//win tester
   }
   public static void javasucks()//also win tester
   {
	   if(winx == true)
	   {
		   System.out.println("holy fuck this actually works");
	   }
	   else if(wino == true)
	   {
		   System.out.println("Holy fuck this actually works");
	   }
   }
   public static void win()//win checker
   {
	   //finds out whether there are 3 in a row in all possible win possibilities
				lvalue = game[0] + game[1] + game[2];
				lvalue1 = game[3] + game[4] + game[5];
				lvalue2 = game[6] + game[7] + game[8];
				lvalue3 = game[0] + game[3] + game[6];
				lvalue4 = game[1] + game[4] + game[7];
				lvalue5 = game[2] + game[5] + game[8];
				lvalue6 = game[0] + game[4] + game[8];
				lvalue7 = game[2] + game[4] + game[6];
				System.out.println(lvalue +", "+ lvalue1 +", "+ lvalue2 +", "+ lvalue3 +", "+ lvalue3 +", "+ lvalue4 +", "+ lvalue5 +", "+lvalue6 +", "+lvalue7);//testing whether it is showing when I win
			//all if statements to check for the winners
				if (lvalue.equals("XXX")) {
				winx = true;
				JOptionPane.showMessageDialog(null, "test1");
			} else if (lvalue.equals("OOO")) {
				wino = true;

			}
         if (lvalue1.equals("XXX")) {
				winx = true;

			} else if (lvalue1.equals("OOO")) {
				wino = true;

			}
         if (lvalue2.equals("XXX")) {
				winx = true;

			} else if (lvalue2.equals("OOO")) {
				wino = true;

			}
         if (lvalue3.equals("XXX")) {
				winx = true;
			} else if (lvalue3.equals("OOO")) {
				wino = true;
			}
         if (lvalue4.equals("XXX")) {
				winx = true;
			} else if (lvalue4.equals("OOO")) {
				wino = true;
			}
         if (lvalue5.equals("XXX")) {
				winx = true;
			} else if (lvalue5.equals("OOO")) {
				wino = true;
			}
         if (lvalue6.equals("XXX")) {
				winx = true;
			} else if (lvalue6.equals("OOO")) {
				wino = true;
			}
         if (lvalue7.equals("XXX")) {
				winx = true;
			} else if (lvalue7.equals("OOO")) {
				wino = true;
			}
			
		}

   
    public static void game()//calls the question
   {
    	win();
    input = JOptionPane.showInputDialog(game[0] + " | " + game[1] + " | " + game[2] + "\n----------- \n" + game[3] + " | " + game[4] + " | " + game[5]+"\n----------- \n" + game[6] + " | " + game[7] + " | " + game[8] + "\nChose a game space to occupy");
       
}
}
