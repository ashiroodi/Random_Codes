import java.util.Scanner; /* package name is java.util, and Class name is
Scanner */


public class Java_code {
	
	int x;
	float f = 15;
	String[] cars = {"Volvo","Holden"};
	int g = 45;
	int p;
	int t = 100;
	int model_year;
	String model_name;
	static void myMethod() { /* this makes a procedure function and doesnt return a value */
		System.out.println("Void has been made!!!");
	}
	enum Matthew {
		GOOD,
		BAD,
		NICE

	}
	static void time_date(int x) {
		int y = x + 2;
		System.out.println(y);
	}
	static void fname(String fname, String lname) {
		System.out.println(fname + lname);
	}
	/* to get the CPU and JAVA to return numbered values we use the return keyword */
	static void numbers(int x, int y) {
		System.out.println("First Value :" + x);
		System.out.println("Second Value :" + y);
		int f = x + y;
		System.out.println("Total Value :" + f);
	}
	static void game(int x) {
		System.out.println("Given Value :" + x);
		int y = (int)(Math.random() * 200);
		System.out.println("Choosen \"Random\" Number :" + y);
		System.out.println("Adding Now ...");
		System.out.println("Total = " + x + " + " + y);
		int f = x + y;
		System.out.println("Total Value :" + f);
		while (f < 200) {
			if (f < 200) {
				System.out.println("Reaching 200");
				System.out.println("Current Value :" + f);
				f++;f++;
				
			}else if (f > 200) {
				System.out.println("\'CRITICAL\' Error");
				break;
			}else {
				System.out.println("Error");
			}
		}
	} 
	static void testing(int x) {
		//return x;
		System.out.println(x);
	} 

	static void hello (String x) {
		System.out.println("Hello Dear " + x);
	}

	public void my_2_method() {
		System.out.println("Public Void needs to be called by an \"object\", note that anything with a class and a public void needs to have an obejct");
	}
	public void throttle(int x) {
		System.out.println("throttle Pressure : " + x + "%");
		if (x < 46) {
			System.out.println("Oil Pressure \"Error\"");
		} else if (x == 0) {
			System.out.println("Engine off");
		} else {
			System.out.println("Sensor cannot \"Engage!\"");
		}
	}

	public void speed_test_2(int x) {
		System.out.println("Speed is: " + x);
		if (x > 100) {
			System.out.println("Dispatching Law Authorities");
		} else if (x  ==  100) {
			System.out.println("Speed limit reached");
		} else if (x < 99) {
			System.out.println("Adequte speed");
		} else {
			System.out.println("ABS ERROR, TRACTION ERROR");
		}
	}
	public void new_public(String x) {
		System.out.println("Hello Dear " + x);
	}
	public void name() {
		String x;
		x = "Enter Name : ";
		Scanner user = new Scanner(System.in);
		System.out.print(x);
		System.out.println("Hello Dear " + user.nextLine());
	}
	public void number() {
		String x;
		x = "Enter a Number : ";
		Scanner number = new Scanner(System.in);
		System.out.print(x);
		System.out.println("Number Entered " + number.nextLine());
	}
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("No Error Found");


		/* Lets now add 2 Strings and add them together using
		+ and Concat */

		String First_name = "Matthew";
		String Last_name = "Shiroodi";

		// Print them out

		System.out.println(First_name + ' ' + Last_name);

		// Lets find the lenght now, therefore adding another varible

		String total_ID = (First_name + ' ' + Last_name);

		// Finding lenght now

		System.out.println("Length is :" + total_ID.length());

		// Lets now use concat

		System.out.println(First_name.concat(Last_name));

		/* How to make a qutation when printed on screen. */

		String example = "We are so called the \"Shiroodi\" back in High school";
		System.out.println(example); // Prints with the qutation on the screen

		// Lets make it now with single Qutation

		String example_2 = "We are so called \'Matthew\' Back in High School";
		System.out.println(example_2);

		// Lets now make it to represent the text with backslash instead of qutation mark

		String example_3 = "I used to be called \\Shiroodi\\ Back in high school";
		System.out.println(example_3);

		/* Lets now use Java for mathematics computations */

		int x = 5000;
		int y = 6567;

		// Lets now print values using (ORP) / .max() .min() .avg()
		
		System.out.println(Math.max(x , y)); // Max Value
		System.out.println((int)Math.sqrt(x)); // Square Root Value of x
		System.out.println((int)Math.min(x , y)); // Min Value
		
		/* Lets now make the CPU to choose a random number for us */

		System.out.println((int)(Math.random() * 200)); // Prints random value from 0 to 200 / examples below
		int number = (int)(Math.random() * 50);
		System.out.println(number);
		System.out.println((int)(Math.random() * 5000));

