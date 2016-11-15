package array;

import java.util.Arrays;
import java.util.Scanner;



public class SpliString {
	String[] StringArray;
	String[] split(String input){
		String[] temp=input.split(" {1,}");
		return temp;
	}
	int [] toIntegers(String [] input){
		int[] arrays=new int[input.length];
		for(int i=0;i!=input.length;i++){
			arrays[i]=Integer.valueOf(input[i]);
		}
		return arrays;
	}
	int getMinNum(int[] input){
		int [] array=input.clone();
		Arrays.sort(array);
		return array[0];
	}
	public static void main(String[] args) {
		SpliString app=new SpliString();
		String inputString=new String();
		System.out.println("input String:");
		Scanner scan=new Scanner(System.in);
		inputString=scan.nextLine();
		scan.close();
		String [] strArray=app.split(inputString);
		int[] array=app.toIntegers(strArray);
		System.out.println("get Minner for "+Arrays.toString(array)+" is "+app.getMinNum(array));
	}
}
