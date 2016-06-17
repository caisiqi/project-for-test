/**
 *
 */
package oliver.demo.common.util;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;













import com.alibaba.fastjson.JSON;

/**
 * This class defines some common methods.
 *
 * @author Andy Ji 3/28/2013
 *
 */
public class Common {

	/**
	 * Convert null to empty string.<br/>
	 * <br/>
	 * If the parameter is not null, return the result of method toString().
	 *
	 * @return
	 * @author Andy Ji 3/28/2013
	 */
	public static String nullToEmpty(Object obj) {
		if(obj == null)
			return "";
		return obj.toString();
	}

	/**
	 * Determine whether a string is null or empty string or null string
	 * @param str
	 * @return
	 * @author Andy Ji 3/28/2013
	 */
	public static boolean isNull(String str){
		if(str == null || str.trim().length()==0 || "null".equals(str.trim()))
			return true;
		return false;
	}
	
	public static boolean isNotNull(String str) {
		return !isNull(str);
	}

	/**
	 * Determine whether a string is null or empty string
	 * @param str
	 * @return
	 * @author Andy Ji 5/9/2013
	 */
	public static boolean isBlank(String str){
		if(str == null || str.trim().length()==0)
			return true;
		return false;
	}
	
	public static boolean isNotBlank(String str){
		return !isBlank(str);
	}
	
	public static boolean isEmpty(Collection<?> c){
		if(c == null || c.isEmpty()) {
			return true;
		}
		return false;
	}
	
	public static boolean isNotEmpty(Collection<?> c){
		return !isEmpty(c);
	}
	
	public static boolean isEmpty(Map<?, ?> m){
		if(m == null || m.isEmpty()) {
			return true;
		}
		return false;
	}
	
	public static boolean isNotEmpty(Map<?, ?> m){
		return !isEmpty(m);
	}
	
