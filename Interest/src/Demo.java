
public class Demo {

	public static double finalAmount = 1000000;
	public static double initialAmount =1000;
	public static double interestRate = 1.02;
	
	public static void main(String[] args) {
	
		//calculate(0, 100000, 0, 0, 1000000);
		int timePeriod = getRequiredAmountTimePeriod();
		System.out.println("Required Time period for " + initialAmount + "to become "+ finalAmount + "is "+timePeriod);
	}
	
	public static int getRequiredAmountTimePeriod() {
		double totalAmount = initialAmount;
		int returnTimePeriod = 1;
		for(int countPeriod = 2;finalAmount>totalAmount;countPeriod++) {
			totalAmount = initialAmount + totalAmount * interestRate;
			returnTimePeriod = countPeriod;
			System.out.println("total amount is "+ totalAmount + " , no of times is " + returnTimePeriod);
		}
		return returnTimePeriod;
		
		
	}
	
	
	
	
	
	
	public static void calculate(int i, int permonth, int count, double total, int totalAmount) {
		for(i=permonth; i<=totalAmount; i+=total ) {
			total= i*1.02;
			count++;
		System.out.println(total);
	}
		System.out.println(count);
		
	}
	
	
	}	
		
		
		

