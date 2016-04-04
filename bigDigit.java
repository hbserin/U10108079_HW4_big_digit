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

		//Enter and store the first number
		String firstNumber, secondNumber;
		System.out.print("Enter first number：");
		firstNumber = input.nextLine();
		array1 = new int[firstNumber.length()];
		for (int i = 0; i < firstNumber.length()-1; i++) {
			String singleNumber1 = firstNumber.substring(i, i+1);
			array1[i] = Integer.parseInt(singleNumber1);
		} 
	
		//Enter and store the second number
		System.out.println("Enter second number：");
		secondNumber = input.nextLine();
		array2 = new int[secondNumber.length()];
		for (int i = 0; i < secondNumber.length()-1; i++) {
			String singleNumber2 = secondNumber.substring(i, i+1);
			array2[i] = Integer.parseInt(singleNumber2);
		} 	

		//store the answer
		int lengthOfAnswer = max(firstNumber.length(), secondNumber.length());
		arrayOfAnswer = new int[lengthOfAnswer];
	
		//addition
		for (int i = lengthOfAnswer; i = 0; i--){
			if (arrayOfAnswer[i] != 1 && array1[firstNumber.length()-1 -(lengthOfAnswer - i)] + array2[secondNumber.length()-1-(lengthOfAnswer - i)] < 10 )
				arrayOfAnswer[i] = array1[firstNumber.length()-1 -(lengthOfAnswer - i)] + array2[secondNumber.length()-1-(lengthOfAnswer - i)];
			else if(arrayOfAnswer[i] = 1 && array1[firstNumber.length()-1 -(lengthOfAnswer - i)] + array2[secondNumber.length()-1-(lengthOfAnswer - i)] < 10 )
				arrayOfAnswer[i] = 1 + array1[firstNumber.length()-1 -(lengthOfAnswer - i)] + array2[secondNumber.length()-1-(lengthOfAnswer - i)];		
			else if(arrayOfAnswer[i] != 1 && array1[firstNumber.length()-1 -(lengthOfAnswer - i)] + array2[secondNumber.length()-1-(lengthOfAnswer - i)] > 10){
				arrayOfAnswer[i] = array1[firstNumber.length()-1 -(lengthOfAnswer - i)] + array2[secondNumber.length()-1-(lengthOfAnswer - i)]-10;
				arrayOfAnswer[i-1] = 1;
			}	
			else if(arrayOfAnswer[i] = 1 && array1[firstNumber.length()-1 -(lengthOfAnswer - i)] + array2[secondNumber.length()-1-(lengthOfAnswer - i)] > 10){
				arrayOfAnswer[i] = 1 + array1[firstNumber.length()-1 -(lengthOfAnswer - i)] + array2[secondNumber.length()-1-(lengthOfAnswer - i)]-10;
				arrayOfAnswer[i-1] = 1;
			}
		}

		//print the answer
		System.out.print("The answer：");		
		if (arrayOfAnswer[i-1] = 1){
			for (int i = 0; i <= lengthOfAnswer; i++){
				System.out.print(i);
			}
		}else{
			for (int i = 1; i <= lengthOfAnswer; i++){
				System.out.print(i);
			}
		}
	}
}
