package collection;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String>customer=new HashMap<Integer,String> ();

customer.put(101, "kamal");
customer.put(103, "samal");
customer.put(102, "jamal");
customer.put(107, "bamal");
customer.put(105, "damal");
customer.put(106, "aamal");

System.out.println(customer);


System.out.println(customer.get(101));
System.out.println(customer.get(102));
System.out.println(customer.get(103));
System.out.println(customer.get(104));
System.out.println(customer.get(105));
System.out.println(customer.get(106));
	}

}
