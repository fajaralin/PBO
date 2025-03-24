public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    public String displayString;

    public ClockDisplay() {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    public ClockDisplay(int hour, int minute) {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }

    public void timeTick() {
        minutes.increment();
        if (minutes.getValue() == 0) {
            hours.increment();
        }
        updateDisplay();
    }

    public void setTime(int hour, int minute) {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    private void updateDisplay() {
        displayString = hours.getDisplayValue() + " : " + minutes.getDisplayValue();
    }

    public static void main(String[] args) {
        ClockDisplay clock = new ClockDisplay(23, 59);
        System.out.println("Initial Time: " + clock.displayString);
        
        clock.timeTick();
        System.out.println("After timeTick: " + clock.displayString);
        
        clock.timeTick();
        System.out.println("After another timeTick: " + clock.displayString);
    }
}
