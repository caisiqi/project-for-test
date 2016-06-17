package oliver.demo.common.util;

import java.util.Collection;

public class Utils {

	public static boolean isBlank(String arg0){
		return null == arg0 || "".equals(arg0.trim());
	}
	
	public static boolean isNotBlank(String arg0){
		return !isBlank(arg0);
	}
	
	public static boolean isEmpty(Collection<?> arg0){
		if(arg0 == null || arg0.isEmpty()) {
			return true;
		}
		return false;
	}
	
	public static boolean isNotEmpty(Collection<?> arg0){
		return !isEmpty(arg0);
	}
	
	public static boolean isEmpty(Object[] arg0){
		if(arg0 == null || arg0.length == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean isNotEmpty(Object[] arg0){
		return !isEmpty(arg0);
	}
	
	public static Integer toInteger(Object obj){
		return null == obj ? null : Integer.valueOf(obj.toString()); 
	}
}
