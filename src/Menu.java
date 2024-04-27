import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Bienvenido/a al Conversor de Monedas.
                -----------------------------------------------------
                Ingresa el número según la opción deseada:
                1 - Peso mexicano → Dólar estadounidense
                2 - Dólar estadounidense → Peso mexicano
                3 - Peso colombiano → Dólar estadounidense
                4 - Dólar estadounidense → Peso colombiano
                5 - Peso argentino → Dólar estadounidense
                6 - Dólar estadounidense → Peso argentino
                7 - Salir
                -----------------------------------------------------
                """);
        var valorIngresado = sc.nextLine();
        System.out.println("Ingresa el valor que deseas convertir: ");
        valorIngresado = sc.nextLine();
    }
}