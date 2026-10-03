import java.util.Scanner;
class Cart {
    private final String cartId;
    private double[] itemPrices;
    private int count;
    public Cart(String cartId, int maxItems) {
        this.cartId = cartId;
        this.itemPrices = new double[maxItems];
        this.count = 0;
    }
    public void addItem(double price) {
        if (count < itemPrices.length) {
            itemPrices[count] = price;
            count++;
        } else {
            System.out.println("Cart is full!");
        }
    }
    public double getTotal() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += itemPrices[i];
        }
        return total;
    }
    public int getItemCount() {
        return count;
    }
    public String getCartId() {
        return cartId;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cart ID: ");
        String id = sc.next();
        System.out.print("Enter maximum items capacity: ");
        int capacity = sc.nextInt();
        Cart cart = new Cart(id, capacity);
        System.out.print("How many item prices do you want to add? ");
        int itemsToAdd = sc.nextInt();
        for (int i = 0; i < itemsToAdd; i++) {
            System.out.print("Enter item price: ");
            double price = sc.nextDouble();
            cart.addItem(price);
        }
        System.out.println("Cart Total = " + cart.getTotal());
        System.out.println("Item Count = " + cart.getItemCount());
        sc.close();
    }
}
