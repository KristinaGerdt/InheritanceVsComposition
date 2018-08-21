package tr.composition;

public class Boy {

    private Person person;

    public Boy(int height) {
        this.person = new Person(new Height("cm", height));
    }

    public int getHeight() {
        Height height = person.getHeight();
        return height.getHeight();
    }

}
