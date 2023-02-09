public class Banana extends Fruits {
private String color;
Apple apple ;

        public Banana(String color, String color1, Apple apple) {
                super(color);
                this.color = color1;
                this.apple = apple;
        }
        @Override
        public String toString() {
                return "Banana{" +
                        "color='" + color + '\'' +
                        ", apple=" + apple +
                        '}';
        }
}
