// Scope

class LearnScope {
    static int banana = 5;// can be access anywhere in the LearnScope class
    public static void main(String[] args){
        int apple = 3; // only access inside main class
        System.out.println(banana); // no error
        System.out.println(apple);// no error
        System.out.println(mango);// error
        
    }
    
    public static void accesTest(){
        int mango = 4;
        System.out.println(apple);// error
        System.out.println(banana); // no error
        System.out.println(mango);// no error
    }
}
