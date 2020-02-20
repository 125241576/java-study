package StaticProxy;

public class SubjectImple implements Subject {
	private Subject subject;
	public SubjectImple(Subject s) {
		this.subject=s;
		
	}
	@Override
	public void request() {
		System.out.println("111");
		this.subject.request();
		System.out.println("222");
	}
	public static void main(String[] args) {
		SubjectStar star=new SubjectStar();
		SubjectImple s=new SubjectImple(star);
		s.request();
	}
}
