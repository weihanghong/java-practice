package Polymorphism303_10_1;

public class FireMonster extends Monster {
    public FireMonster(String name) {
        super(name);
    }

    public String attack() {
        return "Attacked with fire!";
    }
}
