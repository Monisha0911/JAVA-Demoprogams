package day5;

public class ShoppingCartMain {
    public static void main(String[] args) {
        Item[] items = {
            new Item("Laptop", 1, 45000),
            new Item("Mouse", 2, 500)
        };

        try {
            double total = ShoppingCart.calculateTotal(items);
            System.out.println("Total Bill: " + total);
        } catch (InvalidQuantityException | LimitExceededException e) {
            System.out.println(e.getMessage());
        }
    }
}

