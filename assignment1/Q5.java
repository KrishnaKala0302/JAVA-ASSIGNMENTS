import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter miles: ");
        double miles = sc.nextDouble();
        double kilometers = miles * 1.60934;
        System.out.println("Kilometers: " + kilometers);
    }
}
