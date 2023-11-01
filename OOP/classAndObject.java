class Pen{
    String color;
    String Type;

    public void print(){
        System.out.println("i am writing");
    }

    // use of this key

    public void printColor(){
        System.out.println(color);
    }

}

public class classAndObject{
    public static void main(String[] args) {
        //object
        Pen pen1 = new Pen();
        pen1.color ="black";
        pen1.Type ="ball";
        pen1.print();
        pen1.printColor();

        Pen pen2 = new Pen();
        pen2.color ="blue";
        pen2.Type ="ball";
        pen2.print();
        pen2.printColor();

        
    }
}