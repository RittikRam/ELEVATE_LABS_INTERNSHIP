package BankAccount;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Provide the following details respectively :" +
                "\n1:Initial Balance\n2:Account Number\n3:Account Holders Name\n4:Account Type(Savings/Current)");
        double bal = sc.nextDouble();
        int accNo = sc.nextInt();
        sc.nextLine();
        String accHolder = sc.nextLine();
        String accType = sc.nextLine();
        Account acc1 = new Account(bal,accNo,accHolder,accType);
        int choice;
        boolean flag = true;
        while(flag){
            System.out.println("Press" +
                    "\n1:Deposit Money\n2:Withdraw Money\n3:See Transasction History\n4:Check Balance\n5:Exit");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the amount to Deposit");
                    acc1.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Enter the amount to Withdraw");
                    acc1.withdraw(sc.nextDouble());
                    break;
                case 3:
                    System.out.println(acc1.getTransactionHistory());
                    break;
                case 4:
                    System.out.println(acc1.getBalance());
                    break;
                case 5: flag = false;
                    break;
                default:
                    System.out.println("Invalid Choice !!");
            }

        }

    }
}
