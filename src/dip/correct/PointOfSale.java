package dip.correct;

public class PointOfSale {

    private BankCard bankCard;

    public PointOfSale(BankCard bankCard){
        this.bankCard = bankCard;
    }

    public void purchaseSomething(Long amount) {
        bankCard.doPayment(amount);
    }

    public static void main(String[] args) {
        BankCard creditCard = new CreditCard();
        BankCard debitCard = new DebitCard();
        PointOfSale pointOfSale = new PointOfSale(debitCard);
        pointOfSale.purchaseSomething(100L);
    }
}
