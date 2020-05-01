package parts.computer.cpu;

import parts.Policy;
import parts.computer.CPU;

public class IntelI5 extends CPU {

  public IntelI5(Policy policy) {
    super(policy, 150);
  }

  @Override
  public double getFrequency() {
    return 3.2;
  }
}
