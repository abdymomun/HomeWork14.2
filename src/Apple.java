public class Apple extends Fruits{
    private String vitamin1;
    public Apple (String name ,String vitamin1 ){
        super(name);
        this.vitamin1 = vitamin1;
    }
    @Override
    public String toString() {
        return "Apple{" +
                "vitamin1='" + vitamin1 + '\'' +
                '}';
    }
}
