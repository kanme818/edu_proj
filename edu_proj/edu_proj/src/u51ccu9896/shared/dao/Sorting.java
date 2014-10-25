/*
 * Kan
 */
package u51ccu9896.shared.dao;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Sorting.
 */
public class Sorting {
	/** 数据库排序升序. */
	public static final String SORT_ASC = "ASC";

	/** 数据库排序降序. */
	public static final String SORT_DESC = "DESC";

	/** The sorts. */
	private List<Sorting.Sort> sorts = new ArrayList<>();

	/**
	 * Instantiates a new sorting.
	 */
	public Sorting() {
		super();
	}

	/**
	 * Instantiates a new sorting.
	 *
	 * @param property the property
	 * @param direction the direction
	 */
	public Sorting(String property, String direction) {
		super();
		addSort(property, direction);
	}

	/**
	 * Adds the sort.
	 *
	 * @param property the property
	 * @param direction the direction
	 */
	public void addSort(String property, String direction) {
		Sorting.Sort sort = new Sorting.Sort(property, direction);
		this.sorts.add(sort);
	}

	/**
	 * Gets the sorts.
	 *
	 * @return the sorts
	 */
	public List<Sorting.Sort> getSorts() {
		return sorts;
	}

	/**
	 * Sets the sorts.
	 *
	 * @param sorts            the sorts to set
	 */
	public void setSorts(List<Sorting.Sort> sorts) {
		this.sorts = sorts;
	}

	/**
	 * The Class Sort.
	 */
	public static class Sort {
		
		/** The property. */
		private String property;

		/** The direction. */
		private String direction;

		/**
		 * Instantiates a new sort.
		 *
		 * @param property the property
		 * @param direction the direction
		 */
		public Sort(String property, String direction) {
			super();
			this.property = property;
			this.direction = direction;
		}

		/**
		 * Instantiates a new sort.
		 */
		public Sort() {
			super();
		}

		/**
		 * Gets the property.
		 *
		 * @return the property
		 */
		public String getProperty() {
			return property;
		}

		/**
		 * Sets the property.
		 *
		 * @param property            the property to set
		 */
		public void setProperty(String property) {
			this.property = property;
		}

		/**
		 * Gets the direction.
		 *
		 * @return the direction
		 */
		public String getDirection() {
			return direction;
		}

		/**
		 * Sets the direction.
		 *
		 * @param direction            the direction to set
		 */
		public void setDirection(String direction) {
			this.direction = direction;
		}

	}

}
