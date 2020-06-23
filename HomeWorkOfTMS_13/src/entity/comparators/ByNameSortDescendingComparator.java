package entity.comparators;

import entity.Product;

import java.util.Comparator;

public class ByNameSortDescendingComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o2.getName().compareTo(o1.getName());
    }

    @Override
    public String toString() {
        return "По названию, по убыванию";
    }
}
