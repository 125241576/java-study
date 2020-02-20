
public class Thread1 {

	public static void main(String[] args) {
		Runnable r1=()->{
			synchronized("A") {
				System.out.println("A线程持有A锁，等待B锁");
				try {
					"A".wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized("B") {
					System.out.println("A线程持有A锁和B锁");
				}
			}
		};
		Runnable r2=()->{
			synchronized("B") {
				System.out.println("B线程持有B锁，等待A锁");
				synchronized("A") {
					System.out.println("B线程持有A锁和B锁");
					"A".notifyAll();
				}
			}
		};
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);		
		t1.start();
		t2.start();
	}
}
