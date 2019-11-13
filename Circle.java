import java.util.PrimitiveIterator;

public class Circle implements Comparable<Circle>{
    private Double radius;

    public Circle() {
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public int compareTo(Circle c){
        if(this.radius>c.radius)
            return 1;
        else if(this.radius<c.radius)
            return -1;
        else return 0;
    }


}
