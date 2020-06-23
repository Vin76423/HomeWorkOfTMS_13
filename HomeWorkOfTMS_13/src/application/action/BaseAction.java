package application.action;

import application.utils.Input;
import controllers.ProductController;
import entity.Product;

import java.util.List;

public abstract class BaseAction implements Action{
    protected ProductController productController = new ProductController();

    protected Product getProduct() {
        int id = Input.getInt("Введите ID");
        String name = Input.getString("Введите название");
        int price = Input.getInt("Введите цену");
        return new Product(id, name, price);
    }

    protected void showList(List<Product> products) {
        System.out.println("========================");
        for (Product product : products)
            System.out.println(product);
        System.out.println("========================");
    }
}
