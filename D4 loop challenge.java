// challenge (5.5)


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("1. Enter number to count by: ");
		int countby = scan.nextInt();
		System.out.println("2. Enter number from where to start: ");
		int countfrom = scan.nextInt();
		System.out.println("3. Enter number to count to: ");
		int countto = scan.nextInt();
		scan.close();
		System.out.print("-> ");
		
		for(int i = countfrom ;i<=countto;i+=countby){
		    System.out.print(i + " ");
		}
	}
}
