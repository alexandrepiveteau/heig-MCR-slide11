package Visitor;

import Parts.CPU;
import Parts.GPU;
import Parts.Memory;

public class DiscountVisitor implements PartVisitor {
  private double mem = 1;
  private double cpu = 1;
  private double gpu = 1;

  @Override
  public double visit(Memory item) {
    return item.getPrice() * mem;
  }

  @Override
  public double visit(CPU item) {
    return item.getPrice() * cpu;
  }

  @Override
  public double visit(GPU item) {
    return item.getPrice() * gpu;
  }

  public void setMem(double mem) {
    this.mem = mem;
  }

  public void setCpu(double cpu) {
    this.cpu = cpu;
  }

  public void setGpu(double gpu) {
    this.gpu = gpu;
  }

}
