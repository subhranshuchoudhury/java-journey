// parameters

class Parameters {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        measureRect(23.5,12.4); // arguments
        measureRect(1.2,7.8);
        
    }
    
    public static void measureRect(double length,double width){// parameters
        double area = length * width;
        System.out.println("Area of Rectangle("+length+","+width+"): " + area + " unit sq.\n");
        
    }
}

// values that passes to function for further use.
// argument should be in the order as the parameters.
