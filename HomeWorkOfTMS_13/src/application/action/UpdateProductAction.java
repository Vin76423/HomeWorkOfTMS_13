package application.action;

import entity.Product;

public class UpdateProductAction extends BaseAction implements Action {

    @Override
    public String getName() {
        return "Редактировать обьект";
    }

    @Override
    public void action() {
        Product product = getProduct();
        productController.update(product);
    }
}
