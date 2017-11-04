import java.util.ArrayList;

public class ChoiceQuestion extends Question{

	private ArrayList<String> choices = new ArrayList<String>();
	
	public void addChoice(String choice, boolean correct) {
		// TODO Auto-generated method stub
		choices.add(choice);
		if(correct){
			String choiceString = "" + choices.size();
			this.setAnswer(choiceString);
					
					
		}
	}
	
	

}
