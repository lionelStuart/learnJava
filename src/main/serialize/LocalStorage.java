package serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;



/** 
* @ClassName: LocalStorage 
* @Description: 
* @author lisi 
* @date 2016年11月15日 下午12:06:12 
*  
*/
public class LocalStorage {
	private String parentPath = new File("").getAbsolutePath() + File.separator;
	private HashSet<String> paths = new HashSet<>();

	public String getParentPath() {
		return parentPath;
	}

	public void setParentPath(String parentPath) {
		this.parentPath = parentPath;
		if (!this.parentPath.endsWith(File.separator))
			this.parentPath += File.separator;
	}

	public boolean save(Serializable target, String fileName) {
		boolean isSaved = false;
		if (!paths.contains(fileName)) {
			paths.add(fileName);
			ObjectOutputStream out;
			try {
				out = new ObjectOutputStream(new FileOutputStream(getAbsPath(fileName)));
				out.writeObject(target);
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return isSaved;
	}

	private String getAbsPath(String fileName) {
		return parentPath + fileName;
	}

	public Serializable load(String fileName) {
		Serializable target = null;
		if (paths.contains(fileName)) {
			ObjectInputStream in;
			try {
				in = new ObjectInputStream(new FileInputStream(getAbsPath(fileName)));
				target = (Serializable) in.readObject();
				in.close();
			} catch (IOException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return target;
	}

	public static void main(String[] args) {
		System.out.println(new LocalStorage().parentPath);
		Employee ming = new Employee("jim", 13, 5);
		Employee gao = new Employee("tom", 15, 3);
		LocalStorage storage = new LocalStorage();
		storage.setParentPath("F:\\test");
		System.out.println(storage.getParentPath());
		storage.save(ming, "ming.dat");
		storage.save(gao, "gao.dat");
		Serializable obj = storage.load("ming.dat");
		if (obj instanceof Employee) {
			Employee ming1 = (Employee) storage.load("ming.dat");
			System.out.println(ming1);
		}
	}
}
