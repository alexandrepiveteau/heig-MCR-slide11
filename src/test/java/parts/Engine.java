package parts;

public class Engine implements Part {

  public static final double PRICE = 5000;

  @Override
  public double getPrice() {
    return PRICE;
  }

}
