import java.util.Scanner;


public class MonthlyPayment {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principle Amount");
		int p = sc.nextInt();
		System.out.println("Enter the intrest percentage per month");
		int r = sc.nextInt();
		System.out.println("Enter  the Year");
		int y = sc.nextInt();
		Utility.monthlyPayment(p,y,r);
		sc.close();
	}

}
