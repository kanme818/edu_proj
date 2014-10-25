/*
 * Kan
 */
package u51ccu9896.shared.dao;

// TODO: Auto-generated Javadoc
/**
 * The Class Pagination.
 */
public class Pagination {
	
	/** The start. */
	private Integer start = -1;
	
	/** The limit. */
	private Integer limit = -1;
	
	/** The page. */
	private Integer page = -1;

	/**
	 * Instantiates a new pagination.
	 */
	public Pagination() {
	}

	/**
	 * Instantiates a new pagination.
	 *
	 * @param start the start
	 * @param limit the limit
	 */
	public Pagination(Integer start, Integer limit) {
		super();
		this.start = start;
		this.limit = limit;
	}

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

}
