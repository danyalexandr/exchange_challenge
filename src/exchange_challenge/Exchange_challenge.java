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

        var apiKey = "05b2f1ccd276222c8d20dfea";
        var dato = 0;
        String direccion = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + dato + "/";
        Scanner entrada = new Scanner(System.in);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        System.out.println("*******************************************************");
        System.out.println("Sea bienvenido/a al conversor de moneda");
        System.out.println("");
        System.out.println("1 - Dolar => Peso argentino");
        System.out.println("2 - Peso argentino => Dolar");
        System.out.println("3 - Dolar => Real brasileño");
        System.out.println("4 - Real brasileño => Dolar");
        System.out.println("5 - Dolar => Peso colombiano");
        System.out.println("6 - Peso colombiano => Dolar");
        System.out.println("7 - Salir");
        System.out.println("Elija una opcion valida:");
        System.out.println("*******************************************************");

        do {

            dato = (int) entrada.nextInt();

            switch (dato) {
                case 1 -> {
                    System.out.println("caso 1");
                    entrada.close();
                    break;
                }
                case 2 -> {
                    System.out.println("caso 2");
                    entrada.close();
                    break;
                }
                case 3 -> {
                    System.out.println("caso 3");
                    entrada.close();
                    break;
                }
                case 4 -> {
                    System.out.println("caso 4");
                    entrada.close();
                    break;
                }
                case 5 -> {
                    System.out.println("caso 5");
                    entrada.close();
                    break;
                }
                case 6 -> {
                    System.out.println("caso 6");
                    entrada.close();
                    break;
                }
                case 7 -> {
                    System.out.println("caso 7");
                    System.out.println("bye");
                    entrada.close();
                    break;
                }
                default ->
                    throw new AssertionError();
            }
        } while (dato != 7);

    }

}
