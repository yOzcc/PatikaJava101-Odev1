import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber, colNumber, size;
    int[][] map;
    int[][] board;
    boolean gameOn = true;

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.size = rowNumber*colNumber;
    }

    public void go(){
        int row, col, success= 0;
        game();
        print(map);
        System.out.println("Game has started! ");
        while (gameOn){
            print(board);
            System.out.println("Row number : ");
            row = scanner.nextInt();
            System.out.println("Column number : ");
            col = scanner.nextInt();

            if (row < 0 || row >= rowNumber){
                System.out.println("Invalid coordinate!");
                continue;
            }
            if (col < 0 || col >= colNumber){
                System.out.println("Invalid coordinate!");
                continue;
            }
            if (map[row][col] != -1){
                check(row,col);
                success++;
                if (success == (size - (size/4))){
                    System.out.println("Congratulations, you made it!");
                    break;
                }
                }
            else {
                gameOn = false;
                System.out.println("Game Over!");
            }
        }
    }

    public void check(int r, int c){
        if (map[r][c] == 0) {
        if ((r>0) && (c>0) && (map[r-1][c-1] == -1)){
            board[r][c]++;
        }
        if ((r>0) && (map[r-1][c] == -1)){
            board[r][c]++;
        }
        if ((r>0) && (c<colNumber-1) && (map[r-1][c+1] == -1)){
            board[r][c]++;
        }
        if ((c>0) && (map[r][c-1] == -1)){
            board[r][c]++;
        }
        if ((c<colNumber-1) && (map[r][c+1] == -1)){
            board[r][c]++;
        }
        if ((r<rowNumber-1) && (c>0) && (map[r+1][c-1] == -1)){
            board[r][c]++;
        }
        if ((c<colNumber-1) && (map[r][c+1] == -1)){
            board[r][c]++;
        }
        if ((r<rowNumber-1) && (map[r+1][c] == -1)){
            board[r][c]++;
        }
        if ((r<rowNumber-1) && (c<colNumber-1) && (map[r+1][c+1] == -1)){
            board[r][c]++;
        }
        if (board[r][c] == 0){
            board[r][c] = -2;
        }
        }
    }

    public void game(){
        int randomRow, randomColumn, counter = 0;
        while (counter != (size/4)) {
            randomRow = random.nextInt(rowNumber);
            randomColumn = random.nextInt(colNumber);
            if (map[randomRow][randomColumn] != -1){
                map[randomRow][randomColumn] = -1;
                counter++;
            }
        }

    }

    public void print(int[][] array ){
        for (int i = 0 ; i < array.length ; i++){
            for (int j = 0 ; j < array[0].length ; j++){
                if (array[i][j] >= 0){
                    System.out.print(" ");
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


}
