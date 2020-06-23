package application.config;


import entity.Product;
import entity.comparators.ByNameSortAscendingComparator;
import entity.comparators.ByNameSortDescendingComparator;
import entity.comparators.ByPriceSortAscendingComparator;
import entity.comparators.ByPriceSortDescendingComparator;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ConfigSorts {
    public static Map<Integer, Comparator<Product>> sorts = new HashMap<>();

    static {
        sorts.put(1, new ByNameSortAscendingComparator());
        sorts.put(2, new ByNameSortDescendingComparator());
        sorts.put(3, new ByPriceSortAscendingComparator());
        sorts.put(4, new ByPriceSortDescendingComparator());
    }
}
