import java.util.Scanner;


public class Sqrt {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of c ");
		int c = sc.nextInt();
		Utility.sqrt(c);
		sc.close();

	}

}
