package oliver.test.pattern;


import oliver.test.pattern.memento.Caretaker;
import oliver.test.pattern.memento.Originator;


public class Client {

	public static void main(String[] args) {
		
//		实际上，在装饰器模式和代理模式之间还是有很多差别的。装饰器模式关注于在一个对象上动态的添加方法，然而代理模式关注于控制对对象的访问。换句话 说，用代理模式，代理类（proxy class）可以对它的客户隐藏一个对象的具体信息。因此，当使用代理模式的时候，我们常常在一个代理类中创建一个对象的实例。并且，当我们使用装饰器模 式的时候，我们通常的做法是将原始对象作为一个参数传给装饰者的构造器。
//		我们可以用另外一句话来总结这些差别：使用代理模式，代理和真实对象之间的的关系通常在编译时就已经确定了，而装饰者能够在运行时递归地被构造。
//		Subject subject = new Proxy();
//		subject.talk();
		
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		originator.setState("new");
//		System.out.println(originator.getState());
		caretaker.saveMemento(originator.createMemento());
		originator.setState("change");
		caretaker.saveMemento(originator.createMemento());
//		System.out.println(originator.getState());
		originator.setState("change 1st");
		caretaker.saveMemento(originator.createMemento());
		originator.setState("change 2sd");
		caretaker.saveMemento(originator.createMemento());
		//originator.restoreMemento(caretaker.retrieveFirstMemento());
		originator.restoreMemento(caretaker.retrieveMemento(3));
		System.out.println(originator.getState());
	}

}
