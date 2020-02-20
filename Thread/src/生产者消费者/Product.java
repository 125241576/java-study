package 生产者消费者;

public class Product {
	private int number=0;
	private int max=10;
	public Product() {}
	public int getNumber() {
		return this.number;
	}
	public synchronized void make() {
		if(number==max)
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(Thread.currentThread().getName()+"������1��ʣ�ࣺ"+ ++number);
		this.notifyAll();
		
	}
	public synchronized void sell() {
		if(number==0)
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(Thread.currentThread().getName()+"������1��ʣ�ࣺ"+ --number);
		this.notifyAll();
		

	}
}
