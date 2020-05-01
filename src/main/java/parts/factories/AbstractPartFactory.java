package parts.factories;

import parts.Part;
import parts.PartFactory;
import parts.Policy;

public abstract class AbstractPartFactory implements PartFactory {

  private final Policy<Part> policy;

  protected AbstractPartFactory(Policy<Part> policy) {
    this.policy = policy;
  }

  protected Policy<Part> getPolicy() {
    return policy;
  }
}
