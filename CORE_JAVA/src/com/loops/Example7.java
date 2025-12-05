package com.loops;

public class Example7 {

	
	public boolean isPrime(int num) {
		if(num <= 1) return false;
		//                           4 9 16 25 36 
		for(int i=2; i<num;i++) {
			if(num % i==0) {
				return false;
			}
//			System.out.println(i);
			
		}
		return true;
		
	}
		
		
	public static void main(String[] args){
		Example7 obj=new Example7();
		
//		System.out.println((obj.isPrime(1)?"Is a Prime": "! Prime"));
		
		for(int i=1; i<=1013;i++) {
			if(obj.isPrime(i)) {
				System.out.println(i);
			}
		}
		

	}
	
	
	
	/**
	 * 
	 * Prime Number:-
	 * --------------
	 * 
	 * (Basic Approach)->Not recomended
	 * public boolean isPrime(int num) {
		int count=0;
		for(int i=1; i<= num; i++) {
			if(num % i==0) {
				count++;
			}
			
			if(count > 2) {
				return false;
			}
		}
		return count==2;
		
	}
	
	
	//2nd best approach for (small numbers)
	///------------------------------------------
	int count=0;
		
		for(int i=2; i< num/2; i++) {
			if(num % i==0) {
				return false;
			}
			System.out.println(i);
		}
		return true;
	 * 
	 *best approach
	 *-----------------
	 * 
	 * for(int i=2; i<(int)Math.sqrt(num);i++) {
			if(num % i==0) {
				return false;
			}
			System.out.println(i);
			
		}
		return true;
		
		
	 */

}

