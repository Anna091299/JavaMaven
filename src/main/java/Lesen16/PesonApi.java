package Lesen16;

import netscape.javascript.JSException;
import netscape.javascript.JSObject;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PesonApi {
    public static Peson getPersonFroApi() {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().GET().         GET().
                uri(URI.create("http://randomuser.me/api")).
                build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Peson peson = parseJsonToPerson(response);
            return peson;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Peson parseJsonToPerson(HttpResponse<String> responsex) {
        JSONObject object = new JSONObject(responsex.body()).getJSONArray("results").getJSONObject(0);
        Peson res = new Peson();
        res.setName(object.getJSONObject("name").getString("last"));
        res.setCountry(object.getJSONObject("location").getString("country"));
        // дз
        // дополнить остольные поля
        //  может быть проблема с датой res.

        return res;
    }
    public static Peson parseJson (){

        return null;
    }
}
