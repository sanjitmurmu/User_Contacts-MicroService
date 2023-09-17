package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{

	List<Contact> contactList = List.of(
			new Contact(1L, "max@gmail.com", "Gourav", 1521L),
			new Contact(2L, "rafa@gmail.com", "Arka", 1521L),
			new Contact(3L, "nex@gmail.com", "Jishnu", 1529L),
			new Contact(4L, "abhi@gmail.com", "abhi", 1524L),
			new Contact(5L, "biplob@gmail.com", "Biplob", 1524L)
			);
	
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		return contactList.stream().filter(contact-> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
