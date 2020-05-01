package parts.factories;

import parts.Part;
import parts.Policy;
import parts.computer.CPU;
import parts.computer.RAM;
import parts.computer.cpu.IntelI5;
import parts.computer.ram.Kingston8;

public class MediumEndComputerFactory extends AbstractPartFactory {

  protected MediumEndComputerFactory(Policy<Part> policy) {
    super(policy);
  }

  @Override
  public CPU newCPU() {
    return new IntelI5(getPolicy());
  }

  @Override
  public RAM newRAM() {
    return new Kingston8(getPolicy());
  }
}
