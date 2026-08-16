public class HeroIntroduction {

    // Displays a hero introduction using the provided name.
    static void introduceHero(String name) {
        System.out.println("Hero Name: " + name);
        System.out.println("Welcome, brave Tarnish!");
        System.out.println("Follow the guidance of lost grace");
        System.out.println();
    }

    // Displays the hero's weapon.
    static void showWeapon(String weapon) {
        System.out.println("Weapon: " + weapon);
        System.out.println("Your weapon is Sheathe!");
        System.out.println();
    }

    // Displays the hero's level.
    static void showLevel(int level) {
        System.out.println("Level: " + level);
        System.out.println();
    }

    // Displays a special hero power.
    static void showPower(String power) {
        System.out.println("Power: " + power);
        System.out.println("Slash attack; unleash the power of the moon!");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("=========================");
        System.out.println("       THE TARNISHED");
        System.out.println("=========================");
        System.out.println();

        introduceHero("Vergil");
        // introduceHero("Alex");
        // introduceHero("Maria");
        // introduceHero("Dragon Slayer");  

        showWeapon("Moonveil");
        showLevel(22);
        showPower("Transient Moonlight");
    }
}
