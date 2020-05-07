import java.util.*;

public class DiscountsManager {
    private static DiscountsManager instance;

    Map<Class<?>, Discount> discountMap = new HashMap<>();

    private DiscountsManager(){
    }

    public static DiscountsManager getInstance(){
        if(instance == null) instance = new DiscountsManager();
        return instance;
    }

    public void addDiscount(double percent, Class<?> c){
        if(discountMap.containsKey(c)){
            discountMap.get(c).setPercent(percent);
        }else{
            discountMap.put(c, new Discount(percent));
        }
    }

    public double getDiscountedPrice(Part p){

        return p.getInitialPrice() - (p.getInitialPrice() * discountMap.get(p.getClass()).percent/100);
    }

    private class Discount {
        private double percent;

        public Discount(double percent){
            this.percent = percent;
        }

        public void setPercent(double newPercent){
            this.percent = newPercent;
        }
    }

}
