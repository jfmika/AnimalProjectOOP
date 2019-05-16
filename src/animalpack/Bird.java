package animalpack;

public class Bird extends Animal {
    private int power;
    private String mood;

    public Bird(String inColour, int inSpeed
            , String inMood, int inPower) {
        super(inColour, inSpeed);
        // bird speed can not exceed 100
        if (super.getSpeed() > 100) {
            super.setSpeed(100);
        }
        power = inPower;
        mood = inMood;
    }

    @Override
    public void setSpeed(int inSpeed) {
        if (inSpeed > 100) {
            speed = 100;
        } else {
            speed = inSpeed;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " " + getMood() + "," + getPower();
    }

    public String getMood() {
        return mood;
    }

    public int getPower() {
        return power;
    }
}
