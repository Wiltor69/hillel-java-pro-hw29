package ua.hillel.spring.stock;


import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@ToString

public class Cart implements ProductStock{
private List<Product> productList = new ArrayList<>();
     @Override
    public List<Product> getCartProduct(List<Product> productList, int id) {
         List<Product> products = productList.stream().filter(s->s.getId()==id).collect(Collectors.toList());
        return products;
    }

    @Override
    public void deleteCartProduct(List<Product> productList, int id) {

        List<Product> products = productList.stream().filter(s->s.getId()==id)
                                .collect(Collectors.toList());

products.remove(id);
    }
}
