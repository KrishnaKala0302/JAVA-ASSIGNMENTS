import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        int[] stack = new int[5];
        int top = -1;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Push\n2. Pop\n3. Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                if (top == stack.length - 1) {
                    System.out.println("Stack Overflow");
                } else {
                    System.out.print("Enter element to push: ");
                    stack[++top] = sc.nextInt();
                }
            } else if (choice == 2) {
                if (top == -1) {
                    System.out.println("Stack Underflow");
                } else {
                    System.out.println("Popped: " + stack[top--]);
                }
            } else {
                break;
            }
        }
    }
}
