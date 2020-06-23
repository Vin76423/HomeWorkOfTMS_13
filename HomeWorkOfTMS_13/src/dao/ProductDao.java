package dao;

import entity.Product;
import exception.DuplicateProductException;
import exception.NotProductException;

import java.util.List;

public interface ProductDao  {
    void add(Product product) throws DuplicateProductException;
    List<Product> getList();
    void remove(Product product);
    void update(Product product);
    Product getProduct(String str) throws NotProductException;
}
