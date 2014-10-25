/*
 * Kan
 */
package u51ccu9896.system.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import u51ccu9896.system.dto.ServiceTrackDisplay;

// TODO: Auto-generated Javadoc
/**
 * The Class SystemServiceImpl.
 *
 * @author KanYong
 */
@Service
public class SystemServiceImpl implements ISystemService {
	
	/** The logger. */
	protected Logger logger = Logger.getLogger(this.getClass());

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * www.lincoinfo.com.common.service.ISystemService#trackBusinessServiceAccess
	 * ()
	 */
	@Override
	public void trackBusinessServiceAccess(ServiceTrackDisplay data) {
		logger.info("log service call to db with user " + data.getUser()
				+ " and resource " + data.getRequestResource());
	}

}
