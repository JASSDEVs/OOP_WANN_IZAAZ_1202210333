import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws Exception {
        Calculation r = new Calculation();
        Thread t1 = new Thread(r);
        Scanner input = new Scanner(System.in);
        boolean repeat = true;

        do {
            try{
                System.out.println("\n==MENU PROGRAM==");
                System.out.println("1.Square");
                System.out.println("2.Circle");
                System.out.println("3.Trapezoid");
                System.out.println("0.exit");
                System.out.print("SelectMenu: ");
                int menu = input.nextInt();

                switch(menu){
                    case 1:
                        System.out.print("\nEnter the length of the side of the square : ");
                        double side = input.nextDouble();
                        r.setSquare(side);
                        t1.start();
                        t1.join();
                        System.out.println("\nThe calculation result : " + r.getSquare());
                        break;

                    case 2:
                        System.out.print("\nEnter the radius of circle : ");
                        double radius = input.nextDouble();
                        r.setCircle(radius);
                        t1.start();
                        t1.join();
                        System.out.println("\nThe calculation result : " + r.getCircle());
                        break;

                    case 3:
                        System.out.print("\nInsert the side of the base of the trapezoid : ");
                        double a = input.nextDouble();
                        System.out.print("Enter the upper of the trapezoid : ");
                        double b = input.nextDouble();
                        System.out.print("Enter the height of the trapezoid : ");
                        double c = input.nextDouble();
                        r.setTrapezoid(a, b, c);
                        t1.start();
                        t1.join();
                        System.out.println("\nThe calculation result : " + r.getTrapezoid());
                        break;

                    case 0:
                        repeat = false;
                        break;

                    default:
                        System.out.println("\nOption not available");
                        break;
                }
    
            }
            catch(InputMismatchException e){
                System.out.println("\nError: Input must be a number");
                input.nextLine();
                continue;
            }
            catch(Exception e){
                System.out.println("\nError: Input cannot be 0");
                input.nextLine();
                continue;
            }
            
        } while (repeat);
        input.close();
    }
}