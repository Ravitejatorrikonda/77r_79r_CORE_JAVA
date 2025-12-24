package com.loops;

public class Example10 {
	
	public static void fibonacciSeries(int num) {
		
		int first=0;
		int second=1;
		while(first<=num) {
			int next=first+second;
			System.out.println(first+" ");
			first=second;
			second=next;
		}
		
		
	}
	
	

	public static void main(String[] args) {
		fibonacciSeries(10);
				

	}

	
	/**
	int first=0;
	int second=1;
	System.out.println(first+" "+second);
	int next=0;
	while(next<num) {
		next=first+second;
		System.out.println(next);
		first=second;
		second=next;
	}
	
	 * int first=0;
		int second=1;
		System.out.println("fabonacci series"+first+","+second);
		
		while(true) {
		int next=first+second;
				if(next>num) {
		break;		}
		System.out.println(next);
		first=second;
		second=next;
			
			
		}
	 * 
	 * 
	 */
}
