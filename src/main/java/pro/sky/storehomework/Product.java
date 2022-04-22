package pro.sky.storehomework;

import java.util.Objects;

public class Product {
    Integer ID;
    String title;

    public Product(Integer ID, String title) {
        this.ID = ID;
        this.title = title;
    }

    public Integer getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return ID == product.ID && Objects.equals(title, product.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, title);
    }
}
