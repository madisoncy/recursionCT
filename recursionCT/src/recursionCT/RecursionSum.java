package recursionCT;

import java.util.Scanner;

public class RecursionSum {

	public static void main(String[] args) {
		
		int[] userArray = new int[6];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter five numbers: ");
		for (int i = 1; i <= 5; i++) {
			userArray[i] = scanner.nextInt();
		}
		
		int userResult = sum(userArray, 6);
		System.out.println("The sum of the numbers is: " + userResult);
	}
	
	public static int sum(int [] userArray, int number) {
		if (number != 0) {
			return (userArray[number - 1] + sum(userArray, number - 1));
		} else {
			return 0;
		}
	}

}
