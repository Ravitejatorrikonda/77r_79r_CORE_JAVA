package conditional.statements;

public class Example4 {
	
	public void getGender(String gender) {
		switch(gender) {
		case "male":
			System.out.println("Gender is male");
			break;
		case "female":
			System.out.println("Gender is Female");
			break;
		case "Others":
			System.out.println("Others");
			break;
		default: System.out.println("notvalid a gender");break;
		}
	}
	
	
	public void getHelplineData(int num) {
		switch(num) {
		case 100: System.out.println("Police");break;
		case 101: System.out.println("Fire");break;
		case 102: System.out.println("ambulance");break;
		case 103: System.out.println("Trafic");break;
		case 104:System.out.println("helpline");break;
		default: System.out.println("Not a valid number");
		}
	}
	
	public static void main(String[] args) {
		Example4 obj=new Example4();
//		obj.getGender("jhbsdf");
		obj.getHelplineData(100);
		switch(49) {
		case 30:System.out.println("hello there");break;
		case '1':System.out.println("hi there");break;
		}
		
	}

}
