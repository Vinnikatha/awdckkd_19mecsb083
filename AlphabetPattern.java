/* java program to print the alphabet pattern
input:N=5
ouput
 A
 B C
 D E F
 G H I J
 K L M N O */
import java.util.Scanner;
public class AlphabetPattern
{
 public static void main(String args[])
{
int n;
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
 char ch='A';                          
 for(int i=1;i<n;i++)
 {            
 for(int j=1;j<=i;j++)
 {
 System.out.print(ch);
 ch++;
 }
 System.out.println();
 }
}
}

Output 1: giving input=5
C:\Users\stan>javac AlphabetPattern.java

C:\Users\stan>java AlphabetPattern
5
A
BC
DEF
GHIJ


Output 2: giving input 6
C:\Users\stan>javac AlphabetPattern.java

C:\Users\stan>java AlphabetPattern
6
A
BC
DEF
GHIJ
KLMNO