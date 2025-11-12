package operators;

public class Example3 {
	public static void unaryOperatores() {
		
	}

	public static void main(String[] args) {
		// +, -, !, ++, --
		
//		int x=3;
//		System.out.println(x);
//		int a= +3;
//		System.out.println(a);
//		
//		int b= 4;   
//		System.out.println(b);
//		int c= b-b;
//		System.out.println(c);
//		System.out.println(!!(10 != 10));
		
		
		// ++   -> +1
//		int x=10;
//		System.out.println(x);
//		x++;
//		System.out.println(x++);
		
//		int y=30;
//		int c= y++;
//		System.out.println(y);//31
//		System.out.println(c);//31
		
//	 int f=1;//1   + 2
//	 int res= f + f++;
//	 System.out.println(res);
		
		int j=3;
		       //           3     5     5
		System.out.println(j++ + ++j + j++);//11 10 16 13 6 
       
		int k=3;//          3     5   5    6     6
		System.out.println(k++ + ++k +k - ++k - k++ );//1 2 1
		
		
		
		
	}

}
