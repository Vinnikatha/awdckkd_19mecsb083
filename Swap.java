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


 