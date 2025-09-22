import java.util.Scanner;

class Calculator{

    public void add(Scanner sc) {
        System.out.println("Enter the numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Sum of "+num1+" and "+num2+" is "+(num2+num1));
    }

    public void subtract(Scanner sc) {
        System.out.println("Enter the minuend : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the subtrahend : ");
        int num2 = sc.nextInt();
        System.out.println("Difference of "+num1+" - "+num2+" is "+(num1-num2));
    }

    public void multiply(Scanner sc) {
        System.out.println("Enter the numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Multiplication of "+num1+" and "+num2+" is "+(num1*num2));
    }

    public void divide(Scanner sc) {
        System.out.println("Enter the Dividend : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Divisor : ");
        int num2 = sc.nextInt();
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return;
        }
        System.out.println("The quotient of "+num1+" / "+num2+" is "+(num1/num2));
        System.out.println("The remainder of "+num1+" / "+num2+" is "+(num1%num2));

    }
}
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        Calculator obj1 = new Calculator();
        while(running){
            System.out.println("PRESS\n1: ADD\n2: SUBTRACT\n3: MULTIPLY\n4: DIVIDE\n0: EXIT");
            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();
            switch (choice){
                case 0: running=false;
                break;
                case 1: obj1.add(sc);
                break;
                case 2: obj1.subtract(sc);
                break;
                case 3: obj1.multiply(sc);
                break;
                case 4: obj1.divide(sc);
                break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}
