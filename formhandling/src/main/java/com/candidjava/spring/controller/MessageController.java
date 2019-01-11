package com.candidjava.spring.controller;


import com.candidjava.spring.bean.Message;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.candidjava.spring.bean.User;
import java.util.ArrayList;

@Controller
public class MessageController {
	
	Message message = new Message();
        
	@GetMapping("/message-index")
	public ModelAndView create(Message message) {
		return new ModelAndView("messagecreate");
	}

       
	@PostMapping("/createmsg")
	public ModelAndView sendMessage(Message message) {
		ModelAndView model = new ModelAndView("viewmessages");
		// user bean will be automatically binded to view . refer @ModelAttribute
                
                this.message.setData(message.getData());
                this.message.setId(message.getId());
                this.message.setReceiver_id(message.getReceiver_id());
                this.message.setSender_id(message.getSender_id());
		
		return model;
	}
        
        
        @GetMapping("/viewmsg")
	public ModelAndView viewMessage(Message message) {
		ModelAndView model = new ModelAndView("viewmessages");
		// user bean will be automatically binded to view . refer @ModelAttribute
                
                message.setData(this.message.getData());
                message.setId(this.message.getId());
                message.setReceiver_id(this.message.getReceiver_id());
                message.setSender_id(this.message.getSender_id());
		
		return model;
	}
        
        

}
