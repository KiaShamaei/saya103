package test2;

public class Ford extends Car implements CarMaker {

    public Ford(String color, int speed) {
        super(color, speed);
    }

    @Override
    public int speedRun() {
        return 10;
    }
}
