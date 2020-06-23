package application.action;

import application.exceptions.StopApplicationException;
import application.utils.Input;
import exception.NotProductException;

public class GetProductAction extends BaseAction implements Action {

    @Override
    public String getName() {
        return "Получить товар по наименовании";
    }

    @Override
    public void action()  {
        String name = Input.getString("Введите наименование товара");
        try {
            System.out.println(productController.getProduct(name));
        }catch (NotProductException e) {
            System.out.println(e.getMessage());
        }
    }
}
