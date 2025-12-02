package com.loops;

public class Example6 {
	/**
	 * 
	 * While loop:-
	 * ------------
	 * 
	 * Neon Number 
	 * Amstrong Number
	 * 
	 *  153-> count->3
	 *  
	 * 
	 */
	
	public int getPower(int base, int exp) {
		
		int power=1;
		for(int i=1; i<=exp;i++) {
			power=power * base;
		}
		return power;
		
		
	}

	public int getCount(int num) {
	int count=0;
	while(num !=0) {
		count++;
		num /=10;
		
	}
		return count;
	}
	
	public boolean getSum(int num) {
		int count= getCount(num);
		int temp=num;
		int sum=0;
		while(num !=0) {
			int rem=num %10;
			sum=sum + getPower(rem, count);
			num /=10;
		}
		return sum == temp;
	}
	
	public boolean isPrime(int num) {
		int count=0;
		for(int i=1; i<=num; i++) {
			if(num % i==0) {
			count++;	
			}
			
		}
		return count==2;
	}
	
	public static void main(String[] args) {
		Example6 obj=new Example6();
//		System.out.println((obj.getSum(154))? "amstrong": "Not a amstrong");
//		int i=1;
//		do {
//			System.out.println(i);
//			
//		}
//		while(++i<=10);
		
		System.out.println((obj.isPrime(5))? "Prime": "! Prime");
		

	}

}
