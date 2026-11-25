public class Warrior extends Character {
    public Warrior(String name, double health) {
        super(name, health);
    }

    public void attack(Character target) {
        String targetType;
        double damage = 15;
        if (target instanceof Warrior) {
            damage *= 0.5;
            targetType = "воина";
        } else {
            targetType = "мага";
        }
        double newHealth = target.getHealth();
        newHealth -= damage;
        target.setHealth(newHealth);

        System.out.println(
                "воин " + getName() + " атакует " + targetType + " " + target.getName() + "! " + "Урон: " + damage);
    }
}