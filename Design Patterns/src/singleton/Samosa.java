package singleton;

import java.util.Objects;

/*
 * We want only one object to be created and to be reused everytime
 * Limitation : In case of multithreading, concurrent thread can create multiple instances, which will fail the purpose of singleton
 * design pattern. Hence synchronise the object creation state.
 * */
public class Samosa {

    private static Samosa samosa;

    // Making constructor as private to prevent object creation
    private Samosa() {

        // To handle the case when constructor is being overridden by reflection api
        if (Objects.nonNull(samosa)) {
            throw new RuntimeException("You are trying to break the singleton pattern !!");
        }

    }

    // Lazy way of getting samosa
    public static Samosa getSamosa() {

        // To make it thread safe
        if (Objects.isNull(samosa)) {
            synchronized (Samosa.class) {
                if (Objects.isNull(samosa))
                    samosa = new Samosa();
            }
        }

        return samosa;
    }


}
