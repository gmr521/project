package project1.java;
import java.util.Arrays;
public class Arrrev {



	public static void reverse(int [ ] array){

	for(int i=array.length-1;i>=0;i--){
	System.out.println(array[i]);
	}
	}
	public static void main(String[] args) {

	int [ ]array = { 1,2,3,4,5,6};
	reverse(array);

	}
	}


