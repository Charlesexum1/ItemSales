/*
 * ItemSales.java
 * 
 * Copyright 2016 graf <graf@chillosphere.spacepotato>
 * 
 *
 * 
 * 
 */
import java.util.Scanner;

public class ItemSales {
	
	private int numSold;
	private double sales;
	private double costPerItem;
	private int bulkSale = 10;
	private double bulkDisc = sales * 0.10;
	private double totalDisc = bulkDisc;
	
	public void registerSale(int n){
		
		numSold = n;
		
		if (n >= bulkSale){
			
			sales = 0.9 * ((double)numSold * costPerItem);
			totalDisc = ((double)numSold * costPerItem) - sales;
			}
		else {
		sales = (double)numSold * costPerItem;
		totalDisc = 0;
		
	}
		
		
		}
	
	public void setCost(double cost){
		costPerItem = cost;
		}
	
	public void displaySales(){
		System.out.println("You sold: " + numSold);
		System.out.println("Price: " + costPerItem);
		System.out.println("Sales: " + sales);
		System.out.println("Total discount " + totalDisc);
		}
		
	public static void main (String args[]) {
		ItemSales demo = new ItemSales();
		demo.setCost(10.00);
		demo.registerSale(10);
		demo.displaySales();
		demo.setCost(1.00);
		demo.registerSale(9);
		demo.displaySales();
		demo.setCost(2.34);
		demo.registerSale(44);
		demo.displaySales();
		
		
		
	}
}

