package oliver.test.pattern.memento;

import java.util.Vector;


public class Caretaker {
	
	private Vector<Memento> mementos = new Vector<>();
    
	/**
     * 备忘录的取值方法
     */
    public Memento retrieveMemento(){
    	return retrieveLastMemento();
    }
    
    public Memento retrieveLastMemento(){
    	return mementos.lastElement();
    }
    
    public Memento retrieveFirstMemento(){
    	return mementos.firstElement();
    }
    
    public Memento retrieveMemento(int index){
    	return mementos.get(index);
    }
    
    /**
     * 备忘录的赋值方法
     */
    public void saveMemento(Memento memento){
        mementos.addElement(memento);
    }

}
