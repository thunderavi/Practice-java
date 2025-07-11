package String_chaleegnege;

import java.util.Scanner;

public class Guessing_Game {
    int random;

    Guessing_Game(){
        random = (int)Math.ceil(Math.random()*100);
    }

    int guess(int guessNumber){
        return guessNumber - random;
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Guessing_Game game = new Guessing_Game();
        System.out.println("Welcome to the guessing game");
        int guess;
        int result;
        do {
            System.out.println("Guess the number");
            guess = read.nextByte();
            result = game.guess(guess);
            if (result==0){
                System.out.println("Congrats, your guess is correct");
            }else if(result<0){
                System.out.println("Please guess higher");
            }
            else {
                System.out.println("Please guess Less");
            }
        } while (result != 0);
    }
}
