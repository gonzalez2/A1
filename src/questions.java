import java.util.ArrayList;
import java.util.Random;

//needs work
public class questions {
	private ArrayList<Integer> list;
	private static iClickerService answer;
	
	public questions(ArrayList<Integer> list1 , int choice){
		list = new ArrayList<Integer>();
		list.addAll(list1);
		if(choice == 2)
		    answer = new iClickerService(choice);
		else
			answer = new iClickerService();
		if(1 == choice){
			mulitpleChoice(list);	
		}
		else{
			singleAnswer(list);
		}
	}
	private static void mulitpleChoice(ArrayList<Integer> list){
		Random mc = new Random();
		
		for (int i=0; i<list.size();i++)
		 {
			inputM(mc.nextInt(4)+ 1);
		 }
	}

	private static void singleAnswer(ArrayList<Integer> list){
		Random mc = new Random();
		for (int i=0; i<list.size();i++)
		 {
			inputS(mc.nextInt(2)+ 1);
		 }
		
	}
	private static void inputM(int num){
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		switch(num){
		case 1:
			a++;
			break;
		case 2:
			b++;
			break;
		case 3:
			c++;
			break;
		case 4:
			d++;
			break;
		}
		
		  answer.setAnswers(a, b, c, d);
	}
	private static void inputS(int num){
		int t = 0;
		int f = 0;
		switch(num){
		case 1:
			t++;
			break;
		case 2:
			f++;
			break;
		}
		answer.setAnswers(t, f);
	}
	public iClickerService getAnswer() {
		return answer;
	}
	public void setAnswer(iClickerService answer) {
		questions.answer = answer;
	}
	public String statistic(){
		
		return answer.toString();
	}
public String statisticS(){
		
		return answer.toStringS();
	}
	
}
