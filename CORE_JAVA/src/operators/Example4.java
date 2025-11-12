package operators;

public class Example4 {
	int a;
	int b;
	public static void main(String[] args) {
		
		/**
		 * ++ -> +1 -> prifix ->first updating value,next assign a value
		 * ++  -> +1-> suffix ->fist assign a values,next update the value
		 * 
		 * 
		 * -- ->  -1 -> prifix -> fist updating a value ,next assign a value
		 * -- ->  -1 ->suffix   -> first assign a value, next update a value
		 * 
		 * 
		 */
		
		Example4 obj1=new Example4();
		
////		obj1.a++;
//		System.out.println(obj1.a + obj1.a);//0
//		obj1.a++;
//		System.out.println(obj1.a);//1
//		
//		System.out.println(obj1.b);//0
//		obj1.b--;
//		System.out.println(obj1.b);
		
//		int a =10;
//		System.out.println(a++ + 10);
//		System.out.println(a + 10);
		obj1.a=10;
		obj1.b=20;
		//                  10           21           20
		System.out.println(obj1.a++ + ++obj1.b + --obj1.b);//
		
		
	}

}
