package oliver.demo.common.util;

import java.io.IOException;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPReply;

public class FtpHelper {
	
	public static FTPClient getLocalClient() throws SocketException, IOException {
		return getFTPClient("localhost", "oliverc", "synnex", "UTF-8", 21);
	}
	
	//MRP	local-ftp.synnex.org	qaz@wsx	21	mrpdoc
	public static FTPClient getSynnexClient() throws IOException {
		return getFTPClient("local-ftp.synnex.org", "qaz@wsx", "mrpdoc", "UTF-8", 21);
	}
	
	public static FTPClient getFTPClient(String hostname, 
			String username, 
			String password,
			String encoding,
			int port) throws IOException {
		
		FTPClient client = new FTPClient();
		client.setControlEncoding(encoding);
		client.setDefaultPort(port);
		FTPClientConfig config = new FTPClientConfig(FTPClientConfig.SYST_NT);
		config.setServerLanguageCode(FTP.DEFAULT_CONTROL_ENCODING);
		client.configure(config);
		client.connect(hostname);
		client.login(username, password);
		client.setDataTimeout(120000);
		client.setFileType(FTP.BINARY_FILE_TYPE);
		client.enterLocalPassiveMode();
		int reply = client.getReplyCode();
		
		if (!FTPReply.isPositiveCompletion(reply)) {
			client.disconnect();
		}
		return client;
	}
	
}
