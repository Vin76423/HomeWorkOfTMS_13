package application.action;


import application.utils.Input;

public class ShowSubProductsByPrice extends BaseAction implements Action{

    @Override
    public String getName() {
        return "Вывод выборки продуктов в заданном ценовом диапозоне";
    }

    @Override
    public void action() {
       int lowerLimit = Input.getInt("Введити нижнюю границу диапозона");
       int upperLimit = Input.getInt("Введите верхнюю границу диапозона");
       showList(productController.getSubList(lowerLimit,upperLimit));
    }
}

