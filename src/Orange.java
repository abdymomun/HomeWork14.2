public class Orange extends Fruits{
    private String color;
    Apple apple;

    public Orange(String color, String color1, Apple apple) {
        super(color);
        this.color = color1;
        this.apple = apple;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "color='" + color + '\'' +
                ", apple=" + apple +
                '}';
    }
}
