package operators;



public class Example5 {
	
	int a;
	                                     
	
	public static void updatedObject(Example5 obj) {//parameters variables
		obj.a=obj.a++ + ++obj.a;
     
      
	}
	public void updatedObject2() {
		 
		a=a++ + ++a;
	}
	
	public static void main(String [] args) {
		Example5 obj1=new Example5();
		Example5 obj2=new Example5();
		obj1.a=10;
		
		updatedObject(obj1);
		System.out.println(obj1.a);//22
		System.out.println("----------------------");
		obj1.updatedObject2();
		System.out.println(obj1.a);//46
		System.out.println("----------------------");
		obj2.updatedObject2();
		 //                 46    + 2
		System.out.println(obj1.a+obj2.a);//54 46 48

		
		
		
		
		
	}

}
