package test2;

public class Car {
    private String color ;
    private int speed ;

    public Car() {
    }

    public Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return this.color + this.speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
