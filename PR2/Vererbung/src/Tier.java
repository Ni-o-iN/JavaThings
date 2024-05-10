public class Tier {

    String name;
    int alter;

    public void name() {
        System.out.println("Der Name von dem Tier ist " + name);
    }

    public void alter() {
        System.out.println("Das Tier ist " + alter + " Jahre alt.");
    }

    public static void main(String[] args) {

        Hund Dackel = new Hund("Bello", 5);
        Dackel.name();
        Dackel.alter();
        Dackel.gibLaut();

        Katze Kater = new Katze("Kitty", 1);
        Kater.name();
        Kater.alter();
        Kater.gibLaut();
    }
}
