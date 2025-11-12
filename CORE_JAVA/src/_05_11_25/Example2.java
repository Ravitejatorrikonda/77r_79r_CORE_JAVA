package _05_11_25;

public class Example2 {
   
	byte b1;
	short s1;
	int i1;
	long l1;
	float f1;
	double d1;
	boolean b2;
	char ch;
	
	public byte getb1() {
		return b1;
	}
	public void setb1(byte b) {
		b1=b;
	}
	public short gets1() {
		return s1;
	}
	public void sets1(short s) {
		s1=s;
	}
	
	public int geti1() {
		return i1;
		
	}
	public void seti1(int i) {
		i1=i;
	}
	public long getl1() {
		return l1;
	}
	public void setl1(long l) {
		l1=l;
	}
	public float getf1() {
	return f1;
	}
	public void setf1(float f) {
		f1=f;
	}
	
	public double getd1() {
		return d1;
	}
	public void setd1(double d) {
		d1=d;
	}
	public boolean getb2() {
		return b2;
	}
	public void setb2(boolean bl) {
		b2=bl;
	}
	public char getch() {
		return ch;
	}
	public void setch(char c) {
		ch=c;
	}
	public static void main(String[] args) {
		Example2 obj1=new Example2();
		byte b=10;
		obj1.setb1(b);
		System.out.println(obj1.getb1());
		
		short s=20;
		obj1.sets1(s);
		System.out.println(obj1.gets1());
		obj1.seti1(30);
		System.out.println(obj1.geti1());
		
		obj1.setl1(40);
		System.out.println(obj1.getl1());
		
		obj1.setf1(1.0f);
		System.out.println(obj1.getf1());
		
		obj1.setd1(2.0);
		System.out.println(obj1.getd1());
		
		obj1.setb2(true);
		System.out.println(obj1.getb2());
		
		obj1.setch('a');
		System.out.println(obj1.getch());
		
		
	}

}
