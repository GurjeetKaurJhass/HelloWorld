import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
      System.out.println("my project example");
      System.out.println("Whats your name");
      Scanner sc=new Scanner(System.in);
      //Create a variable to store user input
     String personName= sc.nextLine();
     //output 
     System.out.println("Hello" + personName);
     System.out.println("How old are you");
     Scanner age=new Scanner(System.in);
     int personAge=sc.nextInt();
     System.out.println("Your age"+personAge);
    
    
     
      
	}

}
