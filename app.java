public class Main {
public static void main(String[] args) {
    
    String product = "Computer"
    String product2 = "Office desk"

    int age = 30;
    int code = 5290;
    char gender = "F";

    double price = 2100.0;
    double price2 = 650.50;
    double measure = 53.234567;
    
    system.out.println("Products:");
    system.out.println();
    system.out.printf("%s, Which price is $ %.2f%n", product, price);
    system.out.printf("%s, Which price is $ %.2f%n", product2, price2);
    system.out.println();
    System.out.printf("%d years old, code code %d and gender: %c%n", age,code, gender);
    System.out.println();
    System.out.printf("Measue with eight decimal places: %.6f%n", measure);
    System.out.printf("Rouded (three decimal places): %.3f%n", measure);
    System.out.printf("US decimal point: %.3f%n", measure);
    Locale.setDefault(Locale.US);
    }
}