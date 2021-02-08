package TextMessages;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


public class Main {
    public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
    public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

    public static void main(String [] args){
        Twilio.init(ACCOUNT_SID,AUTH_TOKEN);

         Message message = Message.creator(
                new PhoneNumber(System.getenv("MY_PHONE_NUMBER")),
                new PhoneNumber("+XXXXXXXXXX"),
                "This is a test text message"
        ).create();

        System.out.println(message.getSid());
    }

}
