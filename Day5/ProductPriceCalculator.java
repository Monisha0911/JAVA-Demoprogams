package day5;

public class ProductPriceCalculator {
    public static void main(String[] args) {
        Product[] products = {
            new Product("Pen", 10),
            new Product("Book", 50),
            new Product("Bag", 200)
        };

        try {
            double total = 0;
            for(Product product:products)
            {
            	if(product.price<0)
            	{
            		throw new InvalidPriceException("Invalid:"+product.name);
            	}
            	 total=total+product.price;
            }
            System.out.println("Total Price: " + total);
        }
        catch (InvalidPriceException e) {
            System.out.println(e.getMessage());
        } 

        }
}