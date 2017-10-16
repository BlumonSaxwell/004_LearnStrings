package StringPack;

import javax.swing.JOptionPane;

public class StringIntro {
	
	public static void main(String[] args) {
		
		String msg = "";
		String varWord ="";
		String goAgain = "No";
		
		boolean gameStatus = true;
		while(gameStatus) {
			varWord = JOptionPane.showInputDialog("enter word");
		
			LearnStrings getIt = new LearnStrings(varWord);
			msg = "First char is: " + getIt.getFirstLetter();
			JOptionPane.showMessageDialog(null, msg);
			int lengthTest = getIt.getLength();
			msg = "length = " + lengthTest;
		    JOptionPane.showMessageDialog(null, msg);
		
			char lastLetter = getIt.getLastLetter();
			msg = "Last letter is: " + lastLetter;
			JOptionPane.showMessageDialog(null, msg);
		//msg =("length is: " + lengthTest);
			msg = "middle is " + getIt.getMiddle();
			JOptionPane.showMessageDialog(null, msg);
		
		/*
		 * start:
		 * index = 1
		 * end:
		 * .length()-2
		 * 
		 * use: stubstring (int beginIndex, int endIndex)
		 * .substring(1, word.length()-2)
		 * 
		 * int indexOf(String str)
		 * Returns the index within theis string of the first occurence of the specified character
		 * 
		 * int indesxOf (int ch)
		 * Returns the index within this string of the first occurrence of the specified
		 * 
		 * toLowerCase()
		 * Converts all characters in this string to lower case
		 * 
		 * toUpperCase()
		 * converts all characters in this string to upper case
		 * 
		 */
			msg = "Do you want to go again? Y/N";
			goAgain = JOptionPane.showInputDialog(msg);
			if (goAgain.equalsIgnoreCase("y"))  {
				gameStatus = true;
			}else if (goAgain.equalsIgnoreCase("n")) {
				gameStatus = false;
				JOptionPane.showMessageDialog(null, "good bye");
			}else if (goAgain.equalsIgnoreCase("yes")) {
				gameStatus = true;
			}else if (goAgain.equalsIgnoreCase("no")) {
				gameStatus = false;
				JOptionPane.showMessageDialog(null, "good bye");
			}else {
				msg =("sorry that isnt a valid character");
				JOptionPane.showMessageDialog(null, msg);
				
			
			}
		}
	}
	}

