package calculator;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        //System.out.println("Prices:");
        //shop.prices().forEach((k, v) -> System.out.println(k + ": " + v));

        Income income = new Income();
        Map<String, Double> earnings = income.calculateEarnings();
        double totalEarnings = 0.0;
        System.out.println("Earned amount:");
        for (Map.Entry<String, Double> entry : earnings.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
            totalEarnings += entry.getValue();
        }
        System.out.println("Income: $" + totalEarnings);
    }
}
