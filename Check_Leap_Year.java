/* write a java program to read a number and print it is a leap year or not */
import java.util.Scanner;
public class Check_Leap_Year 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any year:");
        int year = s.nextInt();
        boolean flag = false;
        if(year % 400 == 0)
        {
            flag = true;
        }
        else if (year % 100 == 0)
        {
            flag = false;
        }
        else if(year % 4 == 0)
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
        if(flag)
        {
            System.out.println("Year "+year+" is a Leap Year");
        }
        else
        {
            System.out.println("Year "+year+" is not a Leap Year");
        }
    }
}
Output:
C:\Users\stan>javac Check_Leap_Year.java

C:\Users\stan>java Check_Leap_Year
Enter any year:2000
Year 2000 is a Leap Year

C:\Users\stan>javac Check_Leap_Year.java

C:\Users\stan>java Check_Leap_Year
Enter any year:2015
Year 2015 is not a Leap Year
