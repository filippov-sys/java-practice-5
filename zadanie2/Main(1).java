public class Main {
    public static void main(String[] args) {
        Character warrior1 = new Warrior("алексей", 67);
        Character warrior2 = new Warrior("глеб", 120);
        Character mage1 = new Mage("артем птичкин", 100, 30);
        Character mage2 = new Mage("максим грибочкин", 90, 50);
        Arena arena = new Arena();
        arena.addParticipant(warrior1);
        arena.addParticipant(warrior2);
        arena.addParticipant(mage1);
        arena.addParticipant(mage2);
        arena.startBattle();
        arena.showSurvivors();
        System.out.println(" всего боев: " + Arena.getTotalBattles());
    }
}
