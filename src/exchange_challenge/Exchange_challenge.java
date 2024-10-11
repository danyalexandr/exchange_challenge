package exchange_challenge;

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

    public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);
       var busqueda = entrada.nextInt();
       String apiKey = "05b2f1ccd276222c8d20dfea";
       var direccion = "https://v6.exchangerate-api.com/v6/"+ apiKey + "/latest/" + busqueda;
        
         HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
         .uri(URI.create(direccion))
         .build();    

    HttpResponse<String> response = client
     .send(request, HttpResponse.BodyHandlers.ofString()); 
    
     String json = response.body();
        System.out.println(json);
    }
    
}
