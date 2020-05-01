package parts.computer.ram;

import parts.Policy;
import parts.computer.RAM;

public class Kingston8 extends RAM {

  public Kingston8(Policy policy) {
    super(policy, 75);
  }

  @Override
  public long getCapacity() {
    return 2^13;
  }
}
