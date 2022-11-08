// Type: String

class TypeString{
    public static void main(String[] args){
        String line = "I am a boy.";
        String lineTwo = "My name is Subhranshu.";
        System.out.println(line);
        System.out.println(line+lineTwo);
        String concat = line + lineTwo + "Its true.";
        System.out.println(concat);
        
        // update the string
        
        line = "I am a girl.";
        System.out.println(line);
        
    }
}

// be careful not to name the class as "String"
// use whitespace for nice outputs
// Also read String builder ( muttable ) : https://github.com/subhranshuchoudhury/java-journey/blob/main/Questions/Reverse_A_String_String_Builder.java
