// Abstract class and abstract function

abstract class Animals{
    abstract void sounds();

    public void sleeps(){
        System.out.println("zzz Zzz");
    }
}

class Pig extends Animals{
    void sounds(){
        System.out.println("it sounds like:  wee wee");
    }
}

public class Abstraction {
    public static void main(String[] args) {
            Pig pigee = new Pig();
    pigee.sounds();
    pigee.sleeps();
    }

}
