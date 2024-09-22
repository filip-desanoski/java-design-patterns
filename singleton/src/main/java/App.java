import captain.MakeACaptain;

public class App {
    public static void main(String[] args) {

        MakeACaptain captain1 = MakeACaptain.getCaptain();
        MakeACaptain captain2 = MakeACaptain.getCaptain();

        System.out.println("Captain 1 HashCode: " + captain1.hashCode());
        System.out.println("Captain 2 HashCode: " + captain2.hashCode());

        if (captain1 == captain2) {
            System.out.println("Both captain1 and captain2 are the same instance.");
        } else {
            System.out.println("captain1 and captain2 are different instances.");
        }
    }
}

