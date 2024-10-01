public class TestStackArray {
    public static void main(String[] args) {
        StackArrayBased<Character> letters = new StackArrayBased<Character>();

                
        for (char c = 'a'; c <= 'z'; c++) {
            Character ch = c;
            letters.push(ch);
        }
        System.out.println("Original Stack (all letters)");
        System.out.println(letters);
        System.out.println();
        System.out.println("Test peek (z): " + letters.peek());
        System.out.println();

        System.out.println("Pop 5 ");
        for (int i = 1; i <= 5; i++)
            System.out.print(letters.pop() + " ");

        System.out.println("Stack after pop ");
        System.out.println(letters);

        System.out.println("Test Pop all");
        letters.popAll();
        System.out.println(letters);
        System.out.println("isEmpty: " + letters.isEmpty());
    }
}
