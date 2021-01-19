public class Main {
    public static void main(String[] args) {
        int account = 500;
        int deposit = 3000;
        long amount;
        int bonus;
        if (deposit > 1000) {
            bonus = deposit / 100;
            amount = account + deposit + bonus;
        }
        else { bonus = 0;
            amount = account + deposit + bonus;
        }

            System.out.println(bonus);
            System.out.println(amount);
      }

    }

