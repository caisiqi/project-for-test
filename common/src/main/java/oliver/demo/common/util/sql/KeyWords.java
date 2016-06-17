package oliver.demo.common.util.sql;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class KeyWords {

	public static String CREATE = "create";
	
	public static String TABLE = "table";
	
	public static String IDENTIFIER = "identifier";
	
	public static String INT = "int";
	
	public static String VARCHAR = "varchar";
	
	public static String DOUBLE = "double";
	
	public static String FLOAT = "float";
	
	public static List<String> keywords() {
		List<String> keywords = new ArrayList<String>();
		Field[] fields = KeyWords.class.getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			try {
				if (String.class.equals(field.getType())) {
					String keyword = (String) field.get(KeyWords.class);
					keywords.add(keyword);
				}
			} catch (Exception e) {
			}
		}
		return keywords;
	}

}
