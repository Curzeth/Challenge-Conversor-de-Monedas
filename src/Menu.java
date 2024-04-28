import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                » Bienvenido/a al Conversor de Monedas «
                -----------------------------------------------------
                Ingresa el número según la opción deseada:
                -----------------------------------------------------
                1 - Peso mexicano → Dólar estadounidense
                2 - Dólar estadounidense → Peso mexicano
                3 - Peso colombiano → Dólar estadounidense
                4 - Dólar estadounidense → Peso colombiano
                5 - Peso argentino → Dólar estadounidense
                6 - Dólar estadounidense → Peso argentino
                7 - Salir
                -----------------------------------------------------
                """);

        int opcion = sc.nextInt();
        String urlCompleta = "";

        switch (opcion) {
            case 1:
                urlCompleta = Solicitudes.getUrlCompletaMXNtoUSD();
                break;
            case 2:
                urlCompleta = Solicitudes.getUrlCompletaUSDtoMXN();
                break;
            case 3:
                urlCompleta = Solicitudes.getUrlCompletaCOPtoUSD();
                break;
            case 4:
                urlCompleta = Solicitudes.getUrlCompletaUSDtoCOP();
                break;
            case 5:
                urlCompleta = Solicitudes.getUrlCompletaARStoUSD();
                break;
            case 6:
                urlCompleta = Solicitudes.getUrlCompletaUSDtoARS();
                break;
            case 7:
                System.out.println("Saliendo del programa... Gracias por su preferencia ♥");
                break;
            default:
                System.out.println("Opción no válida");
        }

        System.out.println("Ingrese el valor que desea convertir:");
        double monto = sc.nextDouble();
        urlCompleta += monto;

        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(urlCompleta).openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                Scanner rs = new Scanner(connection.getInputStream());
                StringBuilder response = new StringBuilder();
                while (rs.hasNextLine()) {
                    response.append(rs.nextLine());
                }
                System.out.println("Resultado: " + response.toString());
            } else {
                System.out.println("Error en la solicitud:" + responseCode);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}