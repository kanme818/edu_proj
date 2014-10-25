/*
 * Kan
 */
package u51ccu9896.shared.controller.request;

// TODO: Auto-generated Javadoc
/**
 * The Class GeneraicResponse.
 * 
 * @author KanYong
 */
public class GeneraicResponse {

	/**
	 * The Interface Code.
	 * 
	 * @author server
	 */
	public interface Code {

		/** The internal error. */
		int INTERNAL_ERROR = 500;
	}

	/**
	 * The Interface Message.
	 * 
	 * @author server
	 */
	public interface Message {

		/** The ERRO r_500. */
		String ERROR_500 = "服务器内部错误!";
	}

	/**
	 * Instantiates a new generaic response.
	 */
	public GeneraicResponse() {
		super();
	}

	/** The code. */
	private Boolean success;

	/** The data. */
	private Object data;

	/** The error. */
	private GeneraicResponse.Error error;

	/**
	 * Gets the error.
	 *
	 * @return the error
	 */
	public GeneraicResponse.Error getError() {
		return error;
	}

	/**
	 * Sets the error.
	 *
	 * @param error            the error to set
	 */
	public void setError(GeneraicResponse.Error error) {
		this.error = error;
	}

	/**
	 * Gets the success.
	 *
	 * @return the success
	 */
	public Boolean getSuccess() {
		return success;
	}

	/**
	 * Sets the success.
	 *
	 * @param success            the success to set
	 */
	public void setSuccess(Boolean success) {
		this.success = success;
	}

	/**
	 * Gets the data.
	 *
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * Sets the data.
	 *
	 * @param data            the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * The Class Error.
	 */
	public static class Error {
		
		/** The error msg. */
		private String errorMsg;
		
		/** The error code. */
		private Integer errorCode;

		/**
		 * Gets the error msg.
		 *
		 * @return the errorMsg
		 */
		public String getErrorMsg() {
			return errorMsg;
		}

		/**
		 * Sets the error msg.
		 *
		 * @param errorMsg            the errorMsg to set
		 */
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}

		/**
		 * Gets the error code.
		 *
		 * @return the errorCode
		 */
		public Integer getErrorCode() {
			return errorCode;
		}

		/**
		 * Sets the error code.
		 *
		 * @param errorCode            the errorCode to set
		 */
		public void setErrorCode(Integer errorCode) {
			this.errorCode = errorCode;
		}

	}

}
