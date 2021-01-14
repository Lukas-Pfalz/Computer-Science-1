
public class ExamGrader {
	public static char[] correct, ansr;
	public ExamGrader(char[] inputArr, char[] choice) {
		correct = inputArr;
		ansr = choice;
	}
	
	public static int totalCorrect(){
		int num = 0;
		for (int i = 0; i < ansr.length; i++)
			if(ansr[i] == correct[i])
				num++;
		return num;
	}
	
	public static int totalIncorrect() {
		return correct.length - totalCorrect();
	}
	
	public static int questionsMissed() {
		int missed = 0;
		for (int i = 0; i < ansr.length; i++)
			if(ansr[i] == ' ')
				missed++;
		return missed;
	}
}

