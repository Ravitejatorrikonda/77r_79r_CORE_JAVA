package conditional.statements;

//import java.security.cert.CertificateExpiredException;

public class BonusCalculator {
	
	public double calculateBonus(int experiance, int rating, double salary) {
		
		if(experiance > 5 && rating > 9) {
			return 0.5*salary;
		}
		else if((experiance >= 3 && experiance <= 5) && (rating >=7 && rating <= 9)) {
			return 0.3*salary;
			
		}
		else if((experiance >= 1 && experiance <= 3) && (rating >= 5 && rating <7)) {
			return 0.1*salary;
		}
		else {
			return 0.0;
		}
		
	}

	public static void main(String[] args) {
		BonusCalculator obj=new BonusCalculator();
				double bonus=obj.calculateBonus(3,6, 100000);
		System.out.println(bonus);
		

	}

}
