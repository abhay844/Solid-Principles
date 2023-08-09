package isp.wrong;

public class PayTm implements UPIPayments{

    public void payMoney(){

    }

    public void getScratchCard() {

    }

    public void getCashBackAsCreditBalance() {
    // Now this method is not applicable to PayTm as they do not support cashback as credit balance
    // we are just forcing Paytm to implement this method and therefore UPIPayments interface is violating
    // Interface segregation principle
    }
}
