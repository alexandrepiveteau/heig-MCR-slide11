package parts.computer.cpu;

import parts.Policy;
import parts.computer.CPU;

public class IntelI7 extends CPU {

  private static final double ORIGINAL_PRICING = 350;

  public IntelI7(Policy policy) {
    super(policy, ORIGINAL_PRICING);
  }

  @Override
  public double getFrequency() {
    return 3.9;
  }
}
