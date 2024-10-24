import java.util.Scanner;

public class TreeTest {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
        
        // insert 12 random numbers
        for (int i = 1; i <= 12; i++) {
            tree.add((int) (Math.random()*100));
        }
        System.out.println(tree);
        System.out.println();
        System.out.println("Pre: " + tree.preOrder());
        System.out.println("In:  " + tree.inOrder());
        System.out.println("Post: "+ tree.postOrder());


        System.out.println("Size: " + tree.size());
        System.out.println("Height: " + tree.height());
        System.out.println("Min: " + tree.min());
        System.out.println("Max: " + tree.max());
        System.out.println(    );
        
        System.out.println();
        System.out.println("Enter an element to remove: ");
        Scanner input = new Scanner(System.in);
        int element = input.nextInt();
        
        tree.remove(element);
        System.out.println();
        System.out.println(tree);

        tree.removeAll();
        System.out.println();
        System.out.println(tree);
        
    
     
    }

}
