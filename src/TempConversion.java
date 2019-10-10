import java.util.Scanner;


public class TempConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1==>> celcious to Farneheight");
		System.out.println("2==>> Farneheight to celcious");
		int n = sc.nextInt();
		System.out.println("Enter the Temprature");
		int C = sc.nextInt();
		
		Utility.Conversion(C, n);
		sc.close();
	}

}
