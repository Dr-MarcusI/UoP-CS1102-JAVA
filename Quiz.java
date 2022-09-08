import javax.swing.JOptionPane;
public class Quiz {

	public static void main(String[] args) {
	String question = "What is a quiz?\n";
	question += "A. a test of knowledge, especially a brief, informaltest given to students\n";
	question += "B. not performing any functions\n";
	question += "C. bad test of knowlege\n";
	question += "D. i dont know the answer\n";
	question += "E. any of the above or i dont know\n";
	while (true) { 
		String answer = JOptionPane.showInputDialog(question); 
		answer = answer.toUpperCase();
		if (answer.equals("A")) {
			JOptionPane.showMessageDialog(null,"Correct!");
			break;
		} else if (answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) 
		{JOptionPane.showMessageDialog(null,"Incorrect. Please try again.");
		}else {JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");}
	}
	

	}

}
