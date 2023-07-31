import java.util.Scanner;

public class darray
 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row =scn.nextInt();
        int cols=scn.nextInt();
        int [][]matrix=new int[row] [cols];
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
            matrix[i][j]=scn.nextInt();
        }
    }
    for(int i=0;i<row;i++){
        for(int j=0;j<cols;j++){
            System.out.print(matrix[i][j]+" ");
        }
          System.out.println();
    }
    }
    
}
