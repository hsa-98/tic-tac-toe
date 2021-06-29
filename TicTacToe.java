import java.util.Scanner;

public class TicTacToe {
    char[] table = new char[10];
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.CreateEmptyTable();
        char playerChar = ticTacToe.playerSymbol();
        ticTacToe.displayBoard();
    }

    public void CreateEmptyTable() {
        for (int i = 0; i < table.length; i++) {
            table[i] = 0;
        }
    }

    public char playerSymbol() {
        System.out.println("Enter X to choose x or enter the letter O to chose o");
        char choice = sc.next().charAt(0);
        if (choice == 'x' || choice == 'X') {
            System.out.println("X is chosen by the user");
            System.out.println("O is given to the computer");
        } else if (choice == 'O' || choice == 'o') {
            System.out.println("O is chosen by the user");
            System.out.println("X is given to the computer");
        } else {
            System.out.println("Enter a valid input");
        }
        return choice;
    }

    public void displayBoard() {
        for (int i = 1; i < table.length; i = i + 3) {
            System.out.print(table[i] + " " + table[i + 1] + " " + table[i + 2]);
            System.out.println();
        }
    }
    
}