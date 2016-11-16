package reflection;

public class Teacher extends Person{
	private String name;
	private String school;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
		this.name="teacher";
		this.school="school";
		this.age=0;
	}
	public Teacher(String name, String school, Integer age) {
		super();
		this.name = name;
		this.school = school;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", school=" + school + ", age=" + age + "]";
	}
	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("I'm a teacher");
	}
}
