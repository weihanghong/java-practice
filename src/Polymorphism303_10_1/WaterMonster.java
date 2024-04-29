package Polymorphism303_10_1;

public class WaterMonster extends Monster{
    public WaterMonster(String name) {
        super(name);
    }

    public String attack() {
        return "Attacked with water!";
    }
}
