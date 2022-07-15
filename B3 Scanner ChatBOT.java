// Chat BOT
import java.util.*;


class ChatBot{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name;
        int age;
        String place;
        String Planguage;
        
        System.out.println("Hello, What is your name?");
        name = scan.nextLine();
        System.out.println("Hello " + name +" ,I am Rob, where are you from ?");
        place = scan.nextLine();
        System.out.println("Nice i will add " + place + " into my bucket list to visit.\nHow old are you?");
        age = scan.nextInt();
        scan.nextLine(); // resolve error
        System.out.println("You are only "+age+ ". My age is "+(400/age)+" times of yours age. Ridiculous!! :D\nWhich Language you prefer for coding??");
        Planguage = scan.nextLine();
        scan.close();
        System.out.println( ""+Planguage + "! that's great..!! i know " +Planguage+ " pretty well.. i guess :)\nReally nice to chat with you... Thanks a lot.");
        
    }
}
