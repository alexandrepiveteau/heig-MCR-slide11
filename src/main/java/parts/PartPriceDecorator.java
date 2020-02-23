package parts;

public abstract class PartPriceDecorator implements Part {

  private Part part;

  public PartPriceDecorator(Part part) {
    this.part = part;
  }

  @Override
  public double getPrice() {
    return part.getPrice();
  }

}
