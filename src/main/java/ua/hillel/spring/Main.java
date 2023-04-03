package ua.hillel.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.hillel.spring.stock.Cart;
import ua.hillel.spring.stock.Product;
import ua.hillel.spring.stock.ProductRepository;
import ua.hillel.spring.stock.ProductStock;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        ProductRepository repository = context.getBean("prRepo", ProductRepository.class);
        Cart productCart = context.getBean("cart", Cart.class);
        System.out.println(repository.getProductList());
        System.out.println(productCart.getCartProduct(repository.getProductList(),3));
        System.out.println(productCart.getCartProduct(repository.getProductList(),1));
        productCart.deleteCartProduct(repository.getProductList(),1);





        context.close();
    }
}