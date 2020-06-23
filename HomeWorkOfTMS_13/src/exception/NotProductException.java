package exception;

public class NotProductException extends Exception {
    String name;

    public NotProductException(String name) {
        this.name = name;
    }

    @Override
    public String getMessage() {
        return "Продукта " + " c названием - " + name + " нет в списке";
    }
}
