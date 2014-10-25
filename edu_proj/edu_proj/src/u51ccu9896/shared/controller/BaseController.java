/*
 * Kan
 */
package u51ccu9896.shared.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

// TODO: Auto-generated Javadoc
/**
 * Controller基类。.
 * 
 * @author KanYong
 */
public abstract class BaseController {

	/** The logger. */
	protected Logger logger = Logger.getLogger(this.getClass());

	/** The servlet context. */
	@Autowired(required = false)
	private ServletContext servletContext;

	/** The session. */
	@Autowired(required = false)
	private HttpSession session;

	/** The request. */
	@Autowired(required = false)
	private HttpServletRequest request;

	/**
	 * Gets the servlet context.
	 * 
	 * @return the servletContext
	 */
	protected ServletContext getServletContext() {
		return servletContext;
	}

	/**
	 * Gets the session.
	 * 
	 * @return the session
	 */
	protected HttpSession getSession() {
		return session;
	}

	/**
	 * Gets the request.
	 * 
	 * @return the request
	 */
	protected HttpServletRequest getRequest() {
		return request;
	}

}
