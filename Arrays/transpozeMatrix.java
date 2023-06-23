
public class transpozeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] transpoze = new int[3][3];
        System.out.println("Matrix");
        System.out.println("______");
        for(int [] row : matrix){
            for(int col : row){
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matrix Transpoze:");
        System.out.println("-----------------");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                transpoze[i][j] = matrix[j][i];
                System.out.print(transpoze[i][j] + " ");
            }
            System.out.println();
        }

    }
}