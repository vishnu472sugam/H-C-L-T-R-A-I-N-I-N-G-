package com.d;
import java.util.*;
public class CheckString {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
	System.out.println("Enter the humptys sentence:");
	String b = a.nextLine();
	System.out.println("Enter the word to replace:");
	String c = a.nextLine();
	String replaceString = b.replace(b,c);
	System.out.println(replaceString);

	}

}
