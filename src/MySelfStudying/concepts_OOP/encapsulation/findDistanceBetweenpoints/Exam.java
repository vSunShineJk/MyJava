package MySelfStudying.concepts_OOP.encapsulation.findDistanceBetweenpoints;

public class Exam {
    public static void main(String[] args) {
        Point pointA = new Point(5, 8);

        Point pointB = new Point(2, 10);

        // A(y) - B(y) -- dy
        // A(x) - B(x) -- dx

        // S = sqrt(dy*dy + dx*dx)

        int s = pointA.findDistance(pointB);
        System.out.println(s);
        s = pointB.findDistance(pointA);
        System.out.println(s);
    }
}
