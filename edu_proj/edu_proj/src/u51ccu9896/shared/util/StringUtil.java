/*
 * Kan
 */
package u51ccu9896.shared.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

// TODO: Auto-generated Javadoc
/**
 * 字符串处理帮助类.
 * 
 * @author KanYong
 */
public class StringUtil {

	/** The Constant mapper. */
	public static final ObjectMapper mapper = new ObjectMapper();

	/**
	 * 将数字填充至指定长度，并附加前缀.
	 * 
	 * @param prefix
	 *            - 前缀
	 * @param length
	 *            - 指定长度 （包含前缀长度）
	 * @param character
	 *            - 填充字符
	 * @param value
	 *            - 被填充数字
	 * @return the string
	 */
	public static String leftPaddingString(String prefix, int length,
			String character, int value) {
		if (prefix == null) {
			prefix = "";
		}
		int fillLength = length - prefix.length();
		return prefix
				+ String.format("%1$" + character + fillLength + "d", value);
	}

	/**
	 * 将对象转成JSON字符串。.
	 * 
	 * @param obj
	 *            the obj
	 * @return JSON字符串
	 * @throws JsonProcessingException
	 *             the json processing exception
	 */
	public static String objectToJSON(Object obj)
			throws JsonProcessingException {
		return mapper.writeValueAsString(obj);
	}

	/**
	 * 将JSON转成对象。.
	 * 
	 * @param <T>
	 *            the generic type
	 * @param json
	 *            the json
	 * @param clazz
	 *            the clazz
	 * @return the object
	 * @throws Exception
	 *             the exception
	 */
	public static <T> Object jsonToObject(String json, Class<T> clazz)
			throws Exception {
		return mapper.readValue(json, clazz);
	}
}
