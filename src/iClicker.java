//Cesar Gonzalez
//Cs356 Pj1
import java.util.Scanner;
public class iClicker {

	public static void main(String[] args){
		int howMany;
		student createClass;
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to iClicker\n"+"******************\n");
		//Asks user how many students in the class
		System.out.print("What is the class size? \nSize:");
		int classSize = input.nextInt();
		//Type of question
		System.out.print("\nWhat type of question are you asking? \n(1 or 2)\n1.Multiple Choice\n2.True Or False\nChoice: ");
		int answerType = input.nextInt();
		//Depending on users answer it will be Multiple choice or T or F
		if(answerType != 2)
		{
			System.out.print("\nHow many possible answers are there?\n"+"Ex. 4 = A,B,C,D\nPossible Answers:");
			howMany = input.nextInt();
			createClass = new student(classSize,answerType,howMany);
		}
		else
		{
			createClass = new student(classSize,answerType,0);
		}
		//Does the user want a graph or not
		System.out.println("Do you want your statistics in a graph? (yes = 1, no = 2)");
		int graph = input.nextInt();
		System.out.println("Creating....");
		System.out.println("\nHere are the statistics:");
		createClass.getData(graph);
	}
}

