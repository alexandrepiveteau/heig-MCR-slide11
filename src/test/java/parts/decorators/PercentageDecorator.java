package parts.decorators;

import parts.Part;
import parts.PartPriceDecorator;

public class PercentageDecorator extends PartPriceDecorator {

  private double percentage;

  public PercentageDecorator(double percentage, Part part) {
    super(part);
    this.percentage = percentage;
  }

  @Override
  public double getPrice() {
    return percentage * super.getPrice();
  }

}
