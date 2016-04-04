/**Name:Erin
 *Id:U10108079
 *Exercise:big_digit
 */

import java.util.Scanner;

//main method
public class bigDigit {
	public static void main(String[] args) {

  	// Create a Scanner
	Scanner input = new Scanner(System.in);

	//Enter two numbers
	String firstNumber, secondNumber;
	System.out.print("Enter first number：");
	firstNumber = input.nextLine();
	array1 = new int[firstNumber.length()];
	for (int i = 0; i < firstNumber.length(); i++) {
		String singleNumber1 = firstNumber.substring(i, i+1);
		array1[i] = Integer.parseInt(singleNumber1);
	} 
	
	System.out.println("Enter second number：");
	secondNumber = input.nextLine();
	array2 = new int[secondNumber.length()];
	for (int i = 0; i < secondNumber.length(); i++) {
		String singleNumber2 = secondNumber.substring(i, i+1);
		array2[i] = Integer.parseInt(singleNumber2);
	} 	

	}
}
