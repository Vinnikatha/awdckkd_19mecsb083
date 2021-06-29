/* write a java program to check even or odd by using bitwise operator */

import java.util.Scanner;
public class Odd_Even
{
    public static void main(String[]args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        n = s.nextInt();
        if(n %2 == 0)
        {
            System.out.println("The given number "+n+" is Even");
        }
        else
        {
         System.out.println("The given number "+n+" is Odd");   
        }
    }
}



output:
C:\Users\stan>javac Odd_Even.java

C:\Users\stan>java Odd_Even
Enter the number you want to check:25
The given number 25 is Odd

C:\Users\stan>javac Odd_Even.java

C:\Users\stan>java Odd_Even
Enter the number you want to check:32
The given number 32 is Even
