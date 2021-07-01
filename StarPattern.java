/* print the pattern
input:
 N=5
output:

*
**
***
****
*****
****
***
**
*

*/

import java.util.*;
 
public class StarPattern
{
 public static void main(String args[])
 { 
 int n;
 int i;
 int j;
 
 Scanner sc = new Scanner(System.in);
     
     n = sc.nextInt();
    
 for(i=1;i<=n;i++)
     {
         for(j=i;j<n;j++)
         {
             System.out.print("");
         }
         for(j=1;j<=(i-1);j++)
         {
             System.out.print("*");
         }
         System.out.println("");
     } 
 for(i=n;i>=1;i--)
     {
         for(j=i;j<=n;j++)
         {
             System.out.print("");
         }
         for(j=1;j<(i-1);j++)
         {
             System.out.print("*");
         }
         System.out.println("");
     } 
 }
 }

Output 1: input = 5
C:\Users\stan>javac StarPattern.java

C:\Users\stan>java StarPattern
5

*
**
***
****
***
**
*

Output 2: input = 6
C:\Users\stan>javac StarPattern.java

C:\Users\stan>java StarPattern
6

*
**
***
****
*****
****
***
**
*