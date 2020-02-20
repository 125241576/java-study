package 生产者消费者;

public class Customer extends Thread {
	private Product p;
	public Customer(Product p,String name) {
		this.p=p;
		super.setName(name);
	}
	public void run(){
		while(true) {
			p.sell();
			
//			try {
//				this.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
			
	}
	public static void main(String[] args) {
		Product p=new Product();
		Customer c1=new Customer(p,"1");
		Customer c2=new Customer(p,"������2");
		new Productor(p,"������").start();
		c1.start();
		c2.start();
	}
}
