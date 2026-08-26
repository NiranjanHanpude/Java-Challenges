import java.util.Scanner;

class GussingGame {

    int random;

    GussingGame(){
        random = (int) Math.ceil(Math.random()*100);
    }
     /**
      * @param guessNumber the number that player gussed
      * @rrturn
      * - Negative if the guessed number is smaller
      * - o if the gussed number is correct
      * - positive if the guessed number is higher.
      */


     int guess (int guessNumber){
         return guessNumber - random;
     }

     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         GussingGame game = new GussingGame();
         System.out.println("Welcome to the Guessing game. guess the Number between 1-100");
         int guess;
         int result;
         do {
             System.out.println("guess the number: ");
             guess = input.nextInt();
             result = game.guess(guess);
             if (result == 0){
                 System.out.println("congrates, your guess is correct");
             }else if (result < 0){
                 System.out.println("please guess the higher");
             }else {
                 System.out.println("please guess the lower");
             }
         }while (result != 0);
     }

 }
