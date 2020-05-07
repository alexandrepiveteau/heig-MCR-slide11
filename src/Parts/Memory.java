package Parts;

import Visitor.PartVisitor;

public class Memory extends Part {

  public Memory(String name, double price) {
    super(name, price);
  }

  @Override
  public double accept(PartVisitor visitor) {
    return visitor.visit(this);
  }
}
