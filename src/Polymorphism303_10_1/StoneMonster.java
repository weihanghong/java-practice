package Polymorphism303_10_1;

public class StoneMonster extends Monster {
    public StoneMonster(String name) {
        super(name);
    }

    public String attack() {
        return "Attacked with stone!";
    }
}
