package parts;

public interface Part {

  static double totalPrice(Part[] parts) {
    double total = 0;
    for (Part part : parts) {
      total += part.getPrice();
    }
    return total;
  }

  double getPrice();

}
