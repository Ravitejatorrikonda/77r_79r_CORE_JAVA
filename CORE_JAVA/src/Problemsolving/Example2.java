package Problemsolving;

public class Example2 {
	/**
	 * Write a java program to find the weather the number is
	 * harshad number or not
	 * 
	 * num=24;
	 * 
	 * 2+4=6
	 * 
	 * 
	 * 
	 */
	
	public static boolean isHarshadNumber(int num) {
		int temp=num;
		int sum=0;
		while(num !=0) {
			int rem=num %10;
			sum=sum+rem;
			num /=10;
		}
		return (temp%sum==0);
	}

	public static void main(String[] args) {
		System.out.println(isHarshadNumber(23)?"Harshad Number":"! harshadNumber");

	}

}
