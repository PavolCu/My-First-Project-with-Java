package calculator;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        System.out.println("Prices:");
        shop.prices().forEach((k, v) -> System.out.println(k + ": " + v));
    }
}