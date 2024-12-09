package app;

public class Main {

    //declaration and initialization of constants
    private final static String CURRENCY_EUR = "EUR";
    private final static String NUMBER_SYMBOL = "№";

    //declaring class variables
    static String product;
    static int dayCount;
    static int productNumber;
    static double price;
    static double salesByDay;
    static double totalSales;

    public static void main(String[] args) {

        // initialization of variables for the first product
        product = "smartphone";
        productNumber = 1;
        dayCount = 5;
        price = 999.00;
        totalSales = 26981.00;
        salesByDay = totalSales / dayCount;
        //output the result of the calculation for the first product
        System.out.printf("%nProduct %S %d: %s, " +
                        "%ntotal sales for %d days is  %S  %.2f," +
                        "%nsales by day is %S %.2f.%n",
                NUMBER_SYMBOL, productNumber, product, dayCount,
                CURRENCY_EUR, totalSales, CURRENCY_EUR, salesByDay);

        //initialization of variables for the second product
        product = "laptop";
        productNumber = 2;
        dayCount = 3;
        price = 1499.95;
        totalSales = 78124.45;
        salesByDay = totalSales / dayCount;
        //output the result of the calculation for the second product
        System.out.printf("%nProduct %S %d: %s, " +
                        "%ntotal sales for %d days is  %S  %.2f," +
                        "%nsales by day is %S %.2f.%n",
                NUMBER_SYMBOL, productNumber, product, dayCount,
                CURRENCY_EUR, totalSales, CURRENCY_EUR, salesByDay);

    }
}