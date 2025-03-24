public class NumberDisplay {
    private int limit;
    private int value;

    public NumberDisplay(int rolloverLimit) {
        limit = rolloverLimit;
        value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int replacementValue) {
        if (replacementValue >= 0 && replacementValue < limit) {
            value = replacementValue;
        }
    }

    public String getDisplayValue() {
        if (value < 10) {
            return "0" + value;
        } else {
            return "" + value;
        }
    }

    public void increment() {
        value = (value + 1) % limit;
    }

    public static void main(String[] args) {
        NumberDisplay num = new NumberDisplay(10);

        System.out.println("Initial Value: " + num.getDisplayValue());

        num.setValue(5);
        System.out.println("After setValue(5): " + num.getDisplayValue());

        num.increment();
        System.out.println("After increment(): " + num.getDisplayValue());

        num.increment();
        num.increment();
        num.increment();
        num.increment();
        num.increment(); // Harus kembali ke 0 jika mencapai limit

        System.out.println("After multiple increments: " + num.getDisplayValue());
    }
}
