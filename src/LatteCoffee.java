class LatteCoffee extends Coffee {
    public LatteCoffee() {
        super("Latte", 3.50);
    }

    public double calculateTotal() {
        return price + (toppings.size() * 0.75);
    }
}