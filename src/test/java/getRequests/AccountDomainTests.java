package getRequests;

import Client.CanvasClient;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class AccountDomainTests {

    static CanvasClient client;

    static{

        client = new CanvasClient("","");
        client.setToken("//");


    }

    @Test
    void testSearchAccountDomain() throws IOException {

        AccountDomain accountDomain = client.getAccountDomain();
        accountDomain.addDomainSearch("name","University of Delaware");
        client.searchAccountDomains(client);

    }

}
