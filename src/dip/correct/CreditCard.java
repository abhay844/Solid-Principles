package dip.correct;

public class CreditCard implements BankCard{

    public void doPayment(Long amount){
        System.out.println("Making payment of " + amount + " using Credit card");
    }
}
