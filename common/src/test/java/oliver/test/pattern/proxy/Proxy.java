package oliver.test.pattern.proxy;

public class Proxy implements Subject {

	private RealSubject subject = new RealSubject();
	
	@Override
	public void talk() {
		subject.talk();
		System.out.println(this.getClass().getName() + " print.");
	}

}
