package animalpack;

public class Animal {
    private String colour;
    protected int speed;

    public Animal(String inColour, int inSpeed) {
        colour = inColour;
        speed = inSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColour() {
        return colour;
    }

    public String toString() {
        return "[" + getColour()
                + ","
                + getSpeed() + "]";
    }

    public void setSpeed(int inSpeed) {
        speed = inSpeed;
    }
}
