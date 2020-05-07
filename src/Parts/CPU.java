package Parts;

import Visitor.PartVisitor;

public class CPU extends Part {

  public CPU(String name, double price) {
    super(name, price);
  }

  @Override
  public double accept(PartVisitor visitor) {
    return visitor.visit(this);
  }
}
