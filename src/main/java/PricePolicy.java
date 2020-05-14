public interface PricePolicy {
    static final PricePolicy DEFAULT = new PricePolicy() {
        @Override
        public double apply(Part p) {
            return p.getPrice();
        }
    };

    public double apply(Part p);
}