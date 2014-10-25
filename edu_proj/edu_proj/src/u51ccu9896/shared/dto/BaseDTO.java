/*
 * Kan
 */
package u51ccu9896.shared.dto;

import u51ccu9896.shared.util.BeanUtil;

// TODO: Auto-generated Javadoc
/**
 * The Class BaseDTO.
 * 
 * @author kanyong
 */
public abstract class BaseDTO {

	/**
	 * Convert.
	 * 
	 * @param <TO>
	 *            the generic type
	 * @param from
	 *            the from
	 * @param to
	 *            the to
	 * @return the to
	 */
	public static <TO> TO convert(Object from, Class<TO> to) {
		TO objTo = BeanUtil.beanMapper(from, to);
		return objTo;
	}

}
