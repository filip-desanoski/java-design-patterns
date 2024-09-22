package captain;

public class MakeACaptain {

    private static MakeACaptain _captain;

    private MakeACaptain() {
    }

    private static class SingletonHelper {
        private static final MakeACaptain _captain = new MakeACaptain();
    }

    public static MakeACaptain getCaptain() {
        return SingletonHelper._captain;
    }
}
