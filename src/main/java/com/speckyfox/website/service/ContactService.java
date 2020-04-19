package com.speckyfox.website.service;

import com.speckyfox.website.dto.ContactDto;
import com.speckyfox.website.repository.ContactRepository;
import com.speckyfox.website.util.ContactDtoToContact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    private ContactRepository contactRepository;
    @Autowired
    ContactService(ContactRepository contactRepository){
        this.contactRepository = contactRepository;
    }
    public String addContact(ContactDto contactDto){
        System.out.println(contactDto.getEmail());
        contactRepository.save(ContactDtoToContact.convertDto(contactDto));
        return "Contact Form Data Are Saved Successfully";
    }
}
