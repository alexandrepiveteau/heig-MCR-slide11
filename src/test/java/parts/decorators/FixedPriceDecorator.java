package parts.decorators;

import parts.Part;
import parts.PartPriceDecorator;

public class FixedPriceDecorator extends PartPriceDecorator {

  private double promotion;

  public FixedPriceDecorator(double promotion, Part part) {
    super(part);
    this.promotion = promotion;
  }

  @Override
  public double getPrice() {
    return super.getPrice() - promotion;
  }

}
