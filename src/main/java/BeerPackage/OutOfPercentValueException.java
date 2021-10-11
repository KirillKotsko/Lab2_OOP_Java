package BeerPackage;

public class OutOfPercentValueException extends Exception {
    public OutOfPercentValueException(String message) {
        super(message);
    }

    public OutOfPercentValueException() {
        super("Value is out of range(0,100)!");
    }
}
