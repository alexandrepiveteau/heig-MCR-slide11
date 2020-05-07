public abstract class Part {

    private double price;

    public Part(double price){
        this.price = price;
        setDiscount(0);
    }

    public double getPrice(){
        return DiscountsManager.getInstance().getDiscountedPrice(this);
    }

    public void setDiscount(double percent){
        DiscountsManager.getInstance().addDiscount(percent, getClass());
    }

    public double getInitialPrice(){
        return price;
    }

}
