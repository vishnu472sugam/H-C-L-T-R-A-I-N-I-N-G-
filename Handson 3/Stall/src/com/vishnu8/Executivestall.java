package com.vishnu8;

public class Executivestall implements Stall {
	private String stallname;
	private String ownname;
	private int cost;
	private int tvscreen;
	Executivestall()
{
}
	Executivestall(String stallname,String ownname,int cost,int tvscreen)
	{
		this.stallname=stallname;
		this.ownname=ownname;
		this.cost=cost;
		this.tvscreen=tvscreen;
	}

	public String getStallname() {
		return stallname;
	}
	public void setStallname(String stallname) {
		this.stallname = stallname;
	}
	public String getOwnname() {
		return ownname;
	}
	public void setOwnname(String ownname) {
		this.ownname = ownname;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getTvscreen() {
		return tvscreen;
	}
	public void setTvscreen(int tvscreen) {
		this.tvscreen = tvscreen;
	}
	public void display()
	{
		System.out.println("Stallname: "+stallname);
		System.out.println("Ownname: "+ownname);
		System.out.println("Cost: "+cost);
		System.out.println("Tvscreen: "+tvscreen);
	}
}
		
		
	}