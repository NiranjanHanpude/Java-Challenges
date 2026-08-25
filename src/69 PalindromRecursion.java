import java.util.Scanner;

class PalindromRecursion {

     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcom to Palindrome Checker");
         System.out.println("Enter the string you want to checked");
         String str = input.next();
         System.out.println("your string is "+ ((isPalindrom(str)? "palindrom"
                : "Not palindrom")));
     }
     public static boolean isPalindrom(String str){
         if (str.length() <= 1){
             return true;
         }
         int lastPos = str.length() - 1;
         if (str.charAt(0) != str.charAt(lastPos)){
               return false;
         }
         String newStr = str.substring(1, lastPos);
         return isPalindrom(newStr) ;
     }
}
