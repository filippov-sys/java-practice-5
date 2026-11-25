import java.util.*;

public class Mage extends Character {
    private double mana;

    public Mage(String name, double health, double mana) {
        super(name, health);
        this.mana = mana;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public void attack(Character target) {
        String targetType;
        Random random = new Random();
        double damage = random.nextDouble(10, 26);
        if (getMana() <= 10) {
            System.out.println("маг " + getName() + " не может атаковать: мало маны");
        } else {
            if (target instanceof Warrior) {
                targetType = "воина";
            } else {
                targetType = "мага";
            }
            double newHealth = target.getHealth();
            newHealth -= damage;
            setMana(mana -= 10);
            target.setHealth(newHealth);

            System.out.println(
                    "маг " + getName() + " атакует " + targetType + " " + target.getName() + "! " + "Урон: " + damage);
        }
    }
}
