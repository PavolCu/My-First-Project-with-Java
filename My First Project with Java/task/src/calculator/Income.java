package calculator;

import java.util.HashMap;
import java.util.Map;

public class Income {
    public Map<String, Double> calculateEarnings() {
        Map<String, Double> earnings = new HashMap<>();
        earnings.put("Bubblegum", 202.0);
        earnings.put("Toffee", 118.0);
        earnings.put("Ice cream", 2250.0);
        earnings.put("Milk chocolate", 1680.0);
        earnings.put("Doughnut", 1075.0);
        earnings.put("Pancake", 80.0);
        return earnings;
    }
}
