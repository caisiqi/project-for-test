package oliver.test.pattern.decorator;

public class ConcreteComponent implements Component {

	@Override
	public void doAction() {
		System.out.println(this.getClass().getName() + " do action.");
	}

}
