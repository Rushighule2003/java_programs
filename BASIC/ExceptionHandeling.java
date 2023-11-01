class ExceptionHandeling{
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        try{
        int c = 4/0;
        System.out.println(c);
        }
        catch(Exception e){
            System.out.println("exeption resolved");
        }
        
        System.out.println(4);
    }
}