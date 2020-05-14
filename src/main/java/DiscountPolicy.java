import java.util.HashMap;
import java.util.Map;

public class DiscountPolicy implements PricePolicy {
    Map<Class<?>, Double> discounts;

    public DiscountPolicy() {
        discounts = new HashMap<>();
    }

    @Override
    public double apply(Part p) {
        double discount = discounts.containsKey(p.getClass()) ? discounts.get(p.getClass()) : 1;
        return p.getPrice() * discount;
    }

    public <T extends Part> void addDiscount(Class<T> c, double d) {
        discounts.put(c, d);
    }

    public <T extends Part> void resetDiscount(Class<T> c) {
        if (discounts.containsKey(c)) {
            discounts.remove(c);
        }
    }
}