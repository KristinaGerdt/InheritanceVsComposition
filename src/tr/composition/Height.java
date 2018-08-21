package tr.composition;

public class Height {

    private String unitOfMeasure;
    private int height;

    public Height(String unitOfMeasure, int height) {
        this.unitOfMeasure = unitOfMeasure;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

}
