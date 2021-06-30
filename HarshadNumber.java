/* Program to print given number is Harshad number or not */
import java.util.Scanner;
public class HarshadNumber {
 
  public static void main(String args[]) {
 
    //Input number to be tested
    System.out.print("Please enter number to be tested:");
    Scanner scanner = new Scanner(System.in);
    Long inputNo = scanner.nextLong();
 
    //Calculate sum of digits of inputNo
    long temp = inputNo;
    int sumOfDigits = 0;
    while (temp > 0) {
      long rem = temp % 10;
      sumOfDigits += rem;
      temp = temp / 10;
    }
 
    //Check if inputNo is divisible by sum of its digits
    if (inputNo % sumOfDigits == 0) {
      System.out.println(inputNo + " is a Harshad Number");
    } else {
      System.out.println(inputNo + " is NOT a Harshad Number");
    }
 
  }
}

Output:
C:\Users\stan>javac HarshadNumber.java

C:\Users\stan>java HarshadNumber
Please enter number to be tested:156
156 is a Harshad Number

C:\Users\stan>javac HarshadNumber.java

C:\Users\stan>java HarshadNumber
Please enter number to be tested:22
22 is NOT a Harshad Number