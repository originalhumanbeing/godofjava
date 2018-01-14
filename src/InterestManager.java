/**
 * Created by Hyunjung on 2018. 1. 11..
 */
public class InterestManager {
    public static void main(String [] args) {
        InterestManager manager = new InterestManager();
        for (int i=1; i<366; i++) {
            //manager.getInterestRate(i);
            manager.calculateAmount(i, 1000000);
        }
    }

    public double getInterestRate(int day) {
        double interest;

        if (day>=1 && day<=90) {
            interest = 0.05;
        } else if (day>=91 && day<=180) {
            interest = 0.1;
        } else if (day>=181 && day<=364) {
            interest = 0.2;
        } else {
            interest = 0.56;
        }
        System.out.println(interest);
        return interest;
    }

    public double calculateAmount(int day, long amount) {
       double interest = getInterestRate(day);
       double total = amount*interest + amount;
       System.out.println(total);
       return total;
    }
}
