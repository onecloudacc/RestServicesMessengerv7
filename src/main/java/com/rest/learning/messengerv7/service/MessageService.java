package com.rest.learning.messengerv7.service;

import java.util.ArrayList;
import java.util.List;

import com.rest.learning.messengerv7.model.MessageModel;

public class MessageService {

	public List<MessageModel> getAllMessagages()
	{
		MessageModel m1= new MessageModel(1L,"Hello World","Rajesh");
		MessageModel m2= new MessageModel(2L,"Hello Jersey", "Rajesh");
		
		List<MessageModel> list=new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
		
	}
}
