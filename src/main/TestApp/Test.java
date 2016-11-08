package TestApp;


import accessControl.Student;

public class Test {
	public static void main(String[] args) {
		Student qiang=new Student("XiaoQiang");		
		qiang.showInfo();
		Student jun=new NewStudent("xiaoJun");
		jun.showInfo();
	}

	
}
class NewStudent extends Student{

	public NewStudent(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void setScore(int score) {
		// TODO Auto-generated method stub
		super.setScore(score);
	}
}
