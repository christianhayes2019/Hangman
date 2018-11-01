public class Hangman {
    public static void main(String [] args){
        int numberMisses = 0;

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
                break;

        }
    }
}
