public class TestQueue {
    public static void main(String[] args) {
       // QueueArrayBased<Integer> queue = new QueueArrayBased<Integer>();
       QueueReferenedBased<Integer> queue = new QueueReferenedBased<Integer>();
        for (int i = 0; i < 10; i++)
            queue.enqueue(i);
            
        System.out.println("Test Enqueue");
        System.out.println(queue);

        System.out.println("Test Dequeue");
        for (int i = 0; i < 5; i++)
            System.out.print(queue.dequeue() + " ");
        System.out.println();
        System.out.println(queue);

        System.out.println("Test Peek");
        System.out.println(queue.peek());

        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.println("Test Remove All");
        queue.dequeueAll();
        System.out.println("isEmpty: " + queue.isEmpty());

    }
}
