import java.util.HashMap;
import java.util.Map;

interface PricePolicy {
    public default double apply(Part p) {
        return p.getPrice();
    }
}

class DiscountPolicy implements PricePolicy {
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

abstract class Part {
    double price;

    public Part(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    double getPrice(PricePolicy p) {
        return p.apply(this);
    }
}

class Memory extends Part {
    public Memory(double price) {
        super(price);
    }
}

class Cpu extends Part {
    public Cpu(double price) {
        super(price);
    }
}

class Gpu extends Part {
    public Gpu(double price) {
        super(price);
    }
}

class Main {
    public static void main(String[] args) {
        Part[] parts = {new Memory(140), new Cpu(320), new Gpu(450)};

        test(parts, new PricePolicy() {});

        DiscountPolicy discountPolicy = new DiscountPolicy();
        discountPolicy.addDiscount(Memory.class, 0.5);
        discountPolicy.addDiscount(Gpu.class, 0.9);

        test(parts, discountPolicy);

        discountPolicy.resetDiscount(Memory.class);

        test(parts, discountPolicy);
    }

    private static void test(Part[] parts, PricePolicy policy) {
        double total = 0;

        System.out.println();
        for (Part p : parts) {
            System.out.println("Type de produit : " + p.getClass().getSimpleName() + " | Prix : " + p.getPrice(policy));
            total += p.getPrice(policy);
        }

        System.out.println("Prix total : " + total);
    }
}