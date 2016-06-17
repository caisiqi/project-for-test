package oliver.test.pattern.proxy;

public class RealSubject implements Subject {

	@Override
	public void talk() {
		System.out.println(this.getClass().getName() + " talk.");
	}

}
