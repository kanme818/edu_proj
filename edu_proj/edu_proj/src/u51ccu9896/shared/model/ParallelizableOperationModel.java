/*
 * Kan
 */
package u51ccu9896.shared.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

// TODO: Auto-generated Javadoc
/**
 * The Class BaseModel.
 * 
 * @author kanyong
 */
@MappedSuperclass
public abstract class ParallelizableOperationModel extends TimeTrackedModel {
	
	/** The lock version. */
	@Version
	@Column(name = "lock_version", nullable = false)
	private Integer lockVersion;

	/**
	 * Gets the lock version.
	 *
	 * @return the lockVersion
	 */
	public Integer getLockVersion() {
		return lockVersion;
	}

}
