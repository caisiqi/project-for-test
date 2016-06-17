package oliver.test.pattern.decorator;

public class Decorator implements Component {

	private Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}
	
	@Override
	public void doAction() {
		component.doAction();
		System.out.println(this.getClass().getName() + " decorate.");
	}

}
