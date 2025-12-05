package Problemsolving;

public class Example1 {
	
	public static boolean uglyNumber(int num) {
		if(num <= 0) return false;
		while(num > 0) {
			if(num % 2==0) {
				num =num/2;
			}
			else if(num %3==0) {
				num /=3;
			}
			else if(num %5==0) {
				num /=5;
			}else {
				break;
			}
		}
		return num==1;
		
	}

	public static void main(String[] args) {
		
		
		
//		System.out.println(uglyNumber(12)?"Ugly Number":"! ugly");
		
		for(int i=1; i<=20;i++) {
			if(uglyNumber(i)) {
				System.out.println(i);
			}
		}
		
		/**
		 * 
		 * Write a java program weather thye number is ugly number or not
		 * 
		 * n=6
		 * 2,3,5
		 * 
		 * 6/2=> 3/3=>1
		 * 
		 * 14/2=>7/3
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int evenSum=0;
//		int oddSum=0;
//		for(int i=1; i<=5;i++) {
//			if(i%2==0) {
//				evenSum=evenSum+i;
//			}
//			else {
//				oddSum=oddSum+i;
//			}
//		}
//		System.out.println(evenSum);
//		System.out.println(oddSum);

	}

}
