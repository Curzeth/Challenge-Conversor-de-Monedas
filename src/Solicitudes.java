import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Solicitudes {
    private String mxnToUsd = "https://v6.exchangerate-api.com/v6/0151594d2b78d98ebcb7b21f/pair/MXN/USD/AMOUNT";
    private String usdToMxn = "https://v6.exchangerate-api.com/v6/0151594d2b78d98ebcb7b21f/pair/USD/MXN/AMOUNT";
    private String copToUsd = "https://v6.exchangerate-api.com/v6/0151594d2b78d98ebcb7b21f/pair/COP/USD/AMOUNT";
    private String usdToCop = "https://v6.exchangerate-api.com/v6/0151594d2b78d98ebcb7b21f/pair/USD/COP/AMOUNT";
    private String arsToUsd = "https://v6.exchangerate-api.com/v6/0151594d2b78d98ebcb7b21f/pair/ARS/USD/AMOUNT";
    private String usdToArs = "https://v6.exchangerate-api.com/v6/0151594d2b78d98ebcb7b21f/pair/USD/ARS/AMOUNT";

    private Solicitudes() {}

    public String getMxnToUsd() {
        return mxnToUsd;
    }

    public String getUsdToMxn() {
        return usdToMxn;
    }

    public String getCopToUsd() {
        return copToUsd;
    }

    public String getUsdToCop() {
        return usdToCop;
    }

    public String getArsToUsd() {
        return arsToUsd;
    }

    public String getUsdToArs() {
        return usdToArs;
    }

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner valor = new Scanner(System.in);

        var convertirValor = valor.nextLine();

        public String urlCompleta(String urlBase + monto) {
            return urlBase + monto;
        }

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create())
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Respuesta: " + response.body());
    }

}