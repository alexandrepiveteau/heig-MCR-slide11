package parts.decorators;

import org.junit.jupiter.api.Test;
import parts.Engine;
import parts.Part;
import parts.Wheel;
import parts.Windshield;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PartDecoratorTest {

  @Test
  public void testDecoratedFixedPriceIsCorrect() {
    Part part = new FixedPriceDecorator(10, new Engine());
    assertEquals(Engine.PRICE - 10, part.getPrice());
  }

  @Test
  public void testDecoratedPercentagePriceIsCorrect() {
    Part part = new PercentageDecorator(0.5, new Wheel());
    assertEquals(Wheel.PRICE * 0.5, part.getPrice());
  }

  @Test
  public void testDecoratedSumIsCorrect() {
    Part p1 = new FixedPriceDecorator(50, new Windshield());
    Part p2 = new PercentageDecorator(0.5, new Wheel());
    double expected = Wheel.PRICE * 0.5 + Windshield.PRICE - 50;
    double actual = Part.totalPrice(new Part[]{ p1, p2 });
    assertEquals(expected, actual);
  }

}