package array;

public class Practiceofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[]=new int[5];
		number[0]=10;
		number[1]=20;
		number[2]=30;
		number[3]=40;
		number[4]=50;
	
		System.out.println("number = "+number[4]);
		
		int len=number.length;
		System.out.println("array size = "+len);
		
		int sum=number[0]+number[1]+number[2]+number[3]+number[4];
		System.out.println("sum= "+sum);
	}

}
