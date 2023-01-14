package bank;

import java.util.Scanner;

public class Bank {
    public double totalMoney = 400000;
    public double sendMoney (double sendMoney){
//        double sendMoney;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the amount to deposit: ");
        sendMoney = scanner.nextDouble();
        return sendMoney + this.totalMoney;
    }
    public double withdrawal (double withdrawal) {
//        double withdrawal;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the amount to withdraw: ");
        withdrawal = scanner.nextDouble();
        if ((this.totalMoney - withdrawal) >= 0 ) {
            return withdrawal;
        } else
            System.out.println("insufficient balance.");
        return 0;
    }
    public String cardInformation (double cardInformation){
        String name = "name: TU DUC THINH";
        String date = "expiration date: 08/ 2024";

        return name + "\n" + date + "\n" + "The amount in the account: " + this.totalMoney;
    }
}
