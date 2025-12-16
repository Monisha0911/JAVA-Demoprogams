package day5;

public class Item {
    @SuppressWarnings("unused")
	private String name;
    private int qty;
    private double price;

    public Item(String name, int qty, double price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }
}
