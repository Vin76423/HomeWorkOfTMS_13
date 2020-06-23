package dao;

import entity.Product;
import exception.DuplicateProductException;
import exception.NotProductException;

import java.util.ArrayList;
import java.util.List;

public class MemoryProductDao implements ProductDao {
    private List<Product> products = new  ArrayList<>();
    private static MemoryProductDao instance;

    private MemoryProductDao() {
        products.add(new Product(5, "Кольцо с брилиантом", 3400));
        products.add(new Product(2,"Шкаф", 230));
    }

    public static MemoryProductDao getInstance() {
        if (instance == null) {
            instance = new MemoryProductDao();
        }
        return instance;
    }

    @Override
    public void add(Product product) throws DuplicateProductException {
        if (products.contains(product)) {
            throw new DuplicateProductException(product.getId());
        }
        products.add(product);
    }

    @Override
    public List<Product> getList() {
        return new ArrayList<>(products);
    }

    @Override
    public void remove(Product product) {
        products.remove(product);
    }

    @Override
    public void update(Product product) {
        int index = products.indexOf(product);
        if (index != -1) {
            products.set(index, product);
        }
    }

    @Override
    public Product getProduct(String str) throws NotProductException {
        for (Product product : products) {
            if (product.getName().equals(str)) return product;
        }

        throw new NotProductException(str);
    }
}
