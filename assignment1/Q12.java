import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in Mathematics: ");
        int math = sc.nextInt();
        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();
        int total = math + physics + chemistry;
        if (math >= 60 && physics >= 50 && chemistry >= 40 && (total >= 200 || (math + physics) >= 150)) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}
