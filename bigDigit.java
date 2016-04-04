/**Name:Erin
 *Id:U10108079
 *Exercise:big_digit
 */

import java.util.Scanner;
import java.util.ArrayList;

//main method
public class bigDigit {
	public static void main(String[] args) {

  	// Create a Scanner
	  Scanner input = new Scanner(System.in);

	  //Create an array list
	  ArrayList<Integer> list = new ArrayList<>();	  

	  //Enter two numbers
	  String firstNumber, secondNumber;
	  System.out.print("Enter first number：");
	  firstNumber = input.nextLine();
	  ArrayList<Integer> arraylist1 = new ArrayList<>();
	  for (int i = 0; i < firstNumber.length(); i++) {
	    String singleNumber1 = firstNumber.substring(i, i+1);
	    ary[i] = Integer.parseInt(singleNumber1);
	  } 
	  
	  System.out.println("Enter second number：");
	  secondNumber = input.nextLine();
	  ArrayList<Integer> arraylist2 = new ArrayList<>();
	  for (int i = 0; i < secondNumber.length(); i++) {
	    String singleNumber2 = secondNumber.substring(i, i+1);
	    ary[i] = Integer.parseInt(singleNumber2);
	  } 	

	}
}
