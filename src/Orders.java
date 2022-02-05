public enum Orders {
    Sandwich(250),
    GajarHalwa(200),
    FriedRice(200);

    public double getPrice() {
        return price;
    }

    private double price;
    Orders(double price){
        this.price=price;
    }

}
