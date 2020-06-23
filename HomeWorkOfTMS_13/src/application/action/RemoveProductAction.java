package application.action;

import application.utils.Input;

public class RemoveProductAction extends BaseAction implements Action {

    @Override
    public String getName() {
        return "Удалить товар";
    }

    @Override
    public void action() {
        int id = Input.getInt("Введите ID товара");
        productController.remove(id);
    }
}
