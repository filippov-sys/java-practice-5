import java.util.*;

public class Arena {
    private List<Character> inArenaMembers = new ArrayList<>();
    private static int totalBattles;

    public void addParticipant(Character participant) {
        inArenaMembers.add(participant);
    }

    public static int getTotalBattles() {
        return totalBattles;
    }

    public void startBattle() {
        int aliveMember = 0;
        for (Character character : inArenaMembers) {
            if (character.isAlive()) {
                aliveMember += 1;
            }
        }
        if (aliveMember < 2) {
            System.out.println("участников меньше 2");
            return;
        }
        while (aliveMember >= 2) {
            for (int i = 0; i < inArenaMembers.size(); i++) {
                Character attacker = inArenaMembers.get(i);
                if (!attacker.isAlive()) {
                    continue;
                }
                for (Character target : inArenaMembers) {
                    if (attacker != target && target.isAlive()) {
                        attacker.attack(target);
                        if (!target.isAlive()) {
                            System.out.println(target.getName() + " мертв!");
                        }
                        break;
                    }
                }
            }
            aliveMember = 0;
            for (Character character : inArenaMembers) {
                if (character.isAlive()) {
                    aliveMember += 1;
                }
            }
        }
        totalBattles += 1;
    }

    public void showSurvivors() {
        System.out.println("выжившие: ");
        for (Character character : inArenaMembers) {
            if (character.isAlive()) {
                System.out.println(character.getName());
            }
        }
    }
}
