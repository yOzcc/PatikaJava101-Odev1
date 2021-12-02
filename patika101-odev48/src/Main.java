import java.util.Arrays;

public class Main {

    public static int[][] transposeMatrix(int[][] matrix){
        int a = matrix.length;
        int b = matrix[0].length;

        int[][] transposedMatrix = new int[b][a];

        for (int i = 0 ; i < b ; i++){
            for (int j = 0 ; j < a ; j++){
                transposedMatrix[i][j] = matrix[j][i];
            }
        }return transposedMatrix;
    }
    public static void main(String[] args){

        int[][] matrix = {{1,2},{3,4},{5,6}};

        System.out.println(Arrays.toString(matrix));
       // System.out.println(Arrays.toString(transposeMatrix(matrix)));
    }
}
