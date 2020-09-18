package com.s;

public class Exhibition extends Parent {
	private int noOfStall;
	public Exhibition(String name,String detail,String ownername,int noOfStall, int noOfShows, int noOfSeatsPerShow)
	{
		this.noOfStall=noOfStall;
	}
	public int getNoOfStall() {
		return noOfStall;
	}
	public void setNoOfStall(int noOfStall) {
		this.noOfStall = noOfStall;
	}
public void display()
{
	System.out.println("name: "+super.name);
	System.out.println("detail: "+super.detail);
	System.out.println("ownername: "+super.ownername);
	System.out.println("noofstall: "+noOfStall);
	
	
	
	
}
}
