public class BattleCalculator {
    
    // Calculates the damage dealt to the monster based on hero attack and monster defense.
    static int calculateDamage(int attack, int defense) {
        int damage = attack - defense;
        return damage;
    }
    
    // Calculates the reward gold based on hero level and base reward amount.
    static int calculateReward(int level, int baseReward) {
        int reward = level * baseReward;
        return reward;
    }
    
    // Calculates the remaining health after taking damage.
    static int calculateRemainingHealth(int health, int damage) {
        int remainingHealth = health - damage;
        return remainingHealth;
    }
    
    // Calculates the critical hit damage multiplier based on luck stat.
    static double calculateCriticalHit(int luck) {
        double criticalMultiplier = 1.0 + (luck * 0.05);
        return criticalMultiplier;
    }
    
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("       THE TARNISHED FACES");
        System.out.println("         BATTLE BEGINS");
        System.out.println("=================================");
        System.out.println();
        
        int heroAttack = 80;
        int monsterDefense = 30;
        int damage = calculateDamage(heroAttack, monsterDefense);
        
        System.out.println("Tarnished's Might: " + heroAttack);
        System.out.println("Tree sentinel's Guard: " + monsterDefense);
        System.out.println();
        System.out.println("Damage inflicted: " + damage + " pts");
        System.out.println();
        
        int heroHealth = 100;
        int remainingHealth = calculateRemainingHealth(heroHealth, damage);
        
        System.out.println("Tarnished HP: " + heroHealth);
        System.out.println("HP after blow: " + remainingHealth);
        System.out.println();
        
        int heroLevel = 22;
        int baseReward = 100;
        int reward = calculateReward(heroLevel, baseReward);
        
        System.out.println("Tarnished Level: " + heroLevel);
        System.out.println("Blessing Value: " + baseReward);
        System.out.println("Runes Gained: " + reward + " runes");
        System.out.println();
        
        int heroLuck = 3;
        double criticalMultiplier = calculateCriticalHit(heroLuck);
        
        System.out.println("Arcane Fortune: " + heroLuck);
        System.out.println("Critical Multiplier: " + String.format("%.2f", criticalMultiplier) + "x");
        System.out.println();
        
        System.out.println("THE GREAT ENEMY IS VANQUISHED");
    }
}