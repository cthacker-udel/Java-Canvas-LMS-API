package getRequests;

import Client.CanvasClient;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountNotificationTest {

    static CanvasClient client;

    static{

        client = new CanvasClient("","");
        client.setToken("//");


    }

    @Test
    void testIndexOfActiveGlobalNotification() throws IOException {

        AccountNotification accountNotification = client.getAccountNotification();

        accountNotification.setAccountId(112);
        accountNotification.setNotificationId(3332);

        assertNotNull(client.indexOfActiveGlobalNotifactionCurrUser(client));

    }

    @Test
    void showGlobalNotification() throws IOException{

        AccountNotification accountNotification = client.getAccountNotification();

        accountNotification.setAccountId(112);
        accountNotification.setNotificationId(334);

        client.showGlobalNotification(client);

    }

}
