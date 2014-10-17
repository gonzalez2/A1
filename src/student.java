import java.util.Random;
import java.util.ArrayList;
public class student {

	private ArrayList<Integer> list;
	public student(int num)
	{
		Random id = new Random();
        list = new ArrayList<Integer>();

		/*for (int i=0; i<=num;i++)
		{
			list.add(id.nextInt(num)+1);  
		}*/
		for(int j: list)
		{
			System.out.print((j)+ " , ");
		}
		student.removeDuplicates(list);
		System.out.println();
		/*for(int j: list)
		{
			System.out.print((j)+ " , ");
		}*/
	}
	private static void removeDuplicates(ArrayList<Integer> list) {

		int size = list.size();
		for (int i = 0; i < size - 1; i++) 
		{
			// start from the next item after strings[i]
			// since the ones before are checked
			for (int j = i + 1; j < size; j++) 
			{
				if (!list.get(j).equals(list.get(i)))
					continue;
				list.remove(j);
				// decrease j because the array got re-indexed
				j--;
				// decrease the size of the array
				size--;
			} // for j
		} // for i
	}
	public ArrayList<Integer> getList(){
		return list;
	}
}
