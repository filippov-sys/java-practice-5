public abstract class Character {
    private String name;
    private double health;

    public Character(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public abstract void attack(Character target);
}
