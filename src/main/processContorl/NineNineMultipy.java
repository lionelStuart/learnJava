package processContorl;

public class NineNineMultipy {
	public static void main(String[] args) {
		NineNineMultipy app = new NineNineMultipy();
		app.show(10);
	}

	void show(int maxNum) {
		int maxLevel = maxNum;
		int level = 1;
		int i = 1;
		while (level <= maxLevel) {
			for (i = 1; i <= level; i++) {
				//formatÓï¾ä²»ÇåÕæ
				String temp = String.format("%4d*%4d=%3d\t", i,level, level * i);
				System.out.print(temp);
			}
			System.out.println();
			level += 1;
		}
	}
}
