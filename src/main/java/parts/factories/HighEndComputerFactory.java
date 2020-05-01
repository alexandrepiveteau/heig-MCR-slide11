package parts.factories;

import parts.Part;
import parts.Policy;
import parts.computer.CPU;
import parts.computer.RAM;
import parts.computer.cpu.IntelI7;
import parts.computer.ram.Corsair16;

public class HighEndComputerFactory extends AbstractPartFactory {

  public HighEndComputerFactory(Policy<Part> policy) {
    super(policy);
  }

  @Override
  public CPU newCPU() {
    return new IntelI7(getPolicy());
  }

  @Override
  public RAM newRAM() {
    return new Corsair16(getPolicy());
  }
}
