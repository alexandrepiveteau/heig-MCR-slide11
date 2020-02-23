package parts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartTest {

  @Test
  public void testEmptySumIsCorrect() {
    Part[] parts = {};
    assertEquals(0, Part.totalPrice(parts));
  }

  @Test
  public void testPartsSumIsCorrect() {
    Part[] parts = {new Wheel(), new Windshield(), new Engine()};
    assertEquals(
        Wheel.PRICE + Windshield.PRICE + Engine.PRICE,
        Part.totalPrice(parts)
    );
  }

}
