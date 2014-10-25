/*
 * Kan
 */
package u51ccu9896.shared.controller.request;

import java.io.IOException;

import u51ccu9896.shared.dao.Pagination;
import u51ccu9896.shared.dao.Sorting;
import u51ccu9896.shared.util.BeanUtil;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

// TODO: Auto-generated Javadoc
/**
 * 封装一个HTTP请求的参数。 所有请求参数除业务特有参数之外，均能附加一个JSON字符串，用以接收复杂对象。.
 * 
 * @author KanYong
 */
public abstract class BaseRequest {

	/** The app version. */
	private String appVersion;

	/** 复杂对象，JSON格式字符串. */
	private String complxData;

	/** The start. */
	private Integer start;
	
	/** The limit. */
	private Integer limit;
	
	/** The page. */
	private Integer page;
	
	/** The sort. */
	private String sort;

	/**
	 * Gets the start.
	 *
	 * @return the start
	 */
	public Integer getStart() {
		return start;
	}

	/**
	 * Sets the start.
	 *
	 * @param start            the start to set
	 */
	public void setStart(Integer start) {
		this.start = start;
	}

	/**
	 * Gets the limit.
	 *
	 * @return the limit
	 */
	public Integer getLimit() {
		return limit;
	}

	/**
	 * Sets the limit.
	 *
	 * @param limit            the limit to set
	 */
	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	/**
	 * Gets the page.
	 *
	 * @return the page
	 */
	public Integer getPage() {
		return page;
	}

	/**
	 * Sets the page.
	 *
	 * @param page            the page to set
	 */
	public void setPage(Integer page) {
		this.page = page;
	}

	/**
	 * Gets the sort.
	 *
	 * @return the sort
	 */
	public String getSort() {
		return sort;
	}

	/**
	 * Sets the sort.
	 *
	 * @param sort            the sort to set
	 */
	public void setSort(String sort) {
		this.sort = sort;
	}

	/**
	 * Gets the pagination.
	 *
	 * @return the pagination
	 */
	public Pagination getPagination() {
		return new Pagination(start, limit);
	}

	/**
	 * Gets the sorting.
	 *
	 * @return the sorting
	 */
	public Sorting getSorting() {
		ObjectMapper mapper = new ObjectMapper();
		Sorting.Sort[] sorts = null;
		try {
			sorts = mapper.readValue(sort, Sorting.Sort[].class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Sorting sorting = new Sorting();
		for (int i = 0; i < sorts.length; i++) {
			sorting.addSort(sorts[i].getProperty(), sorts[i].getDirection());
		}

		return sorting;
	}

	/**
	 * Gets the complx data.
	 * 
	 * @return the complx data
	 */
	public String getComplxData() {
		return complxData;
	}

	/**
	 * Sets the complx data.
	 * 
	 * @param complxData
	 *            the new complx data
	 */
	public void setComplxData(String complxData) {
		this.complxData = complxData;
	}

	/**
	 * Gets the app version.
	 * 
	 * @return the appVersion
	 */
	public String getAppVersion() {
		return appVersion;
	}

	/**
	 * Sets the app version.
	 * 
	 * @param appVersion
	 *            the appVersion to set
	 */
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

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
