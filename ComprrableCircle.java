import Circle.Circle;

public class ComprrableCircle extends Circle implements Comparable<ComprrableCircle> {
    public  ComprrableCircle(){
    }

    public ComprrableCircle(double radius){
        super(radius);
    }

    public ComprrableCircle(double radius, String color,boolean filled){
        super(radius,color,filled);
    }


    @Override
    public int compareTo(ComprrableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}