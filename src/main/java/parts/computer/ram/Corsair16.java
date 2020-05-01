package parts.computer.ram;

import parts.Policy;
import parts.computer.RAM;

public class Corsair16 extends RAM {

  public Corsair16(Policy policy) {
    super(policy, 89);
  }

  @Override
  public long getCapacity() {
    return 2 ^ 14;
  }
}