	public static boolean isEmpty(Object[] arr){
		if(arr == null || arr.length == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean isNotEmpty(Object[] arr){
		return !isEmpty(arr);
	}

	/**
	 * Convert an object to String.
	 * @return
	 */
	public static String objectToString(Object obj){
		if(obj == null)
			return null;
		return obj.toString();
	}

	public static String objectToNotNullString(Object obj) {
		if(obj == null)
			return "";
		return obj.toString();
	}
	
	/**
	 * Convert an object to Integer.
	 * @return
	 */
	public static Integer objectToInteger(Object obj){
		if(obj == null || isBlank(obj.toString()))
			return null;
		return Integer.valueOf(obj.toString());
	}

	/**
	 * This method will call the trim method of String, but if the string need
	 * trim is null, this method will return null directly.
	 *
	 * @param etaCode
	 * @return
	 */
	public static String trim(String str) {
		if (str == null)
			return null;
		return str.trim();
	}

	/**
	 * Convert an object to int, if the object is null, return 0.
	 * @return
	 */
	public static int objectToInt(Object obj) {
		if(obj == null)
			return 0;
		return Integer.parseInt(obj.toString());
	}

	/**
	 * Convert an object to double, if the object is null, return 0.0;
	 * @author andyj@synnex.com
	 * @param value the value need convert.
	 * @return coverted double value
	 */
	public static double objectToDouble(Object value) {
		if(value == null)
			return 0.0;
		return Double.parseDouble(value.toString());
	}
	
	   /**
     * Convert an object to float, if the object is null, return 0.0;
     * @author williamz@synnex.com
     * @param value the value need convert.
     * @return coverted float value
     */
    public static float objectToFloat(Object value) {
        if(value == null)
            return 0.0f;
        return Float.parseFloat(value.toString());
    }
    
    /**
     *  Convert an object to boolean, if the object is null, return false;
     * @author haleyg@synnex.com
     * @param value
     * @return
     */
    public static boolean objectToBoolean(Object value) {
    	if (value == null) {
			return false;
		}
    	return Boolean.parseBoolean(String.valueOf(value));
    }
    
    public static String dateToString(Date value, String... patten) {
    	if (value == null) {
			return "";
		}
    	String p = "yyyy-MM-dd";
    	if (patten != null && patten.length != 0) {
			p = patten[0];
		}
    	SimpleDateFormat f = new SimpleDateFormat(p);
    	return f.format(value);
    }

    /**
     * Judge whether the value1 equals value2
     * @param value1 The first value
     * @param value2 The second value
     * @return True if the value1 equals value2, else false.
     */
	public static boolean isEqual(Object value1, Object value2) {
		if(value1 == null && value2 == null)
			return true;
		if(value1 != null){
			return value1.equals(value2);
		}
		return false;
	}
	
	public static boolean isNumeric(String str) {
		if (str == null) {
			return false;
		}
		Pattern pattern = Pattern.compile("^[(-?\\d+\\.\\d+)|(-?\\d+)]+$");
		return pattern.matcher(str.trim()).matches();
	}
	
	/**
	 * An array of joining together into a string
	 * @author haleyg
	 * @param array
	 * @param separator
	 * @return
	 */
	public static String join(Object[] array, String separator) {
        if (array == null) {
            return null;
        }
        if (separator == null) {
            separator = "";
        }
        int arraySize = array.length;
		int bufSize = ((arraySize == 0) ? 0 : arraySize * ((array[0] == null ? 16 : array[0].toString().length()) + separator.length()));
        StringBuilder buf = new StringBuilder(bufSize);

        for (int i = 0; i < arraySize; i++) {
            if (i > 0) {
                buf.append(separator);
            }
            if (array[i] != null) {
                buf.append(array[i]);
            }
        }
        return buf.toString();
    }
	
	/**
	 * convert list to a list of attributes.
	 * @author haleyg
	 * @param source
	 * @param fieldName
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> List<T> map(List<?> source, String fieldName) {
		List<T> result = new ArrayList<T>();
		if (isNotEmpty(source)) {
			for (Object obj : source) {
				try {
					Field field = obj.getClass().getDeclaredField(fieldName);
					boolean acc = field.isAccessible();
					field.setAccessible(true);
					result.add((T) field.get(obj));
					field.setAccessible(acc);
				} catch (Exception e) {
					// Ignore
				}
			}
		}
		return result;
	}
	
	/**
	 * Map convert to javaBean, convert by same name.
	 * @author haleyg
	 * @param bean
	 * @param map
	 * @return
	 */
	public static <T> T convert(T bean, Map<String, Object> map) {
		if (isNotEmpty(map)) {
			try {
				BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
				PropertyDescriptor[] proDescrtptors = beanInfo.getPropertyDescriptors();
				if (isNotEmpty(proDescrtptors)) {
					for (PropertyDescriptor propertyDescriptor : proDescrtptors) {
						Object value = map.get(propertyDescriptor.getName());
						if (value != null) {
							Method writeMethod = propertyDescriptor.getWriteMethod();
							if (writeMethod != null) {
								Class<?> propertyType = propertyDescriptor.getPropertyType();
								if (int.class.equals(propertyType) || Integer.class.equals(propertyType)) {
									writeMethod.invoke(bean, objectToInt(value));
								} else if (String.class.equals(propertyType)) {
									writeMethod.invoke(bean, objectToString(value));
								} else if (double.class.equals(propertyType)|| Double.class.equals(propertyType)) {
									writeMethod.invoke(bean, objectToString(value));
								} else if (Date.class.equals(propertyType)) {
									writeMethod.invoke(bean, DateUtil.parseDate(objectToString(value)));
								} else if (boolean.class.equals(propertyType) || Boolean.class.equals(propertyType)) {
									writeMethod.invoke(bean, Boolean.parseBoolean(objectToString(value)));
								} else {
									// do not set value
								}
							}
						}
					}
				}
			} catch (IntrospectionException e) {
				// Ignore
			} catch (IllegalArgumentException e) {
				// Ignore
			} catch (IllegalAccessException e) {
				// Ignore
			} catch (InvocationTargetException e) {
				// Ignore
			}
		}
		return bean;
	}
	
	/**
	 * adjust current system whether is production.
	 * @author haleyg
	 * @return
	 */
	public static boolean isProductEnv() {
		return "PROD".equals(System.getProperty("synnex.server.environment"));
	}
	
	public static int lastIndexOf(String text, String regex){
	    return text.lastIndexOf(regex);
	}
	
	public static String translateAllocModel(int allocModel){
	    if(allocModel == 1){
	        return "Sequential";
	    }
	    if(allocModel == 2){
            return "Parallel";
        }
	    if(allocModel == 3){
            return "Replacement";
        }
	    return "";
	}
	
	public static void assertEqual(String arg0, String arg1) throws Exception{
	    if(!Common.objectToNotNullString(arg0).equals(Common.objectToNotNullString(arg1))){
	        throw new Exception();
	    }
	}
	
	public static void assertEqual(Integer arg0, Integer arg1) throws Exception{
	    if(!Common.objectToNotNullString(arg0).equals(Common.objectToNotNullString(arg1))){
            throw new Exception();
        }
	}
	
	public static void assertEqual(Float arg0, Float arg1) throws Exception{
        if(!Common.objectToNotNullString(arg0).equals(Common.objectToNotNullString(arg1))){
            throw new Exception();
        }
    }
	
	public static void assertEqual(Double arg0, Double arg1) throws Exception{
        if(!Common.objectToNotNullString(arg0).equals(Common.objectToNotNullString(arg1))){
            throw new Exception();
        }
    }
	
	public static boolean exist(Object[] array, Object key) {
		if (isNotEmpty(array)) {
			return Arrays.binarySearch(array, key) >= 0;
		}
		return false;
	}
	
	public static boolean notExist(Object[] array, Object key) {
		return !exist(array, key);
	}
	
	public static boolean exist(Collection<?> collection, Object key) {
		if (isNotEmpty(collection)) {
			return Arrays.binarySearch(collection.toArray(), key) >= 0;
		}
		return false;
	}
	
	public static boolean notExist(Collection<?> collection, Object key) {
		return !exist(collection, key);
	}
	
	public static boolean isPrimitive(Object obj) {
		return null != obj ? isPrimitive(obj.getClass()) : false;
	}
	
	@SuppressWarnings("rawtypes")
	public static boolean isPrimitive(Class clazz) {
		return clazz.isPrimitive() 			  	||
				clazz.equals(Integer.class)	  	||
				clazz.equals(Float.class) 	  	||
				clazz.equals(Double.class) 	  	||
				clazz.equals(Long.class) 	  	||
				clazz.equals(String.class) 	  	||
				clazz.equals(Boolean.class)   	||
				clazz.equals(Byte.class) 	  	||
				clazz.equals(Character.class)	||
				clazz.equals(Short.class);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Object fetchProp(Object obj, Object propName) {
		if (null == obj) {
			return null;
		}
		if (obj instanceof Map) {
			return ((Map)obj).get(propName);
		}
		if ((obj instanceof Collection) && (propName instanceof Integer)) {
			return new ArrayList((Collection)obj).get((Integer)propName);
		}
		if (obj.getClass().isArray() && (propName instanceof Integer)) {
			return ((Object[])obj)[(Integer)propName];
		}
		if (isPrimitive(obj)) {
			return obj;
		}
		if (propName instanceof String) {
			String[] propSeq = ((String)propName).split("\\.");
			Object val = null;
			try {
				Field field = obj.getClass().getDeclaredField(propSeq[0]);
				boolean acc = field.isAccessible();
				field.setAccessible(true);
				val = field.get(obj);
				field.setAccessible(acc);
			} catch (Exception e) {
				return null;
			}
			if (propSeq.length > 1) {
				return fetchProp(val, join(Arrays.copyOfRange(propSeq, 1, propSeq.length), "."));
			}
			return val;
		}
		return null;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List<?> fetchProps(Object obj, Object... propNames) {
		List result = new ArrayList();
		if (isNotEmpty(propNames)) {
			for (Object propName : propNames) {
				result.add(fetchProp(obj, propName));
			}
		}
		return result;
	}
	
	public static List<?> fetchProp(List<?> list, Object propName, Object... excludes) {
		List<Object> result = new ArrayList<Object>();
		if (isNotEmpty(list)) {
			for (Object obj : list) {
				Object val = fetchProp(obj, propName);
				if (notExist(excludes, val)) {
					result.add(val);
				}
			}
		}
		return result;
	}
	
	public static List<?> fetchPropExceptNull(List<?> list, Object propName) {
		return fetchProp(list, propName, (Object[]) null);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Map convertBean2Map(Object obj) {
		Map result = new HashMap();
		if (null != obj) {
			try {
				BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
				PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
				for(PropertyDescriptor propertyDescriptor : propertyDescriptors) {
					// filter class property
					String propName = propertyDescriptor.getName();
					if (propName.equals("class")) {
						continue;
					}
					Method readMethod = propertyDescriptor.getReadMethod();
					Object propVal = readMethod.invoke(obj);
					if (!isPrimitive(propVal)) {
						result.put(propName, convertBean2Map(propVal));
						continue;
					}
					result.put(propName, propVal);
				}
			} catch (IntrospectionException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	//Not completed
	@SuppressWarnings({ "rawtypes" })
	public static Object convertMap2Bean(Object obj, Map map) {
		if (null != obj && isNotEmpty(map)) {
			try {
				BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
				PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
				for(PropertyDescriptor propertyDescriptor : propertyDescriptors) {
					String propName = propertyDescriptor.getName();
					Class propClazz = propertyDescriptor.getPropertyType();
					Method readMethod = propertyDescriptor.getReadMethod();
					Method writeMethod = propertyDescriptor.getWriteMethod();
					Object propVal = readMethod.invoke(obj);
					// filter class property
					if (propName.equals("class")) {
						continue;
					}
					if (isPrimitive(propClazz)) {
						if (map.containsKey(propName)) {
							propVal = map.get(propName);
							writeMethod.invoke(obj, propVal);
						}
						continue;
					}
					if (null == propVal) {
						propVal = propClazz.newInstance();
					}
					//writeMethod.invoke(obj, convertMap2Bean(propVal, map));
				}
			} catch (IntrospectionException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			}
		}
		return obj;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Map convertList2Map(List<?> list, Object[] keys, Object[] values) {
		Map result = new HashMap();
		if (isNotEmpty(list) && isNotEmpty(keys)) {
			for (Object obj : list) {
				Object key = keys.length > 1 ? new HashSet(fetchProps(obj, keys)) : fetchProp(obj, keys[0]);
				Object value = isNotEmpty(values) ? (values.length > 1 ? fetchProps(obj, values) : fetchProp(obj, values[0])) : obj;
				result.put(key, value);
			}
		}
		return result;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Map convertList2MultiValueMap(List<?> list, Object[] keys, Object[] values) {
		Map result = new HashMap();
		if (isNotEmpty(list) && isNotEmpty(keys)) {
			for (Object obj : list) {
				Object key = keys.length > 1 ? new HashSet(fetchProps(obj, keys)) : fetchProp(obj, keys[0]);
				Object value = isNotEmpty(values) ? (values.length > 1 ? fetchProps(obj, values) : fetchProp(obj, values[0])) : obj;
				if (result.containsKey(key)) {
					((List)result.get(key)).add(value);
					continue;
				}
				List valueList = new ArrayList(Arrays.asList(value));
				result.put(key, valueList);
			}
		}
		return result;
	}
	
	public static int sum(Collection<Integer> c) {
		if (isEmpty(c)) {
			return 0;
		}
		return sum(new ArrayList<Integer>(c).toArray(new Integer[c.size()]));
	}
	
	public static int sum(Integer[] a) {
		int sum = 0;
		if (isNotEmpty(a)) {
			for(Integer i : a) {
				sum += i;
			}
		}
		return sum;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Object tryMax(Collection c) {
		Object max = null;
		Object t = null;
		if (isNotEmpty(c)) {
			Iterator it = c.iterator();
			while (it.hasNext()) {
				t = it.next();
				if (!(t instanceof Comparable)) {
					continue;
				}
				if (null == max) {
					max = t;
					continue;
				}
				if (!max.getClass().equals(t.getClass())) {
					continue;
				}
				if (((Comparable)max).compareTo(t) < 0) {
					max = t;
				}
			}
		}
		return max;
	}
	
	public static <T extends Comparable<? super T>> T max(Collection<T> c) {
		T max = null;
		T t = null;
		if (isNotEmpty(c)) {
			Iterator<T> it = c.iterator();
			while (it.hasNext()) {
				t = it.next();
				if (null == max || max.compareTo(t) < 0) {
					max = t;
				}
			}
		}
		return max;
	}
	
	public static <T extends Comparable<? super T>> T max(T[] a) {
		T max = null;
		if (isNotEmpty(a)) {
			max = a[0];
			for (int i = 0; i < a.length - 1; i++) {
				if (max.compareTo(a[i+1]) < 0) {
					max = a[i+1];
				}
			}
		}
		return max;
	}
	
	public static <T> T max(List<T> list, Comparator<? super T> c) { 
		T max = null;
		T t = null;
		if (isNotEmpty(list)) {
			Iterator<T> it = list.iterator();
			while (it.hasNext()) {
				t = it.next();
				if (null == max || c.compare(max, t) < 0) {
					max = t;
				}
			}
		}
		return max;
	}
	
	public static class JSONUtil{
        
        private Map<?, ?>   jsonObject  = null;
        private String      json        = null;
        private ResultSet   rs          = null;
        
        public JSONUtil(){}
        
        public JSONUtil(String json){
            refresh(json);
        }
        
        public JSONUtil(InputStream in){
            refresh(in);
        }
        
        public JSONUtil(InputStream in, String charsetName){
            refresh(in, charsetName);
        }
        
        public void refresh(InputStream in){
            refresh(in, null);
        }
        
        public void refresh(InputStream in, String charsetName){
            
            if(null != in){
                
                ByteArrayOutputStream buffer = new ByteArrayOutputStream();
                try {
                    byte[] b    = new byte[1024];
                    int len     = 0;
                    
                    while((len = in.read(b)) != -1){
                        buffer.write(b, 0, len);
                    }
                    
                    if(null != charsetName){
                        json = new String(buffer.toByteArray(), charsetName);
                    }else{
                        json = new String(buffer.toByteArray());
                    }
                    
                    refresh(json);
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        }
        
        public void refresh(String json){
            this.rs         = new ResultSet();
            this.json       = json;
            this.jsonObject = JSON.parseObject(this.json);
        }
        
        public Map<String, String> findValues(String key){
            return isAvailable() ? findValues(jsonObject, key, null).getValues() : null;
        }
        
        public String findValue(String key, int index){
            if( !isAvailable() ){ return null; }
            
            ResultSet rs = findValues(jsonObject, key, null);
            Map<String, String> values = rs.getValues();
            String value = null;
            
            if(index > -1 && index < values.size()){
                List<String> seq = rs.getNameSquence();
                String name = seq.get(index);
                value = values.get(name);
            }
            return value;
        }
        
        public String findValue(String name){
            Object result = findObject(name);
            if(null != result && isText(result)){
                return result.toString();
            }
            return null;
        }
        
        private ResultSet findValues(Map<?, ?> jsonObject, String key, String ancestorName){
            
            for(Entry<?, ?> entry : jsonObject.entrySet()){
                
                if(isOject(entry.getValue())){
                    String name = assembleName(ancestorName, entry.getKey().toString());
                    rs.putAll(findValues((Map<?, ?>)entry.getValue(), key, name));
                    continue;
                }
                
                if(isArray(entry.getValue())){
                    Collection<?> collection = (Collection<?>) entry.getValue();
                    Iterator<?> it = collection.iterator();
                    int count = 0;
                    
                    while(it.hasNext()){
                        Object element = it.next();
                        if(isOject(element)){
                            String name = assembleName(ancestorName, entry.getKey().toString()) + "[" + count + "]";
                            rs.putAll(findValues((Map<?, ?>) element, key, name));
                        }
                        count++;
                    }
                    continue;
                }
                
                if(entry.getKey().equals(key) && isText(entry.getValue())){
                    String name = assembleName(ancestorName, key);
                    rs.put(name, entry.getValue().toString());
                }
            }
            return rs;
        }
        
        private Object findObject(String name){
            if( null == name || "".equals(name) ){ return null; }
            
            String[] tiers = name.split("\\.");
            Object result  = null;
            Map<?, ?> context = this.jsonObject;
            String regex = "\\[\\d*\\]";
            Pattern pattern = Pattern.compile(regex);
            
            for(int i = 0; i < tiers.length; i++){
                String tier = tiers[i];
                Matcher matcher = pattern.matcher(tier);
                
                if(matcher.find()){
                    String matchedStr = matcher.group();
                    String indexStr = matchedStr.replaceAll("\\[", "").replaceAll("\\]", "");
                    String key = tier.replaceAll(regex, "");
                    int index = Integer.parseInt(indexStr);
                    Object obj = context.get(key);
                    
                    if(null == obj || !isArray(obj)){
                        break;
                    }
                    
                    Collection<?> collection = (Collection<?>) obj;
                    if(index < 0 || index >= collection.size()){
                        break;
                    }
                    
                    obj = collection.toArray()[index];
                    if(i == tiers.length - 1){
                        return obj;
                    }
                    
                    if(!isOject(obj)){
                        break;
                    }
                    
                    context = (Map<?,?>) obj;
                }else{
                    
                    if(i == tiers.length - 1){
                        return context.get(tier);
                    }
                    
                    Object obj = context.get(tier);
                    if(null == obj || isText(obj)){
                        break;
                    }
                    
                    context = (Map<?,?>) obj;
                }
            }
            return result;
        }
        
        public String getJSONInfo(){
            return json;
        }
        
        private String assembleName(String ancestorName, String name){
            return ancestorName == null || "".equals(ancestorName) ? name : ancestorName + "." + name;
        }
        
        private boolean isAvailable(){
            return null != json && null != jsonObject;
        }
        
        private boolean isText(Object value){
            return value instanceof String || value instanceof Integer || value instanceof Float || value instanceof Double;
        }
        
        private boolean isOject(Object value){
            return value instanceof Map;
        }
        
        private boolean isArray(Object value){
            return value instanceof Collection;
        }
        
        class ResultSet{
            
            private List<String>        nameSquence = new ArrayList<String>();
            private Map<String, Object> map         = new HashMap<String, Object>();
            
            Map<String, String> getValues(){
                Map<String, String> values = new HashMap<String,String>();
                for(Entry<String, Object> entry : map.entrySet()){
                    values.put(entry.getKey(), entry.getValue().toString());
                }
                return values;
            }
            
            void putAll(ResultSet rs){
                map.putAll(rs.map);
            }
            
            void put(String name, Object value){
                map.put(name, value);
                update(name);
            }
            
            void update(String name){
                nameSquence.add(name);
            }
            
            List<String> getNameSquence(){
                return nameSquence;
            }
        }
        
    }
}
