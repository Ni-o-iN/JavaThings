public class Katze extends Tier{

    String laut = "Meow";

    Katze(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public void gibLaut() {
        System.out.println(laut);
    }

}
