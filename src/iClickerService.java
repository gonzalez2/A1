//This class gets students answers and print out the result.
import java.util.*;
public class iClickerService {

	private Hashtable< Integer, Character> stats;
	private ArrayList<Character> list;
	public iClickerService(Hashtable< Integer, Character> stats){
		this.stats = new Hashtable< Integer, Character>();
		this.stats.putAll(stats);
		list = new ArrayList<Character>();
		//Gets the values of the keys and stores them in an arraylist
		for(Integer itm : stats.keySet()){
			list.add(stats.get(itm)); 
		}

	}
	public void getStats(int graph)
	{
		Set<Character> result = new HashSet<Character>(list);
		if(graph !=1)
		{
			//Print out students answer 
			for (Character temp : result) 
			{
				System.out.println(temp + ": " + Collections.frequency(list, temp));
			}
		}
		else
		{
			System.out.println("Each '*' equals 1 student \n______________________");
			//Print out the students answers in graph form
			for (Character temp : result) 
			{
				System.out.print(temp + ": " );
				for(int i = 0; i < Collections.frequency(list, temp);i++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}

