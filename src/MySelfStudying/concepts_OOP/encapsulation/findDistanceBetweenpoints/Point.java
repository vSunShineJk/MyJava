package MySelfStudying.concepts_OOP.encapsulation.findDistanceBetweenpoints;

public class Point {
    int y;
    int x;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int findDistance(Point other) {
        int dx = this.x - other.x;
        int dy = this.y - other.y;

        double s = Math.sqrt(dy*dy + dx*dx);

        return (int) s;
    }
}
