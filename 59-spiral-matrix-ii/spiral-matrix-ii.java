class Solution {
    public int[][] generateMatrix(int n) {
        int [][]matrix=new int [n][n];
        int rowb = 0;
        int rowe = n- 1;
        int colb = 0;
        int colme = matrix[0].length- 1;
        int k=1;

        while (colb <= colme && rowb <= rowe) {
            for (int i = colb; i <= colme; i++) {
                matrix[rowb][i]=k;
                k++;
            }
            rowb++;
            for (int i = rowb; i <= rowe; i++) {
                matrix[i][colme]=k++;
            }
            colme--;
            if (rowb <= rowe) {
                for (int i = colme; i >= colb; i--) {
                    matrix[rowe][i]=k++;
                }
                rowe--;
            }
            if (colb <= colme) {
                for (int i = rowe; i >= rowb; i--) {
                    matrix[i][colb]=k++;
                }
                colb++;
            }
        }

        return matrix;
    }
}