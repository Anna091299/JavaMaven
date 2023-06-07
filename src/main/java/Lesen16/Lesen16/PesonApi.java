package Lesen16;

import org.json.JSONObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PesonApi {
    //    public static Peson getPersonFroApi() {
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder().GET().
//                uri(URI.create("https://randomuser.me/api")).build();
//        try {
//            for (int i = 0; i < 5; i++) {
//                HttpResponse<String> responsex = client.send(request, HttpResponse.BodyHandlers.ofString());
//                Peson peson = parseJsonToPerson(responsex);
//                return peson;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//    public static Peson parseJsonToPerson(HttpResponse<String> responsex) {
//        JSONObject object = new JSONObject(responsex.body()).
//                getJSONArray("results").getJSONObject(0);
//        Peson res = new Peson();
//        res.setName(object.getJSONObject("name").getString("first"));
//        res.setLastName(object.getJSONObject("name").getString("Last"));
//        res.setCountry(object.getJSONObject("location").getString("country"));
//        res.setPassword(object.getJSONObject("login").getString("password"));
//        res.setUsername(object.getJSONObject("login").getString("userName"));
//        LocalDateTime dog =
//                ZonedDateTime.parse(object.getJSONObject("dog").getString("date")).toLocalDateTime();
//        res.setDob(dog);
//
//        return res;
//    }
//
//    public static List<Peson> getPersonFroApi(int count) {
//        List<Peson> pesons = new ArrayList<>();
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder().GET().
//                uri(URI.create("https://randomuser.me/api")).build();
//        try {
//            for (int i = 0; i < count; i++) {
//                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//                Peson peson = parseJsonToPerson(response);
//                pesons.add(peson);
//            }
//            return pesons;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
        public static Peson getPesonFromApi() {

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().GET()
                    .uri(URI.create("https://randomuser.me/api")).build();
            try {
                HttpResponse<String> responsex = client.send(request, HttpResponse.BodyHandlers.ofString());

                Peson peson = parseJsonToPerson(responsex);
                return peson;

            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        public static Peson parseJsonToPerson(HttpResponse<String> responsex) {
            JSONObject object = new JSONObject(responsex.body())
                    .getJSONArray("results").getJSONObject(0);
            Peson res = new Peson();
            res.setName(object.getJSONObject("name").getString("first"));
            res.setLastName(object.getJSONObject("name").getString("last"));
            res.setCountry(object.getJSONObject("location").getString("country"));
            return res;
        }
    }
