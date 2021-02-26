package bookshop.model;

public class OrderItem {
    private final int count;

    private final Product product;

    public OrderItem(Product product, int count) {
        this.product = product;
        this.count = count;
    }

    public int getCount() {
        return count;
    }


    public Product getProduct() {
        return product;
    }


    @Override
    public boolean equals(Object obj) {
        OrderItem other = (OrderItem) obj;
        return other.product.equals(this.product)
                && other.count == this.count;
    }

    @Override
    public int hashCode() {
        return this.count;
    }
}
