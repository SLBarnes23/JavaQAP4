public abstract class Shape implements Scalable {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getPerimeter();
    public abstract double getArea();

    @Override
    public String toString() {
        return name + ": Area = " + getArea() + ", Perimeter = " + getPerimeter();
    }
}
