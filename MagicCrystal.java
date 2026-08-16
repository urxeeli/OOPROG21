public class MagicCrystal {
    
    // returns the magic power value from the crystal
    static int getPower() {
        return 100;
    }
    
    // returns the treasure value found in the crystal
    static int getTreasure() {
        System.out.println("Treasure Found: 500 gold");
        return 500;
    }
    
    // returns a congratulations message to the tarnish
    static String getMessage() {
        return "Congratulations, Tarnish!";
    }
    
    // returns the tarnish's health value
    static int getHealth() {
        return 85;
    }
    
    public static void main(String[] args) {
        System.out.println("=========================");
        System.out.println("      MAGIC CRYSTAL");
        System.out.println("=========================");
        System.out.println();
        
        System.out.println("The crystal has been activated!");
        System.out.println();
        
        int power = getPower();
        System.out.println("Magic Power: " + power);
        
        getTreasure();
        
        System.out.println();
        String message = getMessage();
        System.out.println(message);
        System.out.println();
        
        System.out.println("Trust the golden light to lead your way through the fog.");
    }
}
