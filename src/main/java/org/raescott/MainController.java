package org.raescott;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Richard Scott Smith <scott.smith@isostech.com>
 */
@Controller
@RequestMapping(value = "/")
public class MainController {
	@RequestMapping(value = "unsecured")
	public String unsecured(Model model) {
		return "unsecured";
	}

	@RequestMapping(value = "secured")
	public String secured(Model model) {
		return "secured";
	}

	@RequestMapping(value = "oauth-secured")
	public String oauthSecured(Model model) {
		return "oauth-secured";
	}
}
