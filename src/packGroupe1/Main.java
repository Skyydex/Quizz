package packGroupe1;

public class Main {
	
	private int time1=4000, time2=8000;
	
	public static void main(String[] args) {
		
			Question question = new Question("Bob","Femmes célèbres","Victoria");
			question.addClue("J'ai été reine du Royaume-Uni, d'Irlande et du Canada.");
			question.addClue("Je suis née en 1819, décédée en 1901, j'ai a donné mon nom à une époque ");
			question.addClue("J'ai également été impératrice des Indes.");
			
			try {
				for(int i=0; i<3; i++) {
					if(i==0) {
						System.out.println(question.getClue(i));
					}
					else if(i==1) {
						Thread.sleep(4000);
						System.out.println(question.getClue(i));
					}
					else  {
						Thread.sleep(8000);
						System.out.println(question.getClue(i));
					}
				}
				Thread.sleep(8000);
				System.out.println(question.getAnswer());
			} catch(InterruptedException e) {
				System.out.println("<!> Une erreur est survenue !");
			}
	}

}
