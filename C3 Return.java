// return values

class ReturnType {
    public static void main(String[] args) {
        
        System.out.println("Area Returned: " + measureRect(1,2));
        
    }
    
    public static double measureRect(double length,double width){// parameters
        double area = length * width;
        return area; // return the value to where it is called.
        
    }
}

