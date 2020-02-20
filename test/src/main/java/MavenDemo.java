package Maven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MavenDemo {
	public boolean test(int a,int b,int c) {
		if(a<=0 || b<=0 ||c<=0)
			return false;
		else if(a+b<=c)
			return false;
		else if(a+c<=b)
			return false;
		else if(c+b<=a)
			return false;
		else
			return true;
			
	}
	@Test
	public void t() {
		assertEquals(false, new MavenDemo().test(1, 2, 3));
	}
}
