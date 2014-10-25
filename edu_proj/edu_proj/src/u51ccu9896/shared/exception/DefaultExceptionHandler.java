package u51ccu9896.shared.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.NativeWebRequest;

import u51ccu9896.shared.controller.request.GeneraicResponse;

@ControllerAdvice
public class DefaultExceptionHandler {
	public static final int InvalidResultTypeException = 9000;

	@ExceptionHandler({ InvalidResultTypeException.class })
	@ResponseBody
	public Object processInvalidResultTypeException(NativeWebRequest request,
			InvalidResultTypeException e) {
		GeneraicResponse response = new GeneraicResponse();
		response.setSuccess(false);

		GeneraicResponse.Error error = new GeneraicResponse.Error();
		error.setErrorCode(InvalidResultTypeException);
		error.setErrorMsg("数据库异常");

		response.setError(error);
		return response;
	}

	@ExceptionHandler({ RuntimeException.class })
	@ResponseBody
	public Object defaultRuntimeException(NativeWebRequest request,
			RuntimeException e) {
		GeneraicResponse response = new GeneraicResponse();
		response.setSuccess(false);

		GeneraicResponse.Error error = new GeneraicResponse.Error();
		error.setErrorCode(InvalidResultTypeException);
		error.setErrorMsg(e.getMessage());

		response.setError(error);
		return response;
	}

}
