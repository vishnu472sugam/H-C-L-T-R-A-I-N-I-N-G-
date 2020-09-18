package com.q;
import java.util.Scanner;
public class Main{
	int no;
	public Main(int no)
	{
		this.no=no;
	}
	static void display()
	{
		System.out.println("Enter the value");
	}
@SuppressWarnings({ "resource", "unused" })
public static void main(String []args)
{
	Scanner sc = new Scanner(System.in);
	int no = sc.nextInt();
	Main obj = new Main(no);
	Main.display();
}
}