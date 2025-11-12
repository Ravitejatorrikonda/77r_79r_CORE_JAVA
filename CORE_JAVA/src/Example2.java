
public class Example2 {
 String name, city, street, state;
 
 public String getName() {
	 return name;
 }
 public void setName(String nme) {
	   name=nme;
 }
 
 public String getCity() {
	 return city;
 }
 public void setCity(String ct) {
	 city=ct;
 }
 public String getStreet() {
	 return street;
 }
 public void setStreet(String strt) {
	 street=strt;
 }
 public String getState() {
	 return state;
 }
 public void setState(String st) {
	 state=st;
 }
 
	public static void main(String[] args) {
	Example2 obj1=new Example2();
	obj1.setName("Ravi");
	obj1.setCity("HYD");
	obj1.setStreet("KPHB");
	obj1.setState("TG");
	System.out.println("Name : "+ obj1.getName()+"City"+obj1.getCity()+"Street"+obj1.getStreet()+"State"+obj1.getState());
	
	
	
	
	}
}
