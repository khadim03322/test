package test;

import java.io.PrintStream;
import java.util.Scanner;

public class Solution01 {

	public static String rebuildMessage(String[] parts) {
		 // Write your code here
		 // To debug: System.err.println("Debug messages...");
		  String resultat="";
		for (int i = 0; i < parts.length; i++) {
		  
			
			resultat=resultat.concat(parts[i]);
			
			System.out.println(parts[i]);
		}
		  
		
		 return resultat;
		 }
		
		 /* Ignore and do not change the code below */
		 // #region main
		 public static void main(String args[]) {
			 
			 String[] parts= new String[2];
			 parts[0]="BCZ";
			 parts[1]="AB";
			 
			System.out.println("resultat : "+ rebuildMessage(parts)); 
			 
		 
		 }
		 // #endregion
	
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}*/

}
