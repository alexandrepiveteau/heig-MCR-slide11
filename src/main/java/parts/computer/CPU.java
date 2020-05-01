package parts.computer;

import parts.Part;
import parts.Policy;

public abstract class CPU extends Part {

  public CPU(Policy policy, double price) {
    super(policy, price);
  }

  public abstract double getFrequency();
}
