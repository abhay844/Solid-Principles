package srp.wrong;

/**
 * As we can see in the below BankService class, it has multiple responsibility to do like printing passbook,
 * getting load interest info and sending otp. Therefore it is violating single responsibility principle.
 * We can separate out printPassBook, getLoanInterestInfo and sendOtp to separate services.
 */
public class BankService {

    public void deposit(long amount, String accountNo) {
        //
    }

    public void withDraw(long amount, String accountNo) {
        //
    }

    public void printPassBook(){
        //
    }

    public void sendOtp(String medium) {
        if(medium.equals("mobile")) {
            //
        }
    }

    public void getLoanInterestInfo(String loanType) {
        if (loanType.equals("car")) {
            //do some job
        }

        if (loanType.equals("home")) {
            // do some job
        }
    }

}
