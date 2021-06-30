/* Write a program to read a number 'n', read x & y numbers . change number x to y in given number 'n'. */
// Example1 for Java program to replace a digit with other in a given number.
import java.util.*;
class ReplaceADigit
{
    static int replaceDigit(int n, int x, int y)
    {
        int result = 0, multiply = 1;
 
        while (n / 10 > 0)
        {
 
            // Take remainder of number
            // starting from the unit
            // place digit
            int remainder = n % 10;
 
            // check whether it is equal
            // to the digit to be replaced.
            // if yes then replace
            if (remainder == x)
                result = result + y * multiply;
 
            else // else remain as such
                result = result + remainder * multiply;
 
            // Update and move forward
            // from unit place to
            // hundred place and so on.
            multiply *= 10;
            n = n / 10; // update the value
        }
 
        // check whether it is equal to the digit
        // to be replaced.if yes then replace
        if (n == x)
            result = result + y * multiply;
 
        else // else remain as such
            result = result + n * multiply;
        return result;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int n = 16719, x = 1, y = 8;

        System.out.println(replaceDigit(n, x, y));
    }
}
 
Output:
C:\Users\stan>javac ReplaceADigit.java

C:\Users\stan>java ReplaceADigit
86789



/*  Write a program to read a number 'n', read x & y numbers . change number x to y in given number 'n'. */
//Example2 for Java program to replace a digit with other in a given number.
import java.util.*;
class ReplaceADigitWithOther
{
    static int replaceDigit(int n, int x, int y)
    {
        int result = 0, multiply = 1;
 
        while (n / 10 > 0)
        {
 
            // Take remainder of number
            // starting from the unit
            // place digit
            int remainder = n % 10;
 
            // check whether it is equal
            // to the digit to be replaced.
            // if yes then replace
            if (remainder == x)
                result = result + y * multiply;
 
            else // else remain as such
                result = result + remainder * multiply;
 
            // Update and move forward
            // from unit place to
            // hundred place and so on.
            multiply *= 10;
            n = n / 10; // update the value
        }
 
        // check whether it is equal to the digit
        // to be replaced.if yes then replace
        if (n == x)
            result = result + y * multiply;
 
        else // else remain as such
            result = result + n * multiply;
        return result;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int n = 234278, x = 2, y = 5;

        System.out.println(replaceDigit(n, x, y));
    }
}
 
Output:
C:\Users\stan>javac ReplaceADigitWithOther.java

C:\Users\stan>java ReplaceADigitWithOther
534578


