public class SpecialPositionInBinaryMatrix_1582 {
    public static int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int count=0;
        int[] rowSum = new int[m];
        int[] colSum = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    rowSum[i]++;
                    colSum[j]++;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1 && (rowSum[i]==1 && colSum[j]==1)) {
                    count++;
                }
            }
        }
       
        return count;
    }
    public static void main(String[] args) {
        int mat[][]={{1,0,0},{0,0,1},{1,0,0}};
        System.out.println(numSpecial(mat));
    }
}