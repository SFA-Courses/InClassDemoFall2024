public class ArrayDemo {
    public static void main(String[] args) {

        
        int[][] values = new int[4][5];        
        

        // Problem 1
        for (int row = 0; row < values.length; row++) {
            for (int col = 0; col < values[row].length; col++) {
                values[row][col] = col + 1;
            }
        }
       
        // Problem 2
        for (int row = 0; row < values.length; row++) {
            for (int col = 0; col < values[row].length; col++) {
                values[row][col] = col + row;
            }
        }

        values = new int[5][5];
        /*  Problem 3
        for (int row = 0; row < values.length; row++) {
            for (int col = 0; col < values[row].length; col++) {
                if (row == col) {        
                    values[row][col] = row+1;
                } else {
                    values[row][col] = 0;
                }
            }
        } */

        for (int i = 0; i < values.length; i++) 
            values[i][i] = i+1;

        printArray(values);
    }
    /**
     * 
     * @param matrix - must be a square matrix (i.e. same number of rows and cols)
     */
    public static boolean isUpper(int[][] matrix) {
        for (int row= 1; row <  matrix.length; row++) {          
            for(int col = 0; col < row; col++) {
                if (matrix[row][col] != 0)
                    return false;
            }
        }
        return true;
    }

    public static void printArray(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j =0; j < nums[0].length; j++)
                System.out.print(nums[i][j] + " ");
            System.out.println();
        }

    }
}
