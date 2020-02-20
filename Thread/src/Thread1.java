
public class Thread1 {

	public static void main(String[] args) {
		Runnable r1=()->{
			synchronized("A") {
				System.out.println("A�̳߳���A�����ȴ�B��");
				try {
					"A".wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized("B") {
					System.out.println("A�̳߳���A����B��");
				}
			}
		};
		Runnable r2=()->{
			synchronized("B") {
				System.out.println("B�̳߳���B�����ȴ�A��");
				synchronized("A") {
					System.out.println("B�̳߳���A����B��");
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
