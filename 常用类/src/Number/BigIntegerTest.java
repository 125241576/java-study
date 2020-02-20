package Number;

import java.math.BigInteger;

public class BigIntegerTest {
	public static void main(String[] args) {
		BigInteger b1=new BigInteger("123456789");
		BigInteger b2=new BigInteger("987654321");
		System.out.println(b2.add(b1));//加法
		System.out.println(b2.subtract(b1));//减法
		System.out.println(b2.multiply(b1));//乘法
		System.out.println(b2.divide(b2));//除法
}
	}
	
