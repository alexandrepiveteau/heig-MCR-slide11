import Parts.CPU;
import Parts.GPU;
import Parts.Memory;
import Parts.Part;
import Visitor.DiscountVisitor;
import java.util.List;

public class Main {
  public static void main(String...args) {
    CPU cpu1 = new CPU("cpu1", 250.00);
    CPU cpu2 = new CPU("cpu2", 400.00);
    GPU gpu1 = new GPU("gpu1", 800.00);
    GPU gpu2 = new GPU("gpu2", 750.00);
    Memory mem = new Memory("supermem", 4000.00);

    List<Part> shoppingCart = List.of(cpu1, cpu2, gpu1, gpu2, mem);

    DiscountVisitor discountVisitor = new DiscountVisitor();

    discountVisitor.setCpu(0.7);

    double redAmount = Part.totalPrice(shoppingCart, discountVisitor);
    double noRedAmount = Part.totalPrice(shoppingCart);

    System.out.println("Without reduction " + noRedAmount);
    System.out.println("With reduction " + redAmount);

    discountVisitor.setCpu(1.5);
    discountVisitor.setMem(1.2);
    redAmount = Part.totalPrice(shoppingCart, discountVisitor);
    System.out.println("With reduction " + redAmount);
  }

}
