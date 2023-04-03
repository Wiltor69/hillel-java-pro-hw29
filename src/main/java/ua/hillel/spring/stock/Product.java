package ua.hillel.spring.stock;


import lombok.Data;
import lombok.ToString;

import java.util.Objects;

@Data
@ToString

public class Product {

    private int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Double.compare(product.cost, cost) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cost);
    }

    private String name;

    private double cost;

    public Product(int id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }
}
