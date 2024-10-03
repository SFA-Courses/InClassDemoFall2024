public class TestStackReference {
    public static void main(String[] args) {
        StackReferencedBased<Character> letters = new StackReferencedBased<Character>();

        for (char c = 'a'; c <= 'z'; c++) {
            Character ch = c;
            letters.push(ch);
        }
        System.out.println("Original Stack (all letters)");
        System.out.println(letters);
        System.out.println();
        letters.reverseStack();
        System.out.println("Reversed Stack");
        System.out.println(letters);

    }

}
