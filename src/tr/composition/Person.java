package tr.composition;

public class Person {

    private Height height;

    public Person(Height height) {
        this.height = height;
    }

    public Height getHeight() {
        return height;
    }

}
