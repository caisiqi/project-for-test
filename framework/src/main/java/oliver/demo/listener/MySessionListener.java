package oliver.demo.listener;

import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.log4j.Logger;

public class MySessionListener implements HttpSessionListener {
	
	private static volatile AtomicLong sessionCount = new AtomicLong(0);
	Logger logger = Logger.getLogger(this.getClass());
	
	@Override
	public void sessionCreated(HttpSessionEvent event) {
		// TODO Auto-generated method stub
		synchronized (sessionCount) {
			sessionCount.incrementAndGet();
		}
		logger.debug("session count is " + sessionCount.get());
		logger.debug("session id is " + event.getSession().getId());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		// TODO Auto-generated method stub
	}

}
