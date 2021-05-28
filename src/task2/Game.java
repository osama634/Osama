

package task2;
import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int number1,number2;
		for(int j=0;j<3;j++)
		{
		try {
		System.out.println("enter numenator");
		number1=sc.nextInt();
		System.out.println("enter denomenator");
		number2=sc.nextInt();
		double number3=number1/number2;
		System.out.println("Answer = "+number3);
	
		}
		catch(ArithmeticException e) {
			System.out.println("calculation is not possible");
		}
		catch(Exception ex) {
			System.out.println("input integer value");
		}
	}
	}


}