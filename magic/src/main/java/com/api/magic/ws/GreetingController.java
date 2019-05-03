package com.api.magic.ws;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;


@Controller
public class GreetingController {

	 @MessageMapping("/hello")
	    @SendTo("/topic/hi")
	    public Greeting greeting(HelloMessage message) throws Exception {
	        Thread.sleep(1000); // simulated delay
	        System.out.print("--> Mensage "+message.getName());
	        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
	    }
	
}
