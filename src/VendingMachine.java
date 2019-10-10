
import java.util.Scanner;
public class VendingMachine {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the for change");
		int money = sc.nextInt();
		Utility.currency(money);
        sc.close();
        long end = System.currentTimeMillis();
        System.out.println("Time Taken by pragram :"+(end-start)/1000+" second total Execution Time");
        
}
	}
	
	
	


