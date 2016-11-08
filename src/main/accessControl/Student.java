package accessControl;

public class Student {

	private String name;
	protected int score;
	
	int id;

	public void showInfo() {
		System.out.println("student Info: name-" + name + " score-" + score+ " id-"+id);
	}

	public Student(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.score = 0;
		this.id=0;
	}

	protected void setScore(int score) {
		this.score = score;
	}

}

class PrimaryStudent extends Student {

	public PrimaryStudent(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setScore(int score) {
		// TODO Auto-generated method stub
		super.setScore(score);
		this.score = score+1;
	}
}
