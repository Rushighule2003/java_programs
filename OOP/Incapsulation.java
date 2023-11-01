// Incapsulation :  means binding data and menthods into single unit
//               :  we can encapsulate class in java by making all data
//                  members private.
//               :  Encapsulation is a way of hiding the implementation 
//                  details of a class from outside access and only 
//                  exposing a public interface that can be used to 
//                  interact with the class
//               :  there are getter and setter methods to initialize 
//                  and access the data out side of class

class Person{
    private String password;
    private int id;

    public void setId(int id){
        this.id =id;
    }


    public int getid(){
        return id;
    }

    public void setPassword(String pass){
        this.password = pass;
    }

    public String getPass(){
        return password;
    }

    

}

public class Incapsulation {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setPassword("12345");
        p1.setId(12);
        System.out.println(p1.getPass());
        System.out.println(p1.getid());
    }
}
