/*
 * Kan
 */
package u51ccu9896.shared.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.modelmapper.ModelMapper;

// TODO: Auto-generated Javadoc
/**
 * The Class BeanUtil.
 * 
 * @author kanyong
 */
public class BeanUtil {

	/**
	 * Bean copy.
	 * 
	 * @param from
	 *            the target
	 * @param to
	 *            the source
	 */
	public static void beanCopy(Object from, Object to) {
		try {
			BeanUtils.copyProperties(to, from);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Bean mapper.
	 *
	 * @param <TO> the generic type
	 * @param from the from
	 * @param to the to
	 * @return the to
	 */
	public static <TO> TO beanMapper(Object from, Class<TO> to) {
		ModelMapper modelMapper = new ModelMapper();
		TO objTo = modelMapper.map(from, to);
		return objTo;
	}

	/**
	 * List copy.
	 *
	 * @param <T>            the generic type
	 * @param <S>            the generic type
	 * @param sourceList            the source list
	 * @param clazz            the clazz
	 * @return the list
	 */
	public static <T, S> List<T> listCopy(List<S> sourceList, Class<T> clazz) {
		List<T> targetList = new ArrayList<>();
		for (S source : sourceList) {
			try {
				T target = clazz.newInstance();
				beanCopy(target, source);
				targetList.add(target);
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return targetList;
	}
}
