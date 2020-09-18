package com.c;
import java.util.Scanner;
public class CheckString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the Humptys sentence");
String b = a.nextLine();
StringBuffer c = new StringBuffer(b);
System.out.println(c.reverse());
	}

}
