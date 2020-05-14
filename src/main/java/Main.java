public class Main {
    public static void main(String[] args) {
        Part[] parts = {new Memory(140), new Memory(300), new Cpu(320), new Gpu(450)};

        test(parts, PricePolicy.DEFAULT);

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
            System.out.println("Type de produit : " + p.getClass().getSimpleName() + " | Prix : " + policy.apply(p));
            total += policy.apply(p);
        }

        System.out.println("Prix total : " + total);
    }
}