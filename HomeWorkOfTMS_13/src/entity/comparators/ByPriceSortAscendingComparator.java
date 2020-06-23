package entity.comparators;

import entity.Product;

import java.util.Comparator;

public class ByPriceSortAscendingComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice() - o2.getPrice();
    }

    @Override
    public String toString() {
        return "По цене, по возрастанию";
    }
}
