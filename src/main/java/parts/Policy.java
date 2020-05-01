package parts;

public interface Policy<P extends Part> {

  static <P extends Part> Policy<P> fixed() {
    return Part::getOriginalPrice;
  }

  static <P extends Part> Policy<P> percentage(
      double percentage,
      Policy<P> original
  ) {
    return part -> percentage / 100.0 * original.price(part);
  }


  static <P extends Part, A extends P> Policy<P> ifInstance(
      Class<A> clazz,
      Policy<A> replacement,
      Policy<P> original
  ) {
    return part -> {
      if (clazz.isInstance(part)) {
        return replacement.price((A) part);
      } else {
        return original.price(part);
      }
    };
  }

  double price(P part);
}
