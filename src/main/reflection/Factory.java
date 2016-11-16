package reflection;


public class Factory {
	public static Person getInstance(String className) {
		Person result=null;
				try {
			Class<?> clazz=Class.forName(className);
			if(true){
				result=(Person)clazz.newInstance();
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public static void main(String[] args) {
		Person p1=Factory.getInstance("reflection.Employee");
		Person p2=Factory.getInstance("reflection.Teacher");
		p1.getInfo();
		p2.getInfo();
	}
}
