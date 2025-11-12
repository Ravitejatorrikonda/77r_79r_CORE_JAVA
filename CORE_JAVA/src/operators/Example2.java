package operators;

public class Example2 {
	
	
	int a;
	int b;
	public void relationalOperatore() {
		System.out.println("a<b : "+(a<b));//true
		System.out.println("a>b : "+(a>b));//false
		System.out.println("a >= b : "+(a>=b));//false
		System.out.println("a<=b : "+(a<=b));//true
		System.out.println("a == b : "+(a == b));//false
		System.out.println("a != b : "+(a!= b));//true
	}
	
	
//	
//	public void compareObject(Example2 obj1, Example2 obj2) {
//		
//	}
	
	

	
	public void compareStrings(String str1, String str2) {
		System.out.println( str1== str2);//
		System.out.println(str1.toUpperCase()== str2.toUpperCase());//
		System.out.println(str1.toUpperCase() ==(str2.toUpperCase()));//
	}
	//SCP->String Constant Pool
	
	public void compareInt(int a, int b , int c) {
		
		System.out.println((a==b) == false);//true
		System.out.println((a>b) != false);//false
		System.out.println(true != (a+b > c));//false
		
	}
	
	
	public void compareObjects(Example2 obj1, Example2 obj2) {
		System.out.println(obj1==obj2);//false
		System.out.println(obj1 != obj2);//True
//		System.out.println();
	}
	
	public static void main(String[] args) {
		Example2 obj1=new Example2();
		Example2 obj2=new Example2();
		
		
		
//		obj1.compareObjects(obj1, obj2);
//		obj1.compareObjects(null, null);
//		obj1.compareObjects();
		
		
//	System.out.println(obj1 == obj2);
//	System.out.println(obj1 == obj1);
//	Example2 obj3= obj2;//shallow copy
//	System.out.println(obj3 == obj2);//
		
		
		
		
//		obj1.compareInt(20, 60, 34);
		
//		obj1.compareStrings("Hello", "Hello");
//		obj1.compareStrings("Hello", "hello");
		
		
		
		
		
//		obj1.a=30;
//		obj1.b=40;
//		obj1.relationalOperatore();
//		System.out.println("----------------------");
//		obj1.a=35;
//		obj1.b=35;
//		obj2.b=35;
		
//		System.out.println(obj1.a == obj1.b);
//		System.out.println(obj1.a == obj2.b);
		
//		obj1.relationalOperatore();

	}

}
