public class Main {
    public static void main(String[] args) {
        int accountBalance = 100;
        int arrivalMoney = 1111;
        int bonuseMoney = 0;

        accountBalance = accountBalance + arrivalMoney;
        if (arrivalMoney > 1000) {
            bonuseMoney = arrivalMoney / 100;
            accountBalance = accountBalance + bonuseMoney;
        }

        System.out.println("На Вашем счету: " + accountBalance + " рублей. Было начислено " + bonuseMoney + " бонусных рублей.");
    }
}
