//Cesar Gonzalez
import java.util.Scanner;
public class iClicker {

	public static void main(String[] args) 
	{
	  Scanner input = new Scanner(System.in);
	  
	  System.out.println("Type of question pick(1-2):\n 1:Multiple Choice\n 2:Single Answer ");
	  int choice = input.nextInt();
	  student st = new student(35,choice);
	  questions q = new questions(st.getList(),choice);
	  System.out.println("Waiting on student answers...");
	  if(choice == 1)
	      System.out.println(q.statistic());
	  else
		  System.out.println(q.statisticS());
		  
	}

}
