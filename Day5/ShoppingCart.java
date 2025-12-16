package day5;

public class ShoppingCart {

    public static double calculateTotal(Item[] items)
            throws InvalidQuantityException, LimitExceededException {

        double total = 0;

        for (Item item : items) {
            if (item.getQty() <= 0) {
                throw new InvalidQuantityException(
                    "Invalid quantity for item"
                );
            }

            total += item.getQty() * item.getPrice();
        }

        if (total > 50000) {
            throw new LimitExceededException(
                "Total bill exceeds allowed limit"
            );
        }

        return total;
    }
}

