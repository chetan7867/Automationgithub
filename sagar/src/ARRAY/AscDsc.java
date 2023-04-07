package ARRAY;

import java.util.Arrays;

public class AscDsc {

	public static void main(String[] args) {
		
		
		int a [] = {10,20,30,40,50,60};
		
		int size= a.length-1;
		System.out.println(size);
		
		System.out.println ("*******All Info in Array*******");
		
		for(int i = 0; i<=a.length-1;i++) {
			System.out.println(a[i]);
			
		}
         Arrays.sort (a);
         System.out.println("*******All info in array Ascending**********");
         
         for (int i = 0; i<=a.length-1;i++) {
        	 
       
        	 System.out.println(a[i]); }
         
       System.out.println("*******Info in descending********");
        
         
       for (int i = a.length-1; i>=0;i--) {
        	System.out.println(a[i]); }
         
	}

}
