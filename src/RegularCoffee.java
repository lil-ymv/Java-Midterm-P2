class RegularCoffee extends Coffee {
    public RegularCoffee() {
        super("Regular", 2.50);
    }

    public double calculateTotal() {
        return price + (toppings.size() * 0.50);
    }
}