// quiz project
// Scanner Practice

import java.util.*;

class quiz{
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        
        System.out.println("Q1. Who is Harry Potter ?\na) Actor\nb)Magician\nc)Normal Boy");
        String q1 = scan.nextLine();
        System.out.println("\nQ2. Who is Subhranshu Choudhury ?\na) Actor\nb)Magician\nc)Developer");
        String q2 = scan.nextLine();
        System.out.println("\nQ3. Who are you ?\na) Actor\nb)Magician\nc)Dreamer");
        String q3 = scan.nextLine();
        
        int mark = 0;
        
        if(q1.equals("b") || q1.equals("B"))
        mark++;
        if(q2.equals("c") || q2.equals("C"))
        mark++;
        if(q3.equals("c") || q3.equals("C"))
        mark++;
        
        System.out.println("\n\n---\n You Got: "+mark+" out of 3.");
        
        
    }
}
