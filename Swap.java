/* program swapping of two numbers without using the third variable */

import java.util.*;
class Swap
{
  
   public static void main(String[] args)
    {
     System.out.println("Enter the value of x and y");
     Scanner sc = new Scanner(System.in);
     /*Define variables*/
     int x = sc.nextInt();
     int y = sc.nextInt();
     System.out.println("before swapping numbers: "+x);
     /*Swapping*/
     x = x + y;
     y = x - y;
     x = x - y;
     System.out.println("after swapping: "+x+" "+y);
     
      }
   }


output:
C:\Users\stan>javac Swap.java

C:\Users\stan>java Swap
Enter the value of x and y
20
30
before swapping numbers: 20
after swapping: 30 20

C:\Users\stan>javac Swap.java

C:\Users\stan>java Swap
Enter the value of x and y
35
40
before swapping numbers: 35
after swapping: 40 35

 
