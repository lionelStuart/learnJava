package accessControl;

/**
 * @author ls 
 * public class Student 类具备全局可见性，在其它包中也可访问 一个class文件中仅能有一个public类
 *         private string name 仅在本类可见 protected int score 在本类和子类可见 protected
 *         setScore 方法允许被子类覆盖,并访问，但在包外仍不可被访问, 即使在包外创建子类也不可访问 protected default
 *         级别为包内可见，包外不可见 总而言之，public全局可见 private本类可见 protected对本类，继承和保内可见
 *         default只区分包内和包外
 */
public class App {
	public static void main(String[] args) {
		Student ming = new PrimaryStudent("xiaoMing");
		ming.showInfo();
		ming.setScore(50);
		ming.showInfo();
		ming.id = 9;
		ming.showInfo();
	}
}
