package application.action;

import application.config.ConfigSorts;
import application.utils.Input;
import entity.Product;
import java.util.Comparator;
import java.util.Map;

public class ShowSortedProductsAction extends BaseAction implements Action{

    @Override
    public String getName() {
        return "Вывод всех товаров в отсортированом виде";
    }

    @Override
    public void action() {
        showList(productController.getSortedList(getComparator()));
    }



    private void showSortsCase() {
        for (Map.Entry<Integer, Comparator<Product>> sort : ConfigSorts.sorts.entrySet())
            System.out.println(sort.getKey() + " - " + sort.getValue());
    }

    private Comparator<Product> getComparator() {
        showSortsCase();
        int index = Input.getInt("Выберите вариант сортировки");
        Comparator<Product> comparator = ConfigSorts.sorts.get(index);

        if (comparator != null) return comparator;

        System.out.println("Нет такого варианта. Повторите ввод.");
        return getComparator();
    }
}
