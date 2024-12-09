package app;

//connecting dependencies

import java.util.Locale;
import java.util.Scanner;

public class Main {

    //declaration and initialization of constants
    private final static String CURRENCY_EUR = "EUR";
    private final static String NUMBER_SYMBOL = "№";

    //declaring class variables
    static String product;
    static int dayCount;//ask the user
    static int productNumber;
    static int itemQuantity; //ask the user
    static double price; //ask the user
    static double salesByDay;
    static double totalSales;

    public static void main(String[] args) {

        // took it as an axiom )))
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        //initialization of changes
        product = "smartphone";
        productNumber = 1;

        //request from the user for the price of the product
        System.out.printf("Input the price for the, %S %s: ",
                CURRENCY_EUR, product);
        price = scanner.nextDouble();

        //request from the user for the number of units of the product sold
        System.out.print("Input how many units of the product were sold, pcs: ");
        itemQuantity = scanner.nextInt();

        //request from the user for the number of days the product is on sale
        System.out.print("Input  the number of sales days: ");
        dayCount = scanner.nextInt();

        //calculating the total amount of sales
        totalSales = itemQuantity * price;
        //calculating the average amount of sales per day
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

        //request from the user for the price of the product
        System.out.printf("%nInput the price for the, %S %s: ",
                CURRENCY_EUR, product);
        price = scanner.nextDouble();

        //request from the user for the number of units of the product sold
        System.out.print("Input how many units of the product were sold, pcs: ");
        itemQuantity = scanner.nextInt();

        //request from the user for the number of days the product is on sale
        System.out.print("Input  the number of sales days: ");
        dayCount = scanner.nextInt();

        //calculating the total amount of sales
        totalSales = itemQuantity * price;
        //calculating the average amount of sales per day
        salesByDay = totalSales / dayCount;
        //output the result of the calculation for the first product
        System.out.printf("%nProduct %S %d: %s, " +
                        "%ntotal sales for %d days is  %S  %.2f," +
                        "%nsales by day is %S %.2f.%n",
                NUMBER_SYMBOL, productNumber, product, dayCount,
                CURRENCY_EUR, totalSales, CURRENCY_EUR, salesByDay);

        scanner.close();
    }
}
