package oliver.test.common;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Just4Mockito {

	@Captor private  ArgumentCaptor<Integer> captor;
	
	@Test
	public void testMock(){
		List<Integer> mock = Mockito.mock(List.class);
		mock.add(1);
		Mockito.verify(mock).add(captor.capture());
		System.out.println(captor.getValue());
	}
	
}
