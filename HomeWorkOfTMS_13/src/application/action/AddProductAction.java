package application.action;

import controllers.ProductController;
import application.utils.Input;
import entity.Product;
import exception.DuplicateProductException;

public class AddProductAction extends BaseAction implements Action {

    @Override
    public String getName() {
        return "Добавить товар";
    }

    @Override
    public void action() {
        Product product = getProduct();

        try {
            productController.add(product);
        }catch (DuplicateProductException e) {
            System.out.println(e.getMessage());
        }
    }
}
