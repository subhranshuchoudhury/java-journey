// FizzBuzz challenge (5.7)


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    System.out.println("FizzBuzz: \n\n");
	    
	    for (int i=0;i<19;i++){
	        if(i%3==0 && i%5==0){
	            System.out.println(i + " -- " + "FizzBuzz");
	        }else if(i%3==0){
	            System.out.println(i + " -- " + "Fizz");
	        }else if(i%5==0){
	            System.out.println(i + " -- " + "Buzz");
	        }
	    } 
	}
}
