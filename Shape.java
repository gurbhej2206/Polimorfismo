public abstract class Shape implements Comparable<Shape> {

    public abstract double area();

    @Override
    public String toString() {
        return getClass().getSimpleName()+": "+area()+"m^2";
    }

    @Override
    public int compareTo(Shape other) {
        return Double.compare(this.area(), other.area());
    }
}