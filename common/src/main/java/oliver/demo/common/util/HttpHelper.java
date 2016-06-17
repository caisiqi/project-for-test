package oliver.demo.common.util;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import com.alibaba.fastjson.JSON;

public class HttpHelper {

	@SuppressWarnings("rawtypes")
	public static Map getJSON(String url) {
		CloseableHttpClient httpclient = HttpClientBuilder.create().build();
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();
		HttpGet httpget = new HttpGet(url);
		HttpResponse response;
		try {
			response = httpclient.execute(httpget);
			if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
				throw new Exception();
			}
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				InputStream inStream = entity.getContent();
				int len;
				byte[] b = new byte[1024];

				while ((len = inStream.read(b)) != -1) {
					buffer.write(b, 0, len);
				}
				return JSON.parseObject(new String(buffer.toByteArray()), Map.class);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
