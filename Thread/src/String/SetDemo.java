package String;

import java.util.HashSet;

public class SetDemo {
	public static void main(String[] args) {
		HashSet<Cat> zz=new HashSet<>();
		zz.add(new Cat(1));
		zz.add(new Cat(1));
		zz.add(new Cat(2));
		zz.add(new Cat(13));
		System.out.println(zz.size());
		int[] i= {1,2,3};
		System.out.println(i.length);
	}
	
}
class Cat{
	private int size;
	public Cat(int s) {
		this.size=s;
	}
	public int hashCode() {
		return size;
	}
	public int getSize() {
		return this.size;
	}
	public boolean equals(Object o) {
		if(this.size-((Cat)o).getSize()==0)
			return true;
		else
			return false;
	}
}