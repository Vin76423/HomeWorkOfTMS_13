package application.config;

import application.action.*;

import java.util.HashMap;
import java.util.Map;

public class ConfigActions {
    public static Map<Integer, Action> actions = new HashMap<>();

    static {
        actions.put(1, new AddProductAction());
        actions.put(2, new ShowProductsAction());
        actions.put(3, new ShowSortedProductsAction());
        actions.put(4, new ShowSubProductsByPrice());
        actions.put(5, new RemoveProductAction());
        actions.put(6, new UpdateProductAction());
        actions.put(7, new GetProductAction());
        actions.put(0, new StopApplicationAction());
    }
}
