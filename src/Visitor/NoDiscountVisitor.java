package Visitor;

import Parts.CPU;
import Parts.GPU;
import Parts.Memory;

public class NoDiscountVisitor implements PartVisitor {

  @Override
  public double visit(Memory item) {
    return item.getPrice();
  }

  @Override
  public double visit(CPU item) {
    return item.getPrice();
  }

  @Override
  public double visit(GPU item) {
    return item.getPrice();
  }
}
