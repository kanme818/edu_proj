/*
 * Kan
 */
package u51ccu9896.system.service;

import u51ccu9896.system.dto.ServiceTrackDisplay;

// TODO: Auto-generated Javadoc
/**
 * 提供系统基础服务.
 * 
 * @author Kan Yong
 */

public interface ISystemService {

	/**
	 * 记录业务Service访问日志.
	 * 
	 * @param data
	 *            the data
	 */
	public void trackBusinessServiceAccess(ServiceTrackDisplay data);

}
