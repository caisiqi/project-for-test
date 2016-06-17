package oliver.test.common;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.stream.Collectors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.alibaba.fastjson.JSON;

import oliver.demo.common.util.Common;
import oliver.test.common.vo.Department;
import oliver.test.common.vo.User;


@RunWith(PowerMockRunner.class)
@PrepareForTest(Just4Test.class)
public class Just4Test {

	//@Test
	public void testForEach(){
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "");
		map.put("5", "");
		
		map.forEach((k, v)->{ System.out.println(k + ":" + v); });
		
		/*map.entrySet().parallelStream().filter(new Predicate<Entry<String, String>>() {

			@Override
			public boolean test(Entry<String, String> t) {
				if (null == t.getValue() || Utils.isBlank(t.getValue().toString())) {
					return false;
				}
				return true;
			}
		});*/
		
		map = map.entrySet().parallelStream()
			.filter( e-> null != e.getValue() && !"".equals( e.getValue().toString().trim() ) )
			.collect(Collectors.toMap(k->k.getKey().toString(), v->v.getValue().toString()));
		
		map.forEach((k, v)->{ System.out.println(k + ":" + v); });
	}
	
	//@Test
	public void testForClassName(){
		
		System.out.println(String.class);
		System.out.println(String[].class);
		System.out.println(Character.class);
		System.out.println(Character[].class);
		System.out.println(Integer.class);
		System.out.println(Integer[].class);
		System.out.println(Float.class);
		System.out.println(Float[].class);
		System.out.println(Double.class);
		System.out.println(Double[].class);
		System.out.println(Byte.class);
		System.out.println(Byte[].class);
		System.out.println(Long.class);
		System.out.println(Long[].class);
		System.out.println(Boolean.class);
		System.out.println(Boolean[].class);
		
		System.out.println();
		
		System.out.println(char.class);
		System.out.println(char[].class);
		System.out.println(int.class);
		System.out.println(int[].class);
		System.out.println(float.class);
		System.out.println(float[].class);
		System.out.println(double.class);
		System.out.println(double[].class);
		System.out.println(byte.class);
		System.out.println(byte[].class);
		System.out.println(long.class);
		System.out.println(long[].class);
		System.out.println(boolean.class);
		System.out.println(boolean[].class);
	}
	
	//@Test
	public void testURLEncode(){
		
		//String _cp = "mrpProjectReport%7E6 ";
		//String _st = "chgReqsReport%7Erequest_type";
		String _cp = "chgReqsReport%7E27";
		String _st = "mrpProjectReport%7Emfg_proj_ref_no";
		
		
		String enc = "utf-8";
		
		try {
			System.out.println(URLDecoder.decode(_cp, enc));
			System.out.println(URLDecoder.decode(_st, enc));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//@Test
	public void testCSV() {
		
		String[] lines = {	
			"Category,Series 1",
			"Jan,29.9",
			"Feb,71.5",
			"Mar,106.4",
			"Apr,129.2",
			"May,144",
			"Jun,176",
			"Jul,135.6",
			"Aug,148.5",
			"Sep,216.4",
			"Oct,194.1",
			"Nov,95.6",
			"Dec,54.4"
		};
		
		try {
			StringBuffer content = new StringBuffer();
			String separator = System.getProperty("line.separator");
			for (String line : lines) {
				content.append(line);
				content.append(separator);
			}
			OutputStream out = new FileOutputStream("temp.csv");
			out.write(content.substring(0, content.length() - separator.length()).getBytes());
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//@Test
	public void test1() {
		
		/*
		System.out.println(1 % 50);
		System.out.println(50 % 50);
		 */
		
		/*
		System.out.println(String.class.isAssignableFrom(Serializable.class));
		System.out.println(Serializable.class.isAssignableFrom(String.class));
		System.out.println(Integer.class.isAssignableFrom(String.class));
		System.out.println(Number.class.isAssignableFrom(Integer.class));
		
		System.out.println(System.getProperty("user.dir"));
		
		PowerMockito.when(System.getenv("user.dir")).thenReturn("C:\\Program files");
		*/
		
		List _list = new ArrayList<>();
		_list.add("1");
		_list.add(2);
		List<? extends Number> list = _list;
		_list.add(new HashMap<>());
		System.out.println(list.get(0) instanceof Number);
		System.out.println(list.get(1) instanceof Number);
		System.out.println(list.get(2) instanceof Number);
		
		List<? super Number> list1 = new ArrayList<>();
		list1.add(new Integer(1));
		list1.add(new Float(2));
		System.out.println(list1.get(0) instanceof Number);
		
		Map map = new HashMap<>();
		map.put("date", new Date());
		System.out.println(map.get("date").getClass().getName());
		map.put("date", "03/09/2016");
		System.out.println(map.get("date").getClass().getName());
		
		System.out.println((String) null);
		
		System.out.println(Just4Test.class.getPackage().getImplementationVersion());
	
		List<Integer> intList = Arrays.asList(2, 1, 3);
		Collections.sort(intList);
		System.out.println(intList);
	}
	
	//@Test
	public void test2() {
		
		User user = new User();
		/*
		user.setEmail("user@domain.com");
		user.setLoginid("user");
		user.setUserid(123);
		user.setPhoneNumber(1234567890);
		*/
		Map map = new HashMap();
		map.put("email", "user@domain.com");
		map.put("loginid", "user");
		map.put("userid", "123");
		map.put("phoneNumber", "1234567890");
		map.put("department.name", "hyve");
		map.put("department.code", "123");
		Common.convert(user, map);
	
		System.out.println(JSON.toJSONString(user));
		
		Department department = new Department();
		department.setCode(123);
		department.setName("hyve");
		user.setDepartment(department);
		
		System.out.println(Common.convertBean2Map(user));
	
		// true
		System.out.println(int.class.isPrimitive());
		// false
		System.out.println(Integer.class.isPrimitive());
		// false
		System.out.println(int.class.equals(Integer.class));
	
		Integer[] intList1 = {1, 2, 3};
		int[] intList2 = {1, 2, 3};
		// false
		System.out.println(intList1.equals(intList2));
		// false
		System.out.println(intList1.getClass().equals(intList2.getClass()));
	
		// compile error
		//((int[])intList1).getClass();
	
		// compile error
		//((Integer[])intList2).getClass();
		
	}
	
	//@Test
	public void test3() throws ParseException {
		System.out.println(Common.objectToInteger("123123  ".trim()));
	
		DateFormat df = new SimpleDateFormat("EEE, HH:mm:ss a", Locale.ENGLISH);
		System.out.println(df.format(new Date()));
		System.out.println(df.parse("13:59:26 PM"));
	}
	
	//@Test
	public void testException() {
		/*
		Integer i = new Integer(0);
		i = null;
		System.out.println(i.intValue());
		*/
		
		File file = new File("xxxx");
		file.getFreeSpace();
	}
	
	@Test
	public void testAImpl(){
//		Object ojbA = new AImpl();
//		InterfaceA a = (InterfaceA) ojbA;
//		a.a();
//		System.out.println(JSON.toJSONString(null));
//		Integer a = -129;
//		Integer b = new Integer(-129);
//		Integer c = -129;
//		
//		System.out.println(a == b);
//		System.out.println(a == c);
		
//		String a = "abc";
//		String b = "a"+"b"+"c";
//		System.out.println(a == b);
		
//		String a = new String("abc");
//		a = a.intern();
//		String b = "abc";
//		System.out.println(a == b);
	
//		System.out.println(Integer.toString(15, 16));
		
//		StringBuffer a = new StringBuffer();
//		a.append("abc");
//		System.out.println(a.delete(a.length()-1, a.length()));
	
//		Integer a = 127;
//		Integer b = a.valueOf(127);
		
//		System.out.println(a == b);
	
//		System.out.println(System.getSecurityManager() == null);
	
//		sun.security.util.SecurityConstants
		
//		Long a = new Long(0);
//		while(true) {
//			a++;
//			String.valueOf(a).intern();
//		}
		
		Map allStackTraces = Thread.getAllStackTraces();
		System.out.println(allStackTraces.keySet());
//		System.out.println(JSON.toJSONString(allStackTraces));
		System.out.println(ClassLoader.getSystemClassLoader());
		System.out.println(Thread.currentThread().getContextClassLoader());
		System.out.println(getClass().getClassLoader());
		
		System.out.println(JSON.toJSONString(Package.getPackages()));
		
		// ClassLoader是null,说明String,Integer室友bootstrapclassloader加载的
		// verbose:class未输出加载信息
		System.out.println("String.class.getClassLoader(): " + String.class.getClassLoader());
		System.out.println("Integer.class.getClassLoader(): " + Integer.class.getClassLoader());
//		System.out.println(getClass().getClassLoader().getParent());
		
		for (ClassLoader classLd = getClass().getClassLoader(); classLd != null; classLd = classLd.getParent()) {
			System.out.println("classLd: " + classLd);
		}
		
		Properties properties = System.getProperties();
		for (Iterator<Entry<Object, Object>> it = properties.entrySet().iterator(); it.hasNext();) {
			Entry<Object, Object> entry = it.next();
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
//		URL[] urls = sun.misc.Launcher.getLauncher().getBootstrapClassPath().getURLs();
//		System.out.println(JSON.toJSONString(urls));
	
		// Reflection.getCallerClass 过时, 在oracle bug数据库追踪该问题
		/*
		System.out.println(Reflection.getCallerClass(3));
		
		String s = "sdf\\rsdf".replaceAll("\\\\r", "");
		
		System.out.println(s);
		*/
		
		/*抛出NullPointException
		Integer a = null;
		System.out.print(a == 1);
		*/
		/*int a = 5;
		int b = 0;
		for(int i = 0; i < 5; i++){
			b = --a;
			System.out.println(b);
		}*/
		/*
		User a = new User();
		User b = new User();
		a.setFriends(new ArrayList<>());
		b.setFriends(new ArrayList<>());
		a.getFriends().add(b);
		b.getFriends().add(a);
		a.setUserid(1);
		b.setUserid(2);
		a.setLoginid("a");
		b.setLoginid("b");
	
		System.out.println(JSON.toJSONString(a, SerializerFeature.DisableCircularReferenceDetect));
		*/
//		System.out.println(System.getProperty("jdbc.drivers"));
		
//		Thread t = new Thread();
//		t.getState();
		
//		Map<String, String> map = new HashMap<>();
		/*Map<String, String> map = new TreeMap<>();
		System.out.println(map.get(null));
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}*/
		
//		Properties p = System.getProperties();
		
		/*for (int i = 10 -1 ; i >= 0; i--) {
			System.out.println(i);
		}*/
		
//		System.out.println("xxx: " + (Integer)null);
		
		/*
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println("xxx: " + df.format(new Date()));
		System.out.println("yyy: " + df.format(null));
		*/
	}
}
