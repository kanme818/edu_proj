/*
 * Kan
 */
package u51ccu9896.shared.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * 测试BaseDao用的Model.
 *
 * @author KanYong
 */
@Entity
@Table(name = "yield_test_basedao")
public class TestBaseDaoModel {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	/** The col0. */
	@Column(name = "col0")
	private String col0;

	/** The col1. */
	@Column(name = "col1")
	private int col1;

	/** The col2. */
	@Column(name = "col2")
	private int col2;

	/** The col3. */
	@Column(name = "col3")
	private int col3;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the col0.
	 *
	 * @return the col0
	 */
	public String getCol0() {
		return col0;
	}

	/**
	 * Sets the col0.
	 *
	 * @param col0            the col0 to set
	 */
	public void setCol0(String col0) {
		this.col0 = col0;
	}

	/**
	 * Gets the col1.
	 *
	 * @return the col1
	 */
	public int getCol1() {
		return col1;
	}

	/**
	 * Sets the col1.
	 *
	 * @param col1            the col1 to set
	 */
	public void setCol1(int col1) {
		this.col1 = col1;
	}

	/**
	 * Gets the col2.
	 *
	 * @return the col2
	 */
	public int getCol2() {
		return col2;
	}

	/**
	 * Sets the col2.
	 *
	 * @param col2            the col2 to set
	 */
	public void setCol2(int col2) {
		this.col2 = col2;
	}

	/**
	 * Gets the col3.
	 *
	 * @return the col3
	 */
	public int getCol3() {
		return col3;
	}

	/**
	 * Sets the col3.
	 *
	 * @param col3            the col3 to set
	 */
	public void setCol3(int col3) {
		this.col3 = col3;
	}

}
