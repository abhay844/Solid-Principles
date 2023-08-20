package ocp.wrong;


/**
 * In the below class we have two medium of sending the notifications using mobile and email but let us say a client wants
 * to send notifications using WhatsApp also then we need to modify this class to send notification using Whatsapp.
 * If we add WhatsApp notifications then it is also possible that this service is not required by existing clients who were
 * using it.
 * By modifying the existing NotificationService it is breaking the Open/closed principle.
 * In the correct package we have added a separate interface for NotificationService and then using that for sending notifications
 * using different ways. So we are just allowing the extension of NotificationService and not its modifications.
 */
public class NotificationService {

    public void sendOtp(String medium) {
        if (medium.equals("mobile")) {
            //do something
        }

        if (medium.equals("email")) {
            // do something.
        }
    }
}
