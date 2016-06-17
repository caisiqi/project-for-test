package oliver.test.pattern.memento;

public class Originator {

	private String state;
	
	public Memento createMemento(){
		return new MementoImpl(state);
	}
	
	public void restoreMemento(Memento memento){
		if(memento instanceof MementoImpl){
			this.state = ((MementoImpl)memento).getState();
			return;
		}
		throw new IllegalArgumentException();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	private class MementoImpl implements Memento{
		
		private String state;
		
		public MementoImpl(String state){
			this.state = state;
		}
		/*
		public void setState(String state){
			this.state = state;
		}
		*/
		public String getState(){
			return state;
		}

		@Override
		public String getMementoDescribe() {
			return this.getClass().getName();
		}
	}
	
}
