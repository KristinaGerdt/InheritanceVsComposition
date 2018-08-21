package tr.controller;

public class Main {

    public static void main(String[] args) {
        tr.inheritance.Boy p1 = new tr.inheritance.Boy(145);
        int h1 = p1.getHeight();
        System.out.println(h1);

        tr.composition.Boy p2 = new tr.composition.Boy(145);
        int h2 = p2.getHeight();
        System.out.println(h2);
    }
}
