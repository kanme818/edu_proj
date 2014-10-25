/*
 * Kan
 */
package u51ccu9896.shared.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

// TODO: Auto-generated Javadoc
/**
 * The Class BaseModel.
 * 
 * @author kanyong
 */
@MappedSuperclass
public abstract class TimeTrackedModel extends LogicallyDeletableModel {

	/** The create time. */
	@Column(name = "create_time", nullable = false)
	private Date createTime;

	/** The update time. */
	@Column(name = "update_time")
	private Date updateTime;

	/**
	 * Gets the creates the time.
	 * 
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * Sets the creates the time.
	 * 
	 * @param createTime
	 *            the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * Gets the update time.
	 * 
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * Sets the update time.
	 * 
	 * @param updateTime
	 *            the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
