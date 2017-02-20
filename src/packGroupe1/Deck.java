package packGroupe1;

import java.util.ArrayList;
import java.util.List;

public class Deck {

	List<Question> questions;
	
	
	public Deck() {
		questions = new ArrayList<Question>();
	}

	public void addQuestion(Question question) {
		if(!questions.contains(question)) {
			questions.add(question);
		}
	}
	
	public Question getQuestion(int index) {
		return questions.get(index);
	}
	
	public void deleteQuestion(int index) {
		questions.remove(index);
	}
	
	public void changeQuestion(int index, Question question) {
		if(!questions.contains(question)) {
			questions.set(index, question);
		}
	}
}
