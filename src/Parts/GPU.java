package Parts;

import Visitor.PartVisitor;

public class GPU extends Part {
  public GPU(String name, double price) {
    super(name, price);
  }

  @Override
  public double accept(PartVisitor visitor) {
    return visitor.visit(this);
  }
}
