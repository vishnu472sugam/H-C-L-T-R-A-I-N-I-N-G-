package com.b;
import java.util.*;
public class CheckString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the Humptys sentence");
String b = a.nextLine();
System.out.println("Enter the Dumptys sentence");
String c = a.nextLine();
System.out.println(b.contains(c));

	}

}
