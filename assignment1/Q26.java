import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        int[] queue = new int[5];
        int front = -1, rear = -1;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Enqueue\n2. Dequeue\n3. Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                if (rear == queue.length - 1) {
                    System.out.println("Queue Overflow");
                } else {
                    System.out.print("Enter element to enqueue: ");
                    if (front == -1) front = 0;
                    queue[++rear] = sc.nextInt();
                }
            } else if (choice == 2) {
                if (front == -1) {
                    System.out.println("Queue Underflow");
                } else {
                    System.out.println("Dequeued: " + queue[front++]);
                    if (front > rear) front = rear = -1;
                }
            } else {
                break;
            }
        }
    }
}

