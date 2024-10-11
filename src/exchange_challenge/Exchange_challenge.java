package exchange_challenge;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

/**
 *
 * @author lowprioritygarbage
 */
public class Exchange_challenge {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner entrada = new Scanner(System.in);
        System.out.println("moneda?");
        var busqueda = entrada.nextLine();
        var apiKey = "05b2f1ccd276222c8d20dfea";
        String direccion = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + busqueda + "/";
        
        
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);
        
        Gson gson = new GsonBuilder()
                 .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                 .create();
        
        System.out.println(gson.toString());
    }

}
