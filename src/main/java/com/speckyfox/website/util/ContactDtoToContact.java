package com.speckyfox.website.util;

import com.speckyfox.website.dto.ContactDto;
import com.speckyfox.website.model.Contact;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ContactDtoToContact {
    public static Contact convertDto(ContactDto contactDto){
        Contact contact = new Contact();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        contact.setEmail(contactDto.getEmail());
        contact.setSubject(contactDto.getSubject());
        contact.setMessage(contactDto.getMessage());
        contact.setCreated(new Date());
        return contact;
    }
}
