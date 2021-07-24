import java.util.Scanner;
// we have imported a java package named Scanner.
public class Main

{

	public static void main(String[] args)	{

		Scanner input = new Scanner(System.in);
//.  made a scanner
		int i = 0;
// initialisin i with 0
		System.out.print("Enter a number: ");
// takeing input from the user.
		int tab = input.nextInt();
// storing the input in a varible named tab
	    

		while(i <= 9) {
// starting a while loop.
// running the while until i <=9.
			 i++;
// i++ means adding 1 to i every time the loop runs.      

			System.out.println(i * tab);
// printing the value i x tab.
		}

	}

}
import java.util.Scanner;

// we have imported a java package named Scanner.

public class Main

{

	public static void main(String[] args)

	{

		Scanner input = new Scanner(System.in);

//.  made a scanner

		int i = 0;

// initialisin i with 0

		System.out.print("Enter a number: ");

// takeing input from the user.

		int tab = input.nextInt();

// storing the input in a varible named tab

		while (i <= 9)

		{

// starting a while loop.

// running the while until i <=9.

			i++;

// i++ means adding 1 to i every time the loop runs.      

			System.out.println(i * tab);

// printing the value i x tab.

		}

	}

}
