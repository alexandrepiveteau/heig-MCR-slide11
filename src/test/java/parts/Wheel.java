package parts;

public class Wheel implements Part {

  public static final double PRICE = 68;

  @Override
  public double getPrice() {
    return PRICE;
  }

}
