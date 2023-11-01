// compiletime polymorphism
// function overloading

class Amey{
    void print(int marks){
        System.out.println(marks);
    }

    void print(String name){
        System.out.println(name);
    }
    void print(int marks,String name){
        System.out.println(marks+name);
    }
    void print(String name,int marks){
        System.out.println(marks+name);
    }
}


public class polymorphism {
    public static void main(String[] args) {
        Amey am1 = new Amey();
    am1.print("nihak",11);
    }
     
}
