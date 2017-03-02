package packGroupe1;

import java.util.ArrayList;
import java.util.List;

public class Question {
	private String author, theme, answer;
	private List<String> clues;
	
	public Question(String author, String theme, String answer) {
		this.author = author;
		this.theme = theme;
		this.answer = answer;
		clues = new ArrayList<String>();
	}
	
	public void addClue(String clue) {
		if(clues.size()<=3) {
			clues.add(clue);
		}
	}
	
	public boolean isAnswer(String answer) {
		return this.answer.equals(answer);
	}
	
	public String getClue(int index) {
		return clues.get(index);
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Question) {
			Question question = (Question) obj;
			return (this.theme.equals(question.theme) && this.answer.equals(question.answer));
		}
		return false;
	}
}
