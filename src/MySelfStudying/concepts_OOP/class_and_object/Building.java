package MySelfStudying.concepts_OOP.class_and_object;

public class Building {
    public String name;
    public int floors;
    public String style;

    public Building() {}

    public Building(String name, int floors, String style) {
        this.name = name;
        this.floors = floors;
        this.style = style;
    }

    @Override
    public String toString() {
        return "name: " + name + ", floors: " + floors + ", style: " + style;
    }
}
