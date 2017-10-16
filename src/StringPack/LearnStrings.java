package StringPack;

import javax.swing.JOptionPane;

public class LearnStrings {
		
		private String word = "";
	
		public LearnStrings(String s) 
		{
			setString(s);
		}	// end of constructor
		
		public void setString(String s) {
			
			word = s;
			//System.out.println("String entered is: " + word);
			String msg = "String entered is: " + word; 
			JOptionPane.showMessageDialog(null, msg);
		} // end setString
		
		public char getFirstLetter() {
			
			return word.charAt(0);	
		
			
		} // end of method getFirstLetter()

		public int getLength() {
			
			return word.length();
		}
		
		public char getLastLetter() {
			
			return word.charAt(word.length()-1);
			
		}

		public String getMiddle() {

			return word.substring(1, word.length()-1);
			
			/*
			 * setters -- purpose is to control setting vars
			 * another name is "modifier" and older name is "mutator"
			 * 
			 * getter -- purpose is to retirve vars also in a controlled way
			 * another name is "accessor" method
			 */
		}
		
} // end of class
