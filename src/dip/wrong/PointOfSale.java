package dip.wrong;

public class PointOfSale {

    private DebitCard debitCard;

    public PointOfSale(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public void purchaseSomething(long amount) {
        debitCard.doPayment(amount);
    }

    public static void main(String[] args) {
        DebitCard debitCard1 = new DebitCard();
        PointOfSale pointOfSale = new PointOfSale(debitCard1);
        pointOfSale.purchaseSomething(100);
    }
}
