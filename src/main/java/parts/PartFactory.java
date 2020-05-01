package parts;

import parts.computer.CPU;
import parts.computer.RAM;

public interface PartFactory {

  CPU newCPU();

  RAM newRAM();

}
