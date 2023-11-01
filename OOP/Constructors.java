// three types of constructors
    // 1) Default Constructors
    // 2) Parameterized Constructors
    // 3) Copy Constructors

    // 1) default constructor

    // class Dog{
    //     String name;
    //     int legs;

    //     Dog(){
    //         System.out.println("constructor is called");
    //     }

    //     void about(){
    //         System.out.println(name + " "+ legs);
    //     }
    // }


// public class Constructors {
    
//     public static void main(String[] args) {
//         Dog dog1 = new Dog();
//         dog1.about();
//     }

    
// }


    // 2) Parameterized Constructor

    // class Dog{
    //     String name ;
    //     int legs;

    //     Dog(String name,int legs){
    //         this.legs =legs;
    //         this.name =name;

    //     }

    //     void about(){
    //         System.out.println(name + " " + legs);
    //     }
    // }

    // class Constructor{
    //     public static void main(String[] args) {
    //         Dog dog1 = new Dog("tommy",4);
    //         dog1.about();


    //         Dog dog2 = new Dog("harry",4);
    //         dog2.about();

    //     }
    // }

        
    // 3) Copy Constructor
    
    // class Dog{
    //     String name;
    //     String color;

    //     Dog (String name ,String color){
    //         this.name=name;
    //         this.color =color;
    //     }
    //     Dog (Dog bog){
    //         this.name=bog.name;
    //         this.color =bog.color;
    //     }

    //     void  about(){
    //         System.out.println(name+ " "+ color);
    //     }


    // }

    // class Constructor{
    //     public static void main(String[] args) {
    //         Dog dog1 = new Dog("kalu", "black");
    //         dog1.about();
    //         Dog dog2 = new Dog(dog1);
    //         dog2.about();
    //     }
    // }
