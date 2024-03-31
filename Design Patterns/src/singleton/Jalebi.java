package singleton;

/*
 * Eager way has its own limitation. It can impact performance in large objects as it is always creating objects
 * even if it may not be used in future.
 * */
public class Jalebi {

    // Eager way of getting jalebi
    private static Jalebi jalebi = new Jalebi();

    private Jalebi() {

    }

    public static Jalebi getJalebi() {
        return jalebi;
    }
}
