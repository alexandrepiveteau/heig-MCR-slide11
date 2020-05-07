package Parts;

import Visitor.NoDiscountVisitor;
import Visitor.PartVisitable;
import Visitor.PartVisitor;
import java.util.List;

public abstract class Part implements PartVisitable {
  private String name;
  private double price;

  protected Part(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public double getPrice() {
    return price;
  }

  public static double totalPrice(List<Part> parts) {
    return totalPrice(parts, new NoDiscountVisitor());
  }

  public static double totalPrice(List<Part> parts, PartVisitor visitor) {
    double total = 0;
    for (Part p : parts)
      total += p.accept(visitor);

    return total;
  }
}
