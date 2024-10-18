public class Q10 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        for (int i = 2; i < 10; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
    }
}


