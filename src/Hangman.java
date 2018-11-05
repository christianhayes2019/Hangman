import java.util.Scanner;

public class Hangman {
    public static void main(String [] args){
        


        for(int i = 0; i<=15;i++){
        displayHangman(i);


    }
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
}
