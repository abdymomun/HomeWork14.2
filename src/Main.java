public class Main {
    public static void main(String[] args){
Apple apple = new Apple("Vitamin","a");
Banana banana = new Banana("yelow", "yelow",apple);
Orange orange = new Orange("orange","orange",apple);
        System.out.println(banana +"\n"+ orange +"\n"+apple);
    }
}