import javax.swing.JOptionPane;

public class Quiz {
	static int nQuestions = 0;
	static int nCorrect = 0;
	static String ask(String question) {
		while (true) {
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			boolean valid = (answer.equals("A")|| answer.equals("B") || answer.equals("C") || answer.equals("D")|| answer.equals("E"));
			if (valid) return answer;
			JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");

		}
		
		
	}
	
	static void check (String question, String correctAnswer) {
		nQuestions++;
		String answer = ask(question);
		if (answer.equals(correctAnswer)) {
			JOptionPane.showMessageDialog(null,"Correct!");;
			nCorrect++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is "+correctAnswer+".");
			
		}
	
	}
	
	public static void main(String[] args){
	String question = "What is the national airline of the state of Nigeria?\n";
	question += "A. Ethihad Airways\n";
	question += "B. Fly emirate\n";
	question += "C. Airpeace\n";
	question += "D. Nigeria airways\n";
	question += "E. Arik air\n";
	check(question,"D");
	
	
	 question = "What is the airport name of the state of Nigeria?\n";
	 question += "A. Multala Aiprot\n";
	 question += "B. PH airport\n";
	 question += "C. warri International airport\n";
	 question += "D. Nigeria airways\n";
	 question += "E. Eket airport\n";
	 check(question,"A");
	 
	 

	 question = "What is the Capital name of the state of Nigeria?\n";
	 question += "A. Benin\n";
	 question += "B. Portharcourt\n";
	 question += "C. Abuja";
	 question += "D. imo\n";
	 question += "E. calabar\n";
	 check(question,"C");
	 
	 JOptionPane.showMessageDialog(null, nCorrect+" correct out of "+nQuestions+"question");


	}

}

