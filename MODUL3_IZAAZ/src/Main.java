import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Restaurant R2 = new Restaurant();
        int customerID, orderQty;
        try {

            System.out.print("Enter Customer ID: ");
            customerID = input1.nextInt();

            System.out.print("Enter how much food to made: ");
            orderQty = input1.nextInt();

            Thread td1 = new Thread(R2);
            Waiters wt = new Waiters(orderQty, customerID);
            Thread td2 = new Thread(wt);

            td1.start();
            td2.start();
            td1.join();
            td2.join();

        } catch (Exception e) {
            System.out.println("Input must be Integer");
        }
    }
}