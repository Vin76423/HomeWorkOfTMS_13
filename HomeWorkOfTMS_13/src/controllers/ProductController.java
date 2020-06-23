package controllers;

import dao.MemoryProductDao;
import dao.ProductDao;
import entity.Product;
import exception.DuplicateProductException;
import exception.NotProductException;

import java.util.*;

public class ProductController {
    private ProductDao productDao = MemoryProductDao.getInstance();

    public void add(Product product) throws DuplicateProductException {
        if (product.getName().startsWith("Ст"))
            product.setPrice(product.getPrice() - 10);

        productDao.add(product);
    }



    public List<Product> getList() {
        return productDao.getList();
    }

    public List<Product> getSortedList(Comparator<Product> comparator) {
        List<Product> products = getList();
        products.sort(comparator);
        return products;
    }

    public List<Product> getSubList(int lowerLimit, int upperLimit) {
        NavigableSet<Product> products = new TreeSet<>(getList());
        return new ArrayList<>(products.subSet(new Product("first", lowerLimit),true,
                new Product ("second", upperLimit), true));
    }



    public void remove(int id) {
        // может содержаться доп логика
        productDao.remove(new Product(id));
    }

    public void update(Product product) {
        // может содержаться доп логика
        productDao.update(product);
    }


    public Product getProduct(String str) throws NotProductException {
        return productDao.getProduct(str);
    }
}
