import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList();
        circles.add(new Circle(3.6));
        circles.add(new Circle(2.5));
        circles.add(new Circle(3.0));


        int a = circles.get(1).compareTo(circles.get(2));
        System.out.println(a);
    }
}