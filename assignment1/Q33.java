import java.util.Scanner;

class Commission {
    double sales;

    Commission(double sales) {
        if (sales < 0) {
            System.out.println("Invalid Input");
            this.sales = 0;
        } else {
            this.sales = sales;
        }
    }

    double commission() {
        return sales * 0.10; // 10% commission
    }
}

public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sales amount: ");
        double sales = sc.nextDouble();
        
        Commission comm = new Commission(sales);
        if (sales >= 0) {
            System.out.println("Commission: " + comm.commission());
        }
    }
}
