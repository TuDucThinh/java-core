import bank.Bank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();
/* bạn muốn chọn chức năng nào
    1. gửi tiền vào tài khoản
    2. rút tiền khỏi tài khoản
    3. in thông tin thẻ
*/
        int choose;
        System.out.println("1. Send money "); // gửi tiền
        System.out.println("2. Withdrawal"); // rút tiền
        System.out.println("3. print card information"); // in thông tin thẻ
        Scanner scanner = new Scanner(System.in);
        choose = scanner.nextInt();
        switch (choose){

            case 1:
                // số tiền hiện tại trong tài khoản là
                System.out.println("the current amount in the account is: " + bank.sendMoney(bank.totalMoney));
                break;
            case 2:
                System.out.println(bank.withdrawal(bank.totalMoney));
                break;
            case 3:
                System.out.println(bank.cardInformation(bank.totalMoney));
                break;
            default:
                System.out.println("If you made the wrong choice, please choose again");
        }
    }
}
