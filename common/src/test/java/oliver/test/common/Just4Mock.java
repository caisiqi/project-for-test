package oliver.test.common;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Just4Mock.class, System.class})
public class Just4Mock {

	@Captor private ArgumentCaptor<Integer> captor;
	
	@Before
    public void init(){
        PowerMockito.mockStatic(Just4Mock.class);// 3
        PowerMockito.mockStatic(System.class);
    }
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test
	public void testListAdd(){
		
		List<String> list0 = Mockito.mock(ArrayList.class);
		
		list0.add("a");
		list0.add("b");
		list0.add("c");
		
		System.out.println(String.format("list0 class %s", list0.getClass().getName()));
		System.out.println(String.format("original class %s", ArrayList.class.getName()));
		System.out.println(String.format("list0.size() is %d", list0.size()));
		
		// 设置希望捕获的参数类型
		ArgumentCaptor<String> captor0 = ArgumentCaptor.forClass(String.class);
		Mockito.verify(list0, Mockito.times(3)).add(captor0.capture());
		
		Assert.assertEquals("c", captor0.getValue());
		
		// 对于final类、匿名类和Java的基本类型是无法进行spy和mock
		List<String> list1 = Mockito.spy(new ArrayList());
		list1.add("a");
		list1.add("b");
		list1.add("c");
		
		ArgumentCaptor<String> captor1 = ArgumentCaptor.forClass(String.class);
		Mockito.verify(list1, Mockito.times(3)).add(captor1.capture());
		
		//System.out.println(String.format("Mockito.verify(list1, Mockito.times(3)) class is %s", Mockito.verify(list1, Mockito.times(3)).getClass().getName()));
		
		// 将会抛出异常
		//Mockito.when(list1.get(4)).thenReturn("d");
		
		// 不会抛出异常，因为使用了存根方法
		Mockito.doReturn("d").when(list1).get(4);
		
		System.out.println(list1.get(4));
		
		Assert.assertEquals(3, list1.size());
		/*
		System.out.println(String.format("list1 class %s", list1.getClass().getName()));
		System.out.println(String.format("list1.size() is %d", list1.size()));
		*/
		
		//PowerMockito.mockStatic(Just4Test.class);
		//PowerMockito.mockStatic(System.class);
		//PowerMockito.doReturn("/home").when(System.getProperty("user.dir"));
		
		PowerMockito.when(System.getProperty("user.dir")).thenReturn("/home");
		
		System.out.println(System.getProperty("user.dir"));
		
		Assert.assertEquals("/home", System.getProperty("user.dir"));
		
		
		List mock = Mockito.mock(List.class);
		//Mockito.when(mock.get(0)).thenReturn(0);
		//Mockito.when(mock.get(0)).thenThrow(new Exception("Mock Exception"));
		Mockito.when(mock.get(0)).then(new Answer() {

			@Override
			public Object answer(InvocationOnMock invocation) throws Throwable {
				if ("get".equals(invocation.getMethod().getName())
						&& invocation.getArguments().length == 1) {
					return 0;
				}
				return null;
			}
		});
		
		Mockito.when(mock.get(0)).thenReturn(0);
		Mockito.doReturn(0).when(mock).get(0);
		
		System.out.println(mock.get(0));
		
		Mockito.verify(mock).get(0);
		//Mockito.verify(mock,Mockito.times(2)).get(0);
		//Mockito.verify(mock,Mockito.times(2)).add(0);
		
		//Assert.assertEquals("expected", "actual");
		
		
		System.out.println(captor.getValue());
		
	}
	
	public static void someStaticMethod(){
		// do nothing
	}
	
}
