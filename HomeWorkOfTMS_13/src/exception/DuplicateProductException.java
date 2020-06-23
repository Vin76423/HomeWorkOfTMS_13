package exception;

public class DuplicateProductException extends Exception{
    private int id;

    public DuplicateProductException(int id) {
        this.id = id;
    }

    @Override
    public String getMessage() {
        return "Товар с id = " + id + " уже существует";
    }
}
