package 生产者消费者;

public class Productor extends Thread {
	private Product p;
	public Productor(Product p,String name) {
		this.p=p;
		super.setName(name);
	}
	public void run(){
		while(true) {
			p.make();
			
//			try {
//				this.sleep(400);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
			
	}
}
