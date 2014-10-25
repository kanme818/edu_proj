/*
 * Kan
 */
package u51ccu9896.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import u51ccu9896.shared.controller.BaseController;
import u51ccu9896.shared.controller.request.GeneraicResponse;
import u51ccu9896.shared.controller.request.SuccessResponse;
import u51ccu9896.system.service.ISystemService;

// TODO: Auto-generated Javadoc
/**
 * The Class SystemController.
 *
 * @author KanYong
 */
@Controller
public class SystemController extends BaseController {

	/** The service. */
	@Autowired
	ISystemService service;

	/**
	 * 心跳.
	 *
	 * @return the object
	 */
	@RequestMapping(value = "/heartBeat")
	@ResponseBody
	public Object heartBeat() {
		GeneraicResponse res = new SuccessResponse();
		return res;
	}

}
