public class Hund extends Tier{

    String laut = "Wuff";

    Hund(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public void gibLaut() {
        System.out.println(laut);
    }

}