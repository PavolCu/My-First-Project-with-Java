package calculator;

import java.util.HashMap;
import java.util.Map;

public class Shop {
    public Map<String, Double> prices() {
        Map<String, Double> prices = new HashMap<>();
        prices.put("Bubblegum", 2.0);
        prices.put("Toffee", 0.2);
        prices.put("Ice cream", 5.0);
        prices.put("Milk chocolate", 4.0);
        prices.put("Doughnut", 2.5);
        prices.put("Pancake", 3.2);
        return prices;
    }
}
