package com.vishnu8;

public class Premiumstall implements Stall {
	private String stallname;
	private int cost;
	private String ownname;
	private int projector;
	Premiumstall()
	{
		
	}
	Premiumstall(String stallname,String ownname,int cost,int projector)
	{
		this.stallname=stallname;
		this.ownname=ownname;
		this.cost=cost;
		this.projector=projector;
		}
	public String getStallname() {
		return stallname;
	}
	public void setStallname(String stallname) {
		this.stallname = stallname;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getOwnname() {
		return ownname;
	}
	public void setOwnname(String ownname) {
		this.ownname = ownname;
	}
	public int getProjector() {
		return projector;
	}
	public void setProjector(int projector) {
		this.projector = projector;
	}
	public void display()
	{
		System.out.println("Stallname: "+stallname);
		System.out.println("Cost: "+cost);
		System.out.println("Ownname: "+ownname);
		System.out.println("Projector: "+projector);
	}

}
