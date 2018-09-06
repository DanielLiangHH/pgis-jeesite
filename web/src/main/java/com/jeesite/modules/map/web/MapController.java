/*   
 * JeeSite Boot:com.jeesite.modules.map.web.MapController
 */
package com.jeesite.modules.map.web;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeesite.common.web.BaseController;

/**
 * @author Daniel Liang
 * @date 2018年7月25日 下午11:52:22
 * @version 1.0
 * @description:
 * 
 */
@Controller
@RequestMapping(value = "${adminPath}/map")
public class MapController extends BaseController {

	@RequiresPermissions("user")
	@RequestMapping(value = "index")
	public String indexMap(Model model) {
		return "modules/map/indexMap";
	}

}
