/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeprinter;

/**
 *
 * @author jeyasri
 */
import java.util.Scanner;

public class PrimePrinter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
       
      Scanner get = new Scanner(System.in);  //Scanner Instance
      int i = 0, num =0; // Iterators
      String  primeNumbers = ""; // Empty String
      
      
      for (i = 20; i <= 100; i++)  	   
      { 		 		  
         int ctr=0; 		  
         for(num =i; num>=1; num--)
         {
	    if(i%num==0)
	    {
		ctr = ctr + 1;
	    }
	 }
	 if (ctr ==2)
	 {
	    
	    primeNumbers = primeNumbers + i + " "; //Append to String
	 }	
      }	
      System.out.println("Prime numbers from 20 to 100 are :");
      System.out.println(primeNumbers);
    }
    
}
