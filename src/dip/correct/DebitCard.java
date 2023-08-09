package dip.correct;

public class DebitCard implements BankCard{

    public void doPayment(Long amount) {
        System.out.println("Making payment of " + amount + " using Debit card");
    }
}
