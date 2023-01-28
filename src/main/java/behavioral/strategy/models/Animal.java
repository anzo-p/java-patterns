package behavioral.strategy.models;

import behavioral.strategy.strategies.FlyStrategy;

public class Animal {
    private String name;
    private double height;
    private int weight;
    private String favFood;
    private double speed;
    private String sound;

    // compose in a trait that implements a behavior
    // subclasses will choose or add to one of its implementations
    public FlyStrategy flyingType;

    public void setName(String newName){ name = newName; }

    public void setHeight(double newHeight){ height = newHeight; }

    public void setWeight(int newWeight){
        if (newWeight > 0){
            weight = newWeight;
        } else {
            System.out.println("Weight must be bigger than 0");
        }
    }

    public void setFavFood(String newFavFood){ favFood = newFavFood; }

    public void setSpeed(double newSpeed){ speed = newSpeed; }

    public void setSound(String newSound){ sound = newSound; }

    public String getName(){ return name; }

    public double getHeight(){ return height; }


    public double getWeight(){ return weight; }

    public String getFavFood(){ return favFood; }

    public double getSpeed(){ return speed; }

    public String getSound(){ return sound; }

    public void setFlyingType(FlyStrategy fly) { flyingType = fly; }

    public String tryToFly() { return flyingType.fly(); }
}
