package ua.hillel.spring.stock;


import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@ToString

public class ProductRepository {

    private List<Product> productList;

    Product pr1= new Product(1, "TV", 245.67);
    Product pr2= new Product(2, "Video", 147.85);
    Product pr3= new Product(3, "Computer", 1378.36);
    Product pr4= new Product(4, "Phone", 68.17);
    Product pr5= new Product(5, "Smart-TV", 678.94);

    public List<Product> getProductList() {
        productList=List.of(pr1,pr2,pr3,pr4,pr5);
        return productList;
    }
}
