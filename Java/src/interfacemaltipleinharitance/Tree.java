package interfacemaltipleinharitance;

public class Tree implements Flower, Furit {
	public void bloom() {
		System.out.println("Flower is blooming");
	}

	public void ripe() {
		System.out.println("Furit is riping");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree T = new Tree();
		T.bloom();
		T.ripe();

	}

}
