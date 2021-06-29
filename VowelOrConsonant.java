/* write a program to read a character and print vowel or consonant */
import java.util.Scanner;
public class VowelOrConsonant {
   public static void main(String args[]){
      System.out.println("Enter a character :");
      Scanner sc = new Scanner(System.in);
      char ch = sc.next().charAt(0);
      if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
         System.out.println("Given character is an vowel");
      }else{
         System.out.println("Given character is a consonant");
      }
   }
}

Output:
C:\Users\stan>javac  VowelOrConsonant.java

C:\Users\stan>java  VowelOrConsonant
Enter a character :
i
Given character is an vowel

C:\Users\stan>javac  VowelOrConsonant.java

C:\Users\stan>java  VowelOrConsonant
Enter a character :
v
Given character is a consonant
