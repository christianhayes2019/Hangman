public class Hangman {
    public static void main(String [] args){

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
                System.out.println("|   15 Tries Left   |");

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
                System.out.println("|   14 Tries Left   |");
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
                System.out.println("|   13 Tries Left   |");
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
                System.out.println("|   12 Tries Left   |");
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
                System.out.println("|   11 Tries Left   |");
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
                System.out.println("|   10 Tries Left   |");
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
                System.out.println("|   9 Tries Left   |");
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
                System.out.println("|   8 Tries Left   |");
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
                System.out.println("|   7 Tries Left   |");
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
                System.out.println("|___________________");
                System.out.println("|   6 Tries Left   |");
                break;

            case 10:
                System.out.println("|-----------------|");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("                  O");
                System.out.println("|               --|--");
                System.out.println("|                 |");
                System.out.println("|                /\\" );
                System.out.println("|               /  ");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|___________________");
                System.out.println("|   5 Tries Left   |");
                break;

            case 11:
                System.out.println("|-----------------|");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("                  O");
                System.out.println("|               --|--");
                System.out.println("|                 |");
                System.out.println("|                /\\ ");
                System.out.println("|               /  \\ ");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|___________________");
                System.out.println("|   4 Tries Left   |");
                break;

            case 12:
                System.out.println("|-----------------|");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("                  O");
                System.out.println("|               --|--");
                System.out.println("|                 |");
                System.out.println("|                /\\ ");
                System.out.println("|              _/  \\ ");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|___________________");
                System.out.println("|   3 Tries Left   |");
                break;

            case 13:
                System.out.println("|-----------------|");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("                  O");
                System.out.println("|               --|--");
                System.out.println("|                 |");
                System.out.println("|                /\\ ");
                System.out.println("|              _/  \\_ ");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|___________________");
                System.out.println("|   2 Tries Left   |");
                break;

            case 14:
                System.out.println("|-----------------|");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("                  O");
                System.out.println("|               --|--");
                System.out.println("|                 |");
                System.out.println("|                /\\ ");
                System.out.println("|             __/  \\_ ");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|___________________");
                System.out.println("|   1 Tries Left   |");
                break;

            case 15:
                System.out.println("|-----------------|");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("                  O");
                System.out.println("|               --|--");
                System.out.println("|                 |");
                System.out.println("|                /\\ ");
                System.out.println("|             __/  \\__ ");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|___________________");
                System.out.println("|    GAME  OVER    |");
                break;

        }
    }
}
