import java.util.*;
import static pr.MakeItSimple.*;

public class UI {
    
    public static class Generic {
    
        static ArrayList<Box> list = new ArrayList<Box>();
        
        /*erste Methode:
        *Integer- und Double-Objekte einlesen und in Number-Boxes speichern und diese Box-Objekte danach
        *im ArrayList-Container ablegen
        *-
        *-
        */
        public static void speichernOhneAusgabe() {
            System.out.println("Geben Sie int oder double Zahlen ein, welche in die Box rein sollen!");
            System.out.println("Zum beenden: stopp");
            boolean stopp = false;
            while (stopp == false) {
                Box<? super Number> erste = new Box<Number>();
                System.out.println("int, double Zahlen oder Stopp?");
                String intDoubleStop = readString();
                if (intDoubleStop.equalsIgnoreCase("int")) {
                    erste.setValue(readInt());
                    list.add(erste);
                } else if (intDoubleStop.equalsIgnoreCase("double")) {
                    erste.setValue(readDouble());
                    list.add(erste);
                } else if (intDoubleStop.equalsIgnoreCase("stopp")) {
                    stopp = true;
                    System.out.println("");
                    method();
                }
            } 
        }
        
        /*zweite Methode
        *Uber den � ArrayList-Container mit einer for-each-Schleife zu iterieren und die Werte der 
        *Number-Boxes auszugeben
        */
        @SuppressWarnings("unchecked")
        public static void einfachesIterieren() {
            for (Box<Number> erste : list)
                System.out.println(erste.getValue());
            
            System.out.println("");
            method();
        }
        
        /*dritte Methode: 
         * Uber den � ArrayList-Container mit Hilfe eines Iterators zu iterieren und dabei die Werte der 
         * Number-Boxes, falls dort Integer-Objekte gespeichert sind zu verdoppeln und Sie die Werte, wenn 
         * dort Double-Objekte abgelegt sind zu verdreifachen
         */
        @SuppressWarnings("unchecked")
        public static void erhoehtesIterieren() {
            for (Box<Number> i : list) {
                if (i.getValue() instanceof Integer) {
                    i.setValue((Integer) i.getValue() * 2);
                } else if (i.getValue() instanceof Double)
                    i.setValue((Double) i.getValue() * 3);
            }
            System.out.println("");
            method();
        }
    
    }
    
        public static void main(String[] args) {
            
            method();
            
        }

        public static void method() {
            System.out.println("Was m�chsten Sie tun?");
            System.out.println("Elemente einf�gen = Ee, Liste ausgeben = La, Zahlen multiplizieren = Zm");
            System.out.println("Programm beenden = Pb");
            String verfahren = readString();
            if (verfahren.equalsIgnoreCase("Ee")) {
                Generic.speichernOhneAusgabe();
            } else if (verfahren.equalsIgnoreCase("La")) {
                Generic.einfachesIterieren();
            } else if (verfahren.equalsIgnoreCase("Zm")) {
                Generic.erhoehtesIterieren();
            } else if (verfahren.equalsIgnoreCase("Pb")) {
                return;
            }
        }
}