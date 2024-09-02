public class ArrayDemo {
    public static void main(String[] args) {

        
        int[][] values = new int[4][5];
        int maxRow = values.length;
        int maxCol = values[0].length;
        //int totalRow = 0;
        //int val = 0;

        // Problem 1
        for (int i = 0; i < maxRow; i++) {          
            for(int j = 0; j < maxCol; j++) {
                values[i][j] = j + 1;
            }
        }

        //  Problem 2
        for (int row= 0; row <  maxRow; row++) {          
            for(int col = 0; col < maxCol; col++) {
                values[row][col] =  row + col;
            }
        }

        // Problem 3
        values = new int[5][5];
       /*  for (int row= 0; row <  maxRow; row++) {          
            for(int col = 0; col < maxCol; col++) {
                if (col == row)
                    values[row][col] = col +1;
            }
        }
            */
        
        for (int i = 0; i < values.length; i++)
            values[i][i] = i +1;

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
