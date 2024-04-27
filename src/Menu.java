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
        double monto;

        switch (opcion) {
            case 1:
                String mxnToUsd = Solicitudes.getmxnToUsd();
                break;
            case 2:
                String usdToMxn = Solicitudes.getustToMxn();
                break;
            case 3:
                String copToUsd = Solicitudes.getustToMxn();
                break;
            case 4:
                String usdToCop = Solicitudes.getustToMxn();
                break;
            case 5:
                String arsToUsd = Solicitudes.getustToMxn();
                break;
            case 6:
                String usdToArs = Solicitudes.getustToMxn();
                break;
            case 7:
                System.out.println();
                break;
            default:
                System.out.println();
        }


//        Ingrese el valor que desea convertir:

    }
}