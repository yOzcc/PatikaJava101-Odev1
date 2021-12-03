import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int row, column;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Minesweeper !");
        System.out.println("Please enter the board size. (Row and column)");
        System.out.println("Row number : ");
        row = scanner.nextInt();
        System.out.println("Column number : ");
        column = scanner.nextInt();

        MineSweeper mineSweeper = new MineSweeper(row,column);
        mineSweeper.go();

    }
}
