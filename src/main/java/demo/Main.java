package demo;

import static parts.Policy.fixed;
import static parts.Policy.ifInstance;
import static parts.Policy.percentage;

import parts.Part;
import parts.PartFactory;
import parts.Policy;
import parts.computer.CPU;
import parts.factories.HighEndComputerFactory;

public class Main {

  public static void main(String[] args) {

    Policy<CPU> cpuReduction = percentage(80, fixed());
    Policy<Part> combined = ifInstance(CPU.class, cpuReduction, fixed());

    PartFactory factory = new HighEndComputerFactory(combined);
    Part[] parts = {factory.newCPU(), factory.newRAM(), factory.newRAM()};
    System.out.println("Pricing of " + Part.totalPrice(parts));
  }
}
