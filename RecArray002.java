public class RecArray002 {
    private static int[] array = {-10, -20, -30, -40, -50};

    /**
     * This method will sum up all array elements 
     * from the given index to the end of the array
     * @param index - integer between 0 and the length of array - 1
     * @return - an integer representing the sum of all array elements
     * from the index to the end of the array
     */
    private static int sumByHead(int index) {
        if (index == array.length-1)
            return array[index];
        else {
            int recSum = sumByHead(index+1);
            return array[index] + recSum;
        }
    }

    private static int sumByTail(int index, int currentSum) {
        if (index == array.length-1)
            return array[index] + currentSum;
        else {
            currentSum = currentSum + array[index];
            return sumByTail(index+1, currentSum);
        }
    }

    public static int sum() {
        return sumByTail(0, 0);
    }

    // tail recursion
    public static int findMax(int index, int currentMax) {
        if (index == array.length) // if we've seen all the elements
            return currentMax;  // return the currently known max
        else {
            if (currentMax < array[index]) 
                currentMax = array[index];
            // currentMax = Math.max(array[index], currentMax);
            return findMax(index+1, currentMax);
        }

    }
    // head
    public static int findMaxHead(int index) {
        if (index == array.length-1)
            return array[index];
        else {
            int previousMax = findMaxHead(index+1);
            return Math.max(previousMax, array[index]);
        }
    }

    public static int max() {
        return findMaxHead(0);
    }

    public static void main(String[] args) {
        System.out.println(max());
    }
}
