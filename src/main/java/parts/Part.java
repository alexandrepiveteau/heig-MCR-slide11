package parts;

public abstract class Part {

  private final Policy policy;
  private final double originalPrice;

  protected Part(Policy policy, double price) {
    this.policy = policy;
    this.originalPrice = price;
  }

  public static double totalPrice(Part[] parts) {
    double total = 0;
    for (Part part : parts) {
      total += part.getPrice();
    }
    return total;
  }

  public double getOriginalPrice() {
    return originalPrice;
  }

  public double getPrice() {
    return policy.price(this);
  }

}
