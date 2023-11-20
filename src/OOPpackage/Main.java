package OOPpackage;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(10);
        System.out.println(queue.add(200));
        System.out.println(queue.add(500));
        System.out.println(queue.add(1000));
        System.out.println(queue.getSize());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        System.out.println(queue.remove() +  " deleted from the list ");
    }
}
