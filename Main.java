import java.util.Scanner;

public class Main {

	public void myname() {
	
		Scanner name = new Scanner(System.in);
		String myname = "Enter Your Name : ";
		System.out.print(myname);
		System.out.println("Hello Dear " + name.nextLine());		
	
	}
	public void mysurname() {
		
		Scanner surname = new Scanner(System.in);
		String mysurname = "Enter Your LastName : ";
		System.out.print(mysurname);
		System.out.println("Your Surname Is " + surname.nextLine());
	}
	public void mynumber() {
	
		Scanner number = new Scanner(System.in);
		String mynumber = "Choose a Number : ";
		System.out.print(mynumber);
		System.out.println("Choosen Number is " + number.nextLine());
	
	}
	public static void main(String[] args) {
	
		Main end_user_name = new Main();
		end_user_name.myname();
		Main end_user_lname = new Main();
		end_user_lname.mysurname();
		Main end_user_number = new Main();
		end_user_number.mynumber();
	
	}
}
