package ua.hillel.spring.stock;

import java.util.List;

public interface ProductStock {
List<Product> getCartProduct(List<Product> productList, int id);
void deleteCartProduct(List<Product> productList, int id);
}
