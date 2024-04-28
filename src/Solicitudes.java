public class Solicitudes {

    private static final String urlBase = "https://v6.exchangerate-api.com/v6/0151594d2b78d98ebcb7b21f/pair/";

    private Solicitudes() {}

    public static String getUrlCompletaMXNtoUSD(){
        return urlBase + "MXN/USD/";
    }

    public static String getUrlCompletaUSDtoMXN(){
        return urlBase + "USD/MXN/";
    }

    public static String getUrlCompletaCOPtoUSD(){
        return urlBase + "COP/USD/";
    }

    public static String getUrlCompletaUSDtoCOP(){
        return urlBase + "USD/COP/";
    }

    public static String getUrlCompletaARStoUSD(){
        return urlBase + "ARS/USD/";
    }

    public static String getUrlCompletaUSDtoARS(){
        return urlBase + "USD/ARS/";
    }
}