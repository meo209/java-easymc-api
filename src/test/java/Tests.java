import meo.easymcapi.AltTokenResponse;
import meo.easymcapi.EasyMCRequest;

import java.io.IOException;
import java.net.URISyntaxException;

public class Tests {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        EasyMCRequest request = new EasyMCRequest();
        AltTokenResponse response = request.getResponse("RT2nRVkvK10CKW7D9Em9");

        System.out.println(response.getMcName());
        System.out.println(response.getSession());
        System.out.println(response.getUserId());
    }

}
