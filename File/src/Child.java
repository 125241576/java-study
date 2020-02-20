class Super {

	public int getLength() {
		return 4;
	}

}

public class Child extends Super {

	public long getLength() {
		return 5;
	}

	public static void main(String[] args) {
		Super sooper = new Super();
		Super sub = new Child();
		System.out.print(sooper.getLength() + "," + sub.getLength());
	}

}
