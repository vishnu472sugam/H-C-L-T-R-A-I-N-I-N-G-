package com.f;

import java.util.Scanner;
class CheckString { 
    public static String insertString( 
        String originalString, 
        String stringToBeInserted,int index) 
    { 
        String newString = new String(); 
  
        for (int i = 0; i < originalString.length(); i++) { 
            newString += originalString.charAt(i); 
            if (i == index) { 
                newString += stringToBeInserted; 
            } 
        }  
        return newString; 
    }  
    @SuppressWarnings("resource")
	public static void main(String[] args) 
    { 
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the humptys sentence:");
    	String originalString = sc.nextLine();
    	System.out.println("Humpty says : "+originalString);
    	System.out.println("What Dumpty want to insert & where?");
    	String stringToBeInserted=sc.nextLine();
    	System.out.println("Enter Position : ");
    	int index=sc.nextInt();
       /* String originalString = "GeeksGeeks"; 
        String stringToBeInserted = "For"; 
        int index = 4; */
        System.out.println("Original String: "
                           + originalString); 
        System.out.println("String to be inserted: "
                           + stringToBeInserted); 
        System.out.println("String to be inserted at index: "
                           + index);  
        System.out.println("Modified String: "
                           + insertString(originalString, 
                                          stringToBeInserted, 
                                          index)); 
    } 
}
