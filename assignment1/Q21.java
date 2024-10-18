import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Binary to Decimal
        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();
        int decimal = 0, power = 0;
        
        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * Math.pow(2, power);
            power++;
            binary /= 10;
        }
        System.out.println("Decimal: " + decimal);
        
        // Decimal to Binary
        System.out.print("Enter a decimal number: ");
        int dec = sc.nextInt();
        int binaryResult = 0, place = 1;

        while (dec > 0) {
            int remainder = dec % 2;
            binaryResult += remainder * place;
            place *= 10;
            dec /= 2;
        }
        System.out.println("Binary: " + binaryResult);
    }
}
