
import java.util.Scanner;


public class ToDecimal {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary number");
		int  n = sc.nextInt();
		Utility.toDecimal(n);
		sc.close();
	}

}
