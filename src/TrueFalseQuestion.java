import java.util.Scanner;


public class TrueFalseQuestion extends ChoiceQuestion{

	public void setQuestion(String questionText, boolean b) {
		// TODO Auto-generated method stub
		super.setText(questionText);
		this.addChoice("True", b);
		this.addChoice("False", !b);
	}
	
	
	
	

	
}
