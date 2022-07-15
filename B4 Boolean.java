// Boolean (true or false).

class Bool{
    public static void main(String[] args){
        boolean b1=true , b2=false;
        System.out.println(b2 ? "Its Correct!" : "Wrong!"); // wrong!
        
        boolean compare = 5>1;
        System.out.println("\n" + compare); // true
        
        int mathMark = 23;
        int englishMark = 45;
        System.out.println("\n" + (mathMark > englishMark)); // false
        
        String name = "Subhranshu";
        String name2 = "subhranshu";
        String name3 = "Subhranshu";
        System.out.println(name.equals(name2)); // false
        System.out.println(name.equals(name3)); // true
        System.out.println(!name.equals(name3)); // false , !equals
        
        
    }
}

// confusion [= , == , !=]

// > greater than
// < less than
// >= g than equal to
// <= l than equal to
// == equal to
// != not equal to
// equals equal to (for String)
// !equals not equal to (for String)
