package accessControl;

/**
 * @author ls 
 * public class Student ��߱�ȫ�ֿɼ��ԣ�����������Ҳ�ɷ��� һ��class�ļ��н�����һ��public��
 *         private string name ���ڱ���ɼ� protected int score �ڱ��������ɼ� protected
 *         setScore �����������า��,�����ʣ����ڰ����Բ��ɱ�����, ��ʹ�ڰ��ⴴ������Ҳ���ɷ��� protected default
 *         ����Ϊ���ڿɼ������ⲻ�ɼ� �ܶ���֮��publicȫ�ֿɼ� private����ɼ� protected�Ա��࣬�̳кͱ��ڿɼ�
 *         defaultֻ���ְ��ںͰ���
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
