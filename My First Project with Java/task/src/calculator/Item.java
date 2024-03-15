package calculator;

public class Item {
    private String name;
    private float price;
    private float earnedAmount;

    public Item(String name, float price, float earnedAmount) {
        this.name = name;
        this.price = price;
        this.earnedAmount = earnedAmount;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", earnedAmount=" + earnedAmount +
                '}';
    }

    public float getEarnedAmount() {
        return earnedAmount;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}
