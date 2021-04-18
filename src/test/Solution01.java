package test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution01 {

	public static String rebuildMessage(String[] parts) {
		 // Write your code here
		 // To debug: System.err.println("Debug messages...");
		  String resultat="";
		  List<String> liste = new ArrayList();
		
		for (int i = 0; i < parts.length; i++) {
		  
			//resultat=resultat.concat(parts[i]);
			
			  liste.add(parts[i]);
			
		}
		
		
	       Collections.sort(liste);
	       resultat=liste.get(0);
		
		//System.out.println("resultat"+liste.get(0));
		
		for (int i = 1; i < liste.size(); i++) {
		
			String last = resultat.substring(resultat.length()-1); // avec substring
				
			String fist=liste.get(i).substring(0, 1); // avec substring;
			
			//System.out.println("-----last-"+last+"---------fist"+fist);
			
			if(last.equals(fist))
			{
				
		   //  System.out.println("------Resultat-------"+resultat.substring(0,resultat.length()-1));
		      
		      
		      resultat= resultat.substring(0,resultat.length()-1).concat(liste.get(i)) ;
				
			}else 
			{
				
				resultat=resultat.concat(liste.get(i));
			}
			
			
		
			
			 // liste.add(parts[i]);
			
		}
		
		
		
		
		
	//	System.out.println(parts[i]);
		
		  
		
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