		// Checking Error for parensis

		int result = Math.max(x , y);
		System.out.println(result);

		// Checking .random() function

		double result_1 = (Math.random() * 200); // .random() by default gives decimal numbers checking go to line 72
		System.out.println(result_1); // Checking

		System.out.println("By default \".random()\" printing in double " + (Math.random() * 200));
		System.out.println("To convert the value to an \"(int)\" we need to add (int) before it " + 
		(int)(Math.random() * 400));

		System.out.println((char)(Math.random() * 200));

		/* We can tell the CPU what sort of Data type we are looking for by telling it
		run line : 72 && 73 to see the changes PLUS line : 76 */

		System.out.println((int)(Math.random() * 2)); // its alway excluding after the * 

		// for practise

		int z = x;
		int f = z;
		System.out.println((int)Math.max(z , f));


		/* obtain random values and convert the value acheived 
		to an ACSII charector */

		System.out.println((char)(Math.random() * 10000));
		// this provides values between 0 to 10000

		// lets do it this way

		x = ((int)(Math.random() * 200));
		y = (char) x;

		System.out.println("Charector choosen for \"ACSII\" is :" + y);

		/* now we will use boolean values to see whether a condition
		is true or not by telling the commputer a data type of boolean or
		giving it expression to find out. */

		//For example

		boolean isTrue = true;
		boolean isFalse = false;
		// printing values now

		System.out.println(isTrue);
		System.out.println(isFalse);

		/* lets now see how to use boolean expression to
		see whether an statement is true or false. */

		x = 7;
		y = 8;

		System.out.println(x > y); // this should return false.

		// lets make it true

		System.out.println(x < y); // this should return true
		
		System.out.println( x == y ); /* is the value of x equals to
		the value of y? */

		/* lets now make a conditional statement using if .. else
		statement */

		if ( x > y ) {
			System.out.println("Value of " + x + " is bigger than y" );
			// Checks the condition first and if its true it will jump into the statement
		} else if (x < y) {
			System.out.println("Value of " + x + " is smaller than y");
			// In here the condition was met therefore it went into the statement.
		} else {
			System.out.println("Error calculation ...");
		}
		
		/* we can even write a short hand if .. else statement. */

		int h = 18;

		String result_new = (h > 20) ? "Yes" : "No";
		System.out.println(result_new);

		// Lets do another example of both

		int c = 15;
		int a = 78;

		if (c > a | c == a) {
			System.out.println("First statement is correct");
		} else if (c < a) {
			System.out.println("Second Statement is correct");	
		} else {
			System.out.println("Error");
		}
		/* This is mentioning the first condition that if any
		of those 2 conditions are true go to the statment embedded inside
		and in this case none of the conditions met therefore CPU
		jumped onto else if .. statement and that condition was correct. */


		// short style if else statement

		String result_new_2 = (c == a) ? "Yes" : "No";
		System.out.println(result_new_2);


		// Testing out the value

		if (a > c) {
			System.out.println("Yes_1");
		} else if (a == c) {
			System.out.println("Yes_2");

		} else {
			System.out.println("No");
		}


		/* Writing about switch now and running each code in an a sequance */

		int user_input = 7;

		switch (user_input) {
			case 1:
				System.out.println("User input : \'1\'");
				break;
			case 2:
				System.out.println("User input : \'2\'");
				break;
			case 3:
				System.out.println("User input : \'3\'");
				break;
			case 4:
				System.out.println("User input : \'4\'");
			default: // we have this to display the default value if there wasn't any correct paramenter
				System.out.println("Error");

		}

		/* Lets do a while loop now */

		int i = 5;
		while (i < 10) {
			System.out.println("Current Value is : " + i );
			i++;
		}

		// Lets now make a game

		int random_new = ((int)(Math.random() * 10));
		while (random_new < 10) {
			if (random_new < 10) {
				System.out.println("Value is smaller : " + random_new);
				random_new++;
			} else if (random_new > 10) {
				System.out.println("Bigger than 10 : " + random_new);
			} else {
				System.out.println("Error");
			}
				
			
		}

		/* for loop which still same as python */

		for (int w = 8; w < 20; w++) {
			System.out.println(w);
		}

