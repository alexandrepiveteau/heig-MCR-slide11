package Visitor;

import Parts.CPU;
import Parts.GPU;
import Parts.Memory;

public interface PartVisitor {
  double visit(Memory item);
  double visit(CPU item);
  double visit(GPU item);
}
