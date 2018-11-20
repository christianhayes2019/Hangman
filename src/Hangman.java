import com.sun.org.apache.xpath.internal.operations.Variable;

import java.util.Scanner;

public class Hangman {
    public static void main(String [] args){
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        String playerTwoGuess;
        String secretWord;
        char letter;
        char[] charWord;
        int tries;







        System.out.println("Welcome to Hangman! This game requires two players.");
        System.out.println("Player One will enter a secret word or phrase, while Player Two guesses the letters.\n");
        System.out.println("Player One, please enter a word or phrase now!\n");



        tries = 0;
        secretWord = keyboard.nextLine().toLowerCase();
        System.out.println(secretWord);
       // charWord = secretWord.toCharArray();
        String[] guessBreakdown = secretWord.split(" ");
        String guessPhrase = printPhrase(guessBreakdown);
        System.out.println(guessPhrase);

        String tempWord= guessBreakdown[0];
        tempWord.length();


        System.out.println("Player Two, please guess a letter.");
        playerTwoGuess = keyboard.nextLine().toLowerCase();
        //letter = playerTwoGuess.charAt(0);
        //playerTwoGuess += letter;

        if(checkGuess(secretWord,playerTwoGuess)){
            guessPhrase=rewriteGuessPhrase(playerTwoGuess,secretWord,guessPhrase);
            //guessPhrase = guessPhrase with the correct guess letter
           //do the code to replace the guess phrase, and print guess phrase
        }
        else{
            tries++;
            //print guess phrase
            //increment or decrement number of mistakes or tries

        }
        displayHangman(tries);
        System.out.println(guessPhrase);
        //display hangman because the tries would be correctly updated.




        }

        public static String rewriteGuessPhrase(String guess, String secretWord, String guessPhrase){



                for (int i = 0; i < secretWord.length(); i++) {
                    if (secretWord.charAt(i) == guess.charAt(0)) {
                        guessPhrase = guessPhrase.substring(0, +i) + guess + guessPhrase.substring(i + 1);
                    }
                }
            return guessPhrase;
            }









    public static void displayHangman(int tries){
        switch(tries){
            case 0:
                System.out.println("|-----------------|");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|___________________");
                System.out.println("|   15 Tries Left   | \n");
                System.out.println("Player Two enter a letter!\n");

                break;

            case 1:
                System.out.println("|-----------------|");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("                  O");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|___________________");
                System.out.println("|   14 Tries Left   | \n");
                System.out.println("Player Two enter a letter!\n");
                break;

            case 2:
                System.out.println("|-----------------|");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("                  O");
                System.out.println("|                 |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|___________________");
                System.out.println("|   13 Tries Left   | \n");
                System.out.println("Player Two enter a letter!\n");
                break;

            case 3:
                System.out.println("|-----------------|");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("                  O");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|___________________");
                System.out.println("|   12 Tries Left   |\n");
                System.out.println("Player Two enter a letter!\n");
                break;

            case 4:
                System.out.println("|-----------------|");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("                  O");
                System.out.println("|                 |-");
                System.out.println("|                 |");
                System.out.println("|                  ");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|___________________");
                System.out.println("|   11 Tries Left   |\n");
                System.out.println("Player Two enter a letter!\n");
                break;

            case 5:
                System.out.println("|-----------------|");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("                  O");
                System.out.println("|                 |--");
                System.out.println("|                 |");
                System.out.println("|                  ");
                System.out.println("|                  ");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|___________________");
                System.out.println("|   10 Tries Left   |\n");
                System.out.println("Player Two enter a letter!\n");
                break;

            case 6:
                System.out.println("|-----------------|");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("                  O");
                System.out.println("|                -|--");
                System.out.println("|                 |");
                System.out.println("|                  ");
                System.out.println("|                  ");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|___________________");
                System.out.println("|   9 Tries Left    |\n");
                System.out.println("Player Two enter a letter!\n");
                break;

            case 7:
                System.out.println("|-----------------|");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("                  O");
                System.out.println("|               --|--");
                System.out.println("|                 |");
                System.out.println("|                  ");
                System.out.println("|                  ");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|___________________");
                System.out.println("|   8 Tries Left    |\n");
                System.out.println("Player Two enter a letter!\n");
                break;

            case 8:
                System.out.println("|-----------------|");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("                  O");
                System.out.println("|               --|--");
                System.out.println("|                 |");
                System.out.println("|                / ");
                System.out.println("|                  ");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|___________________");
                System.out.println("|   7 Tries Left    |\n");
                System.out.println("Player Two enter a letter!\n");
                break;

            case 9:
                System.out.println("|-----------------|");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("                  O");
                System.out.println("|               --|--");
                System.out.println("|                 |");
                System.out.println("|                / ");
                System.out.println("|               /  ");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|__________________");
                System.out.println("|   6 Tries Left   | \n");
                System.out.println("Player Two enter a letter!\n");
                break;

            case 10:
                System.out.println("|-----------------|");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("                  O");
                System.out.println("|               --|--");
                System.out.println("|                 |");
                System.out.println("|                / \\" );
                System.out.println("|               /  ");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|__________________");
                System.out.println("|   5 Tries Left   |\n");
                System.out.println("Player Two enter a letter!\n");
                break;

            case 11:
                System.out.println("|-----------------|");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("                  O");
                System.out.println("|               --|--");
                System.out.println("|                 |");
                System.out.println("|                / \\ ");
                System.out.println("|               /   \\ ");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|___________________");
                System.out.println("|   4 Tries Left    |\n");
                System.out.println("Player Two enter a letter!\n");
                break;

            case 12:
                System.out.println("|-----------------|");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("                  O");
                System.out.println("|               --|--");
                System.out.println("|                 |");
                System.out.println("|                / \\ ");
                System.out.println("|              _/   \\ ");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|___________________");
                System.out.println("|   3 Tries Left    |\n");
                System.out.println("Player Two enter a letter!\n");
                break;

            case 13:
                System.out.println("|-----------------|");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("                  O");
                System.out.println("|               --|--");
                System.out.println("|                 |");
                System.out.println("|                / \\ ");
                System.out.println("|              _/   \\_ ");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|___________________");
                System.out.println("|   2 Tries Left    |\n");
                System.out.println("Player Two enter a letter!\n");
                break;

            case 14:
                System.out.println("|-----------------|");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("                  O");
                System.out.println("|               --|--");
                System.out.println("|                 |");
                System.out.println("|                / \\ ");
                System.out.println("|             __/   \\_ ");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|___________________");
                System.out.println("|   1 Tries Left    |\n");
                System.out.println("Player Two enter a letter!\n");
                break;

            case 15:
                System.out.println("|-----------------|");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("                  O");
                System.out.println("|               --|--");
                System.out.println("|                 |");
                System.out.println("|                / \\ ");
                System.out.println("|             __/   \\__ ");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|___________________");
                System.out.println("|    GAME  OVER     |\n");
                System.out.println("Player Two enter a letter!\n");
                break;

        }
    }

    public static boolean checkGuess(String secretWord, String playerTwoGuess){

     return  secretWord.contains(playerTwoGuess);

    }

    public static String printPhrase(String[] tempArray){
        String display = "";
        for(int i = 0; i<tempArray.length;i++){
            display += printWord(tempArray[i]);
            display+=" ";
        }
        return display;
    }

    public static String printWord(String word){
        String display = "";
        for (int i = 0; i < word.length(); i++){
            display += "-";


        }
        return display;
    }



}

