import java.util.Scanner;

public class Main {
public static void main(String[] args) {
            try (Scanner inputtt = new Scanner(System.in)) {
            Restaurant Restt = new Restaurant();
            int customerID, orderQty;
            try {

                System.out.println("enter Customer ID: ");
                customerID = inputtt.nextInt();

                System.out.println("enter how much food to made: ");
                orderQty = inputtt.nextInt();

                Thread t1 = new Thread(Restt);
                Waiters waiter = new Waiters(customerID, orderQty);
                Thread t2 = new Thread(waiter);

                t1.start();
                t2.start();
                t1.join();
                t2.join();

            } catch (Exception e) {
                System.out.println("input must be Integer");
            }
        }
    }
}