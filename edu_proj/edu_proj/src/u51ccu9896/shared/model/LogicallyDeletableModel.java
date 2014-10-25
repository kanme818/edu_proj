/*
 * Kan
 */
package u51ccu9896.shared.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import u51ccu9896.shared.constant.DataConstant;

// TODO: Auto-generated Javadoc
/**
 * The Class BaseModel.
 * 
 * @author kanyong
 */
@MappedSuperclass
public abstract class LogicallyDeletableModel {
	
	/** The in use. */
	@Column(name = "in_use", nullable = false)
	private Boolean inUse = DataConstant.DeletedStatus.INUSE;

	/**
	 * Gets the in use.
	 *
	 * @return the inUse
	 */
	public Boolean getInUse() {
		return inUse;
	}

	/**
	 * Sets the in use.
	 *
	 * @param inUse            the inUse to set
	 */
	public void setInUse(Boolean inUse) {
		this.inUse = inUse;
	}

}
