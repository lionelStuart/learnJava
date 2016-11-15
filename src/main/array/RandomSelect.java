package array;

import java.util.ArrayList;
import java.util.Random;

public class RandomSelect {
	ArrayList<String> group=new ArrayList<>();
	void addMember(String member){
		if(group.contains(member))
			return;
		group.add(member);
	}
	String select(){
		String result=null;
		if(!group.isEmpty()){
			int randomNum=new Random().nextInt(group.size());
			result=group.get(randomNum);
		}
		return result;
	}
	public static void main(String[] args) {
		RandomSelect selector=new RandomSelect();
		selector.addMember("Jim");
		selector.addMember("bill");
		selector.addMember("tom");
		selector.addMember("sam");
		selector.addMember("peter");
		System.out.println("select:"+selector.select());
		System.out.println("select:"+selector.select());
		System.out.println("select:"+selector.select());
		System.out.println("select:"+selector.select());
		System.out.println("select:"+selector.select());
	}
}
