# HEIG-VD MCR – OCP

[![Build Status](https://travis-ci.com/alexandrepiveteau/heig-MCR-slide11.svg?branch=master)](https://travis-ci.com/alexandrepiveteau/heig-MCR-slide11)

Assuming we have the following piece of code :

```java
class Sample {
  public static double totalPrice(Part[] parts) {
    double total = 0;
    for (Part p : parts)
      total += p.getPrice(); return total;
  }
  
  // Is there a better way that this one to make sales ?
  // for (Part p : parts)
  //   total += (p instanceof Memory ? 0.5 : 1) * p.getPrice();

}
```