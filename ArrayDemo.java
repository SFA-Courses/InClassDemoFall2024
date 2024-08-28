public class ArrayDemo {
    public static void main(String[] args) {

        
        int[][] values = new int[4][5];
        int maxRow = values.length;
        int maxCol = values[0].length;
        //int totalRow = 0;
        //int val = 0;

        // Problem 1
        for (int i = 0; i < maxRow; i++) {
            
            System.out.println();
            for(int j = 0; j < maxCol; j++) {
                values[i][j] = j + 1;
                System.out.print(values[i][j]);
            }
            
        }
    }
}
