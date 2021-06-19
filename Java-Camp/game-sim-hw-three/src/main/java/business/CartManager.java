package business;

import entity.CartItem;
import entity.Customer;

public class CartManager {
    public void addToCart(Customer customer, CartItem cartItem){
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" game: "+cartItem.getGame().getName()+" added to cart");
        System.out.println("Price :"+cartItem.getPrice());
    }
}
