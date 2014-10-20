
public class iClickerService {

	private int[] statistic;
	
	protected iClickerService(){
		statistic = new int[4];
		statistic[0]=0;
		statistic[1]=0;
		statistic[2]=0;
		statistic[3]=0;		
	}
	protected iClickerService(int size){
		statistic = new int[size];
		statistic[0]=0;
		statistic[1]=0;
				
	}
	
	public void setAnswers(int one, int two, int three, int four){
		statistic[0]+=one;
		statistic[1]+=two;
		statistic[2]+=three;
		statistic[3]+=four;	
	}
	public void setAnswers(int one, int two){
		statistic[0]+=one;
		statistic[1]+=two;	
	}
	
	public String toString(){
		
		return "A: " + statistic[0] +"\n" +
			   "B: " + statistic[1] +"\n" +
			   "C: " + statistic[2] +"\n" +
			   "D: " + statistic[3] +"\n";	       
	}
public String toStringS(){
		
		return "A: " + statistic[0] +"\n" +
			   "B: " + statistic[1] +"\n";
			   	       
	}
}
