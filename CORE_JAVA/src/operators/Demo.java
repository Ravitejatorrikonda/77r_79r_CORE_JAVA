package operators;


public class Demo {
	int a=10;
	int b=20;
	
	public void DemoOfAerthamticOperators() {
		int a=10;
		int b=20;
		int result=a+b;
		System.out.println("Addition of : "+result);
		result=a-b;
		System.out.println("Subtraction of : "+result);
		result=a*b;
		System.out.println("Multiplication of : "+result);
		result=a/b;
		System.out.println("division of : "+result);
		result=a%b;
	    System.out.println("modules of : "+ result);
	    
	    System.out.println("----------------------");
	    
	    float f1=1.5f;
	    float f2=0.0f;
	    System.out.println("Division of float : "+(f1/f2));
	    
//	    int x=10;
//	    int y=0;
//	    System.out.println("DIvision of int : "+ (x/y));
	    
//	    boolean b1=true;
//	    boolean b2=false;
//	    System.out.println(b1+b2);
	    
	    byte by1=10;
	    byte by2=30;
	   by1 +=40;
	    System.out.println(by1);
	
//	    Demo b1=new Demo();
//	    Demo b2=new Demo();
//	    System.out.println( (b1.a+b2.a));
	    
	    float x=1.0f;
	    float y=2.5f;
//	    System.out.println(x % y);
//	    
//	    System.out.println(3%2);
//	    System.out.println(5%1);
//	    System.out.println(4%2);
//	    System.out.println(13%3);
	    
	    /**
	     * aerthamatic Operators is not only perform addition subtraction etc., 
	     * it will also concadition 
	     * 
	     */
	    
	    
	    
//	    String name1="Hello";
//	    String name2="World";
//	    System.out.println(name1+" "+name2);
//		
//	    System.out.println(100+200+"100");
	    
	    
	    String a1="hello";
	    String a2="There";
//	    String a3=a1+a2;
	    a1=a1+a2+"!";
	    System.out.println("hey"+a1);
	    		
	   System.out.println(10+20+2*3+3/1+4); //PEDMAS
	   
	   
	   /**
	    * #""""""""#
	    * "*     * "
	    * "   *    "
	    * " *****  "
	    * """"""""""
	    * 
	    */
	    
	    
	    
	}
	
	
	public static void main(String [] args) {
		new Demo().DemoOfAerthamticOperators();
		
	}

}
