package Day13.com.helloshop.order;

import Day13.com.helloshop.product.Product;
import Day13.com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
