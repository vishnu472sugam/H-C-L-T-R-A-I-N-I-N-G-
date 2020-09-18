package com.vishnu8;

public class Goldstall implements Stall {
private String stallname;
private int cost;
private String ownname;
private int numscr;
Goldstall(){
	}
Goldstall(String stallname,String ownname,int cost,int numscr)
{
	this.stallname=stallname;
	this.ownname=ownname;
	this.cost=cost;
	this.numscr=numscr;
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
public int getNumscr() {
	return numscr;
}
public void setNumscr(int numscr) {
	this.numscr = numscr;
}
public void display()
{
	System.out.println("Stallname: "+stallname);
	System.out.println("Ownername: "+ownname);
	System.out.println("Cost: "+cost);
	System.out.println("Number of screen: "+numscr);
}
}
