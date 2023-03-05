import java.util.ArrayList;

abstract class Coffee {
    protected String type;
    protected double price;
    protected ArrayList<String> toppings;

    public Coffee(String type, double price) {
        this.type = type;
        this.price = price;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(String topping) {
        this.toppings.add(topping);
    }

    public abstract double calculateTotal();

    public String toString() {
        String result = type + " coffee";
        if (!toppings.isEmpty()) {
            result += " with ";
            for (int i = 0; i < toppings.size(); i++) {
                result += toppings.get(i);
                if (i < toppings.size() - 1) {
                    result += ", ";
                }
            }
        }
        return result;
    }
}