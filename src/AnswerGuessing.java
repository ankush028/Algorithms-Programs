import java.util.Scanner;


public class AnswerGuessing {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input where program");
		int n = sc.nextInt();
		int hi = (int)Math.pow(2,n);
		System.out.println("think the number in between "+0+"to"+hi);
		System.out.println("number is "+Utility.guessing(0,hi));
		sc.close();
	}

}
