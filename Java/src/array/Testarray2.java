package array;

public class Testarray2 {
	static void max(int arr[]) {
		int max=arr[0];
		for(int i=1;i>arr.length;i++)
			if(max<arr[i])
				max=arr[i];
		System.out.println(max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int a[]= {33,3,4,5};
max(a);
	}

}
