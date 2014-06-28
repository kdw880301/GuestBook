package guestbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GuestBookController {
	@RequestMapping("/spring")
	public ModelAndView guestBookCntrl() {
		String msg = "???";
		return new ModelAndView("spring", "message", msg);
	}

}
