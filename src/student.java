/*This class generates students and their answers and sends 
 the statistics to iClickerService class.
 */
import java.util.Hashtable;
import java.util.Random;
public class student {

	private int numStudent;
	private int answers;
	private int type;
	private iClickerService info;
	Hashtable< Integer, Character> students;
	public student(int numStudent,int type,int answers){
		students = new Hashtable<Integer, Character>(); 
		this.numStudent=numStudent;
		this.answers= answers;
		this.type=type;
		if(1==type)
			creatClassMC();
		else
			creatClassSA();
	}
	//Creates a class of multiple choice questions
	private void creatClassMC(){
		Random id = new Random();
		//Creates students and makes them pick random answer
		for(int i = 1; i <=numStudent; i++){
			students.put(id.nextInt(numStudent+1),randomCharacter(answers));
		}
		//Sends data to the IClickerService and prints it out.
		info = new iClickerService(students);
	}
	//Creates a question of type True or False
	private void creatClassSA(){
		Random id = new Random();		
		//Makes students id(duplicates as well) and get random answers
		for(int i = 1; i <=numStudent; i++){
			students.put(id.nextInt(numStudent+1),randomCharacter(2));
		}
		info = new iClickerService(students);

	}
	//Creates random and answers (characters)
	private static char randomCharacter(int answers) {
		Random r = new Random();
		char random_Char = (char) (65 + r.nextInt(answers));
		return random_Char;
	}
	//calls for the statistic
	public void getData(int graph){
		info.getStats(graph);
	}
}
