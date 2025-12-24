package com.loops;

public class Example8 {
	public boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
//                                    1234
	public void extractEachNumber(int num) {
        while(num !=0) {
        	int digit=num%10;
        	if(isPrime(digit)) {
        		System.out.println(digit);
        	}
        	num /=10;
        }
		
	}

	public static void main(String[] args) {
		Example8 obj=new Example8();
		obj.extractEachNumber(1234);

	}

}
