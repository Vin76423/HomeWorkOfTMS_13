package application.action;

import entity.Product;

import java.util.List;

public class ShowProductsAction extends BaseAction implements Action {

    @Override
    public String getName() {
        return "Вывод всех товаров";
    }

    @Override
    public void action() {
        showList(productController.getList());
    }
}
