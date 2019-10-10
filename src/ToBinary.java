import java.util.Scanner;


public class ToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal number");
		int d = sc.nextInt();
		Utility.toBinary(d);
		sc.close();
	}

}
