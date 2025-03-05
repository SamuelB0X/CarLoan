import javax.swing.*;

public class CarLoan {
    public CarLoan(int carLoan, int loanLength, int downPayment, int interestRate){
        if (loanLength <= 0) {
            System.out.println("Error! You must take out a valid car loan");
        } else if (downPayment >= carLoan) {
            System.out.println("The car can be paid in full");
        } else {
            int reaminingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = reaminingBalance / months;
            int interest = monthlyBalance * interestRate / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println("Your monthy payment is: $" + monthlyPayment);

        }
    }
}
