package oliver.test.common.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

import oliver.demo.common.util.FtpHelper;

public class FtpUtilTest {

	//@Test
	public void testLocalStore() {
		
		try {
			FTPClient client = FtpHelper.getLocalClient();
			if(client.isAvailable()){
				client.storeFile("temp0.txt", new ByteArrayInputStream("Hello world".getBytes()));
			}
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//@Test
	public void testSynnexGet() {
		
		try {
			FTPClient client = FtpHelper.getSynnexClient();
			//FTPClient client = FtpHelper.getLocalClient();
			if(client.isAvailable()){
				/*FTPFile[] files = client.listFiles();
				for (FTPFile file : files) {
					System.out.println(file.getName());
				}*/
				for (String name : client.listNames()) {
					System.out.println(name);
				}
			}
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
