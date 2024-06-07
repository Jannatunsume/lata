package cla;

public class Exampularray {
	public static int sum(int[]arry){
		int sum=0;
		for(int array:arry) {
			sum+=array;}
	
		return sum;}
	public static void main(String[] args) {
	int arry[]= {5,6,9,8,7,9};
	int arraysum=sum(arry);
			
	System.out.println(arraysum);
	
			
		

	}

}


