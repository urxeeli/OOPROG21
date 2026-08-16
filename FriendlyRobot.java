public class FriendlyRobot {
    // display the robot's introduction message
    static void sayHello() {
        System.out.println("Hello, Tarnished!");
        System.out.println("I am your friendly Java robot!");
    }

    // display the robot's current status
    static void showStatus() {
        System.out.println("STATUS: ONLINE");
        System.out.println("BATTERY: 67%");
        System.out.println("MOOD: HAPPY");
    }

    // display the robot dancing
    static void dance() {
        System.out.println("Robot is dancing!");
        System.out.println("Beep! Boop! Beep!");
    }

    // display the robot charging
    static void recharge() {
        System.out.println("Java Robot is charging ^_^");
    }

    public static void main(String[] args) {
        System.out.println("=========================");
        System.out.println("      FRIENDLY ROBOT");
        System.out.println("=========================");
        System.out.println();

        sayHello();
        System.out.println();
        showStatus();
        System.out.println();
        dance();
        System.out.println();
        recharge();
    }
}
