package specificActios;

public interface Shoutable {
    void shout(String name);

    static void shout(String... name) {

    }
}
