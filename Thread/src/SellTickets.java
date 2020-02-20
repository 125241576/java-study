
public class SellTickets {
	public static void main(String[] args) {
	Runnable r=()->{
		while(Ticket.nbTicket>0)
			synchronized("") {
				if(Ticket.nbTicket<=0)
					return;
				System.out.println(Thread.currentThread().getName()+"sell 1 ticket, reste"+--Ticket.nbTicket);
			}
			
	};							   
	Thread t1=new Thread(r,"张三");
	Thread t2=new Thread(r,"李四");
	Thread t3=new Thread(r,"王五");
	t1.start();
	t2.start();
	t3.start();
	
}
}

class Ticket{
	public static int nbTicket=100;
}