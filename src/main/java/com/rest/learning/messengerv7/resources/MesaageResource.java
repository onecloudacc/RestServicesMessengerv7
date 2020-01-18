package com.rest.learning.messengerv7.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.learning.messengerv7.model.MessageModel;
import com.rest.learning.messengerv7.service.MessageService;

@Path("messages")
public class MesaageResource {
	MessageService messageService=new MessageService();
	
  @GET
  @Produces(MediaType.APPLICATION_XML)
	public List<MessageModel> getMessage()
	{
		//return "Hello World - Welcome";
	  return messageService.getAllMessagages();
	}
}
