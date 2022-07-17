// DOC Comments

public class DocComments {
    public static void main(String[] args){
        
    }
    
    /** 
     * Function name: func
     * 
     * Inside the function:
     *  1. prints: "Hola!"
    */
    
    public static void func () {
        System.out.println("Hola!");
    }
    
    /**
     * Function name: printAge
     * @param age (int)
     * 
     * Inside the function
     *  1. prints "Your age {age}"
    */
    
    public static void printAge(int age){
        System.out.println("Your age: " + age);
    }
    
    /**
     * Function name: calArea
     * 
     * @param length (double)
     * @param width (double)
     * @return (double)
     * 
     * Inside the function:
     *  1. calculate the area and return it.
    */
    
    public static double calArea(double length,double width){
        double area = length*width;
        return area;
    }
}