		// Lets make an array of values
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[1]);

		/* Testing out Knowledge */

		int random_five = ((int)(Math.random() * 15));
		while (random_five < 15) {
			if (random_five <= 15) {
				System.out.println("Chosen Number is :" + random_five + " Smaller than 15");
				System.out.println("Adding now " + random_five++ + "... + 1 = "  + " Current Value is :" + random_five);
			
			} else if (random_five > 15) {
				System.out.println("\"CRITICAL ERROR\" in calculations");
				break;
			
			} else {
				System.out.println("Not responding");
			}
		}


		/* Learning about arrays */

		String[] family_names = {"Negin", "Mum", "Dad", "Amir"};
		System.out.println(family_names[0]); //telling to print index zero to the screen
		System.out.println(family_names[3]);

		int[] int_nums = {10,20,30,40,50};
		System.out.println(int_nums);
		int t = int_nums[0] + int_nums[3]; // addition in index values.
		System.out.println(t);
		
		
		/* We can print out the length of an array */
		System.out.println(int_nums.length); // we dont put () in arrays to see the numbers that are stored.

		int[][] matt = {{10,20,30},{40,50,60}};
		int x_1 = (int)(Math.random() * 2);
		int x_2 = (int)(Math.random() * 3);
		// printing chosen values

		System.out.println("Choosen Value for x_1 is " + x_1 + " And for x_2 is " + x_2);

		System.out.println(matt[x_1][x_2]);

		/* testing */

		for (i = 0; i < 10; i = i + 2) {
			System.out.println("Current value of i is :" + i);
		}

		myMethod();
		time_date(3); // calling the procedure here and inputing parameters
		fname("Matthew ", "Shiroodi");
		numbers(6,7);
		game(50);
		testing(10);
		hello("Matthew");
		

		/*TESTING*/

		Main_2 myObj = new Main_2();
		System.out.println(myObj.x);

		/* When making a new class you then have to make a new object for it as well for it to work and
		to be able to refere it back to the references. */
		
		// Now the class have been made, lets now make an object

		Main_2 my_new_o = new Main_2();
		System.out.println(my_new_o.x);
		System.out.println(my_new_o.f);
		System.out.println(my_new_o.cars[0]);
		/* Always introduce a new object once made a class values
		to make that
		{CLASS_NAME} {OBJECT_NAME} = new {CLASS_NAME()}
		To print out the class values
		System.out.println({OBJECT_NAME}.{VALUE_IN_CLASS}) */

		Main_2 my_2 = new Main_2();
		System.out.println(my_2.cars[1]);
		System.out.println(my_new_o.cars[1]);

		/* testing knowledge */

		Main_2 test_2 = new Main_2();
		System.out.println(test_2.g);

		System.out.println(my_2.g);
		

		/* we can also change the attribute values such as
		g in this case to another value as showen below */

		test_2.g = 50;
		System.out.println(test_2.g);

		my_2.f = 60;
		System.out.println(my_2.f); // changed the value here again
		/* therefore we can say that teh values in a class is not constant */


		/* or we can add values to them by just choosing an
		attribute called "p" and then assign a value to it */

		my_2.p = 45;

		System.out.println(my_2.p);

		/* we can also override the current value by using another object if you want as well
		note that we can use any object for any job. */

		test_2.p = 60 + 1;
		System.out.println(test_2.p);

		/* IMPORTANT IF you dont want to overide the class attribute value
		we have to use "final" before the anouncing an attribute */

		my_2.p = 50;
		System.out.println(my_2.p); // it will output an error

		my_2.t = 200;
		System.out.println(test_2.t); // output 100
		System.out.println(my_2.t); // output 200

		/* You can assign different values of the same attribute
		to different objects */

		my_2.my_2_method();

		// create a new object

		Main_2 first = new Main_2();
		first.my_2_method();


		Main_2 pressure_t = new Main_2(); // trottle method
		Main_2 speed_test =  new Main_2();

		// Using objects to calls the attributes

		pressure_t.throttle(pressure_t.g); // for the value inside im calling the g attribute inside the class
		speed_test.speed_test_2(speed_test.t); // calling the value t inside the class instead of assiging a value
		/* Making an object */

		Main_2 project = new Main_2();
		project.new_public("Matt");

		/* now we are learning about how to import a Java API (meaning
		That it contains packages that can be imported) */

		/* to import a Java package do it before teh public class ... */

		/* to use the import package first make an object for it
		and use the Scanner myobject  =  new Scanner(System.in) */

		Scanner user = new Scanner(System.in);
		System.out.println("Enter your Username : ");

		String end_user = user.nextLine();
		System.out.println("Hello Dear " + user_input);

		Scanner user_1 = new Scanner(System.in);
		
		System.out.println("Enter a value : ");
		int user_number = user_1.nextInt();
		System.out.println("Value entered " + user_number);

		Main_2 max = new Main_2();
		max.name();
		max.number();


		/* lets create an enum */
		
		Matthew test_32 = Matthew.NICE;
		System.out.println(test_32);
	
	}


}

