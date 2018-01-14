/**
 * Created by Hyunjung on 2018. 1. 11..
 */
public class SalaryManager {

    public static void main(String [] args) {
        SalaryManager manager = new SalaryManager();
        manager.getMonthlySalary(20000000);
    }

    public double getMonthlySalary(int yearlySalary) {
        double monthlySalaryBeforeTax = yearlySalary/12.0;
        double monthlySalaryAfterTax= calculateTax(monthlySalaryBeforeTax);
        double monthlySalaryAfterPension = calculateNationalPension(monthlySalaryBeforeTax);
        double monthlySalaryAfterHealthInsurance = calculateHealthInsurance(monthlySalaryBeforeTax);

        double totalTax = monthlySalaryAfterTax + monthlySalaryAfterPension + monthlySalaryAfterHealthInsurance;
        monthlySalaryBeforeTax -= totalTax;
        System.out.println("나의 진짜 수입은 " + monthlySalaryBeforeTax);
        return monthlySalaryBeforeTax;
    }

    public double calculateTax(double monthSalary) {
        double tax = monthSalary*0.125;
        System.out.println(tax);
        return tax;
    }

    public double calculateNationalPension(double monthSalary) {
        double nationalPension = monthSalary*0.081;
        System.out.println(nationalPension);
        return nationalPension;
    }

    public double calculateHealthInsurance(double monthSalary) {
        double healthInsurance = monthSalary*0.135;
        System.out.println(healthInsurance);
        return healthInsurance;
    }

}
