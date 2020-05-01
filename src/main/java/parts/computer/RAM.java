package parts.computer;

import parts.Part;
import parts.Policy;

public abstract class RAM extends Part {

  protected RAM(Policy policy, double price) {
    super(policy, price);
  }

  public abstract long getCapacity();
}
