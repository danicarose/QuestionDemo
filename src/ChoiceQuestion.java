import java.util.ArrayList;

public class ChoiceQuestion extends Question{

	private ArrayList<String> choices = new ArrayList<String>();
	
	public ChoiceQuestion(){
		super(); //how to call the superclass constructor--typically done as first line 
		//can result in error if put later in code 			
		choices = new ArrayList<String>();
	}
	
	public void addChoice(String choice, boolean correct) {
		// TODO Auto-generated method stub
		choices.add(choice);
		if(correct){
			String choiceString = "" + choices.size();
			this.setAnswer(choiceString);		
		}
	}
	
	
	public void display(){
		super.display();
		//System.out.println(text);
		for(int i=0; i<choices.size(); i++){
			int choiceNumber = i + 1;
			System.out.println(choiceNumber + ": " + choices.get(i));
		}
	}
	

}
